package zofia.portfolio

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  val run = NeaServer.run[IO]
