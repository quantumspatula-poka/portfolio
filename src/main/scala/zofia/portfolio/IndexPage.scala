package zofia.portfolio

import scalatags.Text
import scalatags.Text.all.*

object IndexPage {

  val content: Text.TypedTag[String] = body(
    div(
      id := "body",
      p("Welcome to the main page"),
      p("Please note that all my artworks are watermarked and have had noise applied to make it harder to train AI using it. Thank you for your understanding"),
      button(attr("hx-get") := "/tarot", attr("hx-target") := "#area", "link"),
      div(id := "area")
    )
  )
}
