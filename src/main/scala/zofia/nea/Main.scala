package zofia.nea

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  val run = NeaServer.run[IO]
