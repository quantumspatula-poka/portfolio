package zofia.portfolio

import cats.effect.*
import org.http4s.server.Router
import com.comcast.ip4s.*
import fs2.io.file.Files
import fs2.io.net.Network
import org.http4s.ember.client.EmberClientBuilder
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.implicits.*
import org.http4s.server.middleware.Logger
import org.http4s.server.staticcontent.*

object NeaServer:

  def run[F[_] : Async : Network : Files]: F[Nothing] = {
    for {
      client <- EmberClientBuilder.default[F].build

      // Combine Service Routes into an HttpApp.
      // Can also be done via a Router if you
      // want to extract segments not checked
      // in the underlying routes.
      httpApp = (
        Router(
          "" -> NeaRoutes(),
          "assets" -> resourceServiceBuilder[F]("./assets").toRoutes)
        ).orNotFound

      // With Middlewares in place
      finalHttpApp = Logger.httpApp(true, true)(httpApp)

      _ <-
        EmberServerBuilder.default[F]
          .withHost(ipv4"0.0.0.0")
          //.withHost(ipv4"192.168.0.24")
          .withPort(port"8080")
          .withHttpApp(finalHttpApp)
          .build
    } yield ()
  }.useForever
