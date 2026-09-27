package zofia.portfolio

import scalatags.Text.all.*

object PokaNeoProjectPage {

  val content = body(
    div(
      id := "body",
      p(
        """
          |This is for the project that involved poka and neo (those two characters i did a lot about).
          |Yes i know theres nothing here. Im working on it. I just havent put all the work here yet.""".stripMargin)
    )
  )
}
