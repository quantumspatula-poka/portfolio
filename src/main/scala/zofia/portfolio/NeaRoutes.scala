package zofia.portfolio

import cats.effect.Sync
import cats.syntax.all.*
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl
import org.http4s.scalatags.*

object NeaRoutes:

  def apply[F[_] : Sync](): HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(IndexPage.content).pure[F].flatMap(Ok(_))
      case GET -> Root / "tarot" =>
        MainPage.withMainDiv(TarotProjectPage.content).pure[F].flatMap(Ok(_))
      case GET -> Root / "poka&neo" =>
        MainPage.withMainDiv(PokaNeoProjectPage.content).pure[F].flatMap(Ok(_))
      case GET -> Root / "insanity" =>
        MainPage.withMainDiv(InsanityProjectPage.content).pure[F].flatMap(Ok(_))
    }