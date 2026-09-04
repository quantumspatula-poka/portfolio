package zofia.nea

import scalatags.Text
import scalatags.Text.all.*

object MainPage {

  def withMainDiv(fragment: Modifier): Text.TypedTag[String] = {
    html(
      head(
        title := "Nea project",
        script(
          src := "https://cdn.jsdelivr.net/npm/htmx.org@2.0.10/dist/htmx.min.js",
          integrity := "sha384-H5SrcfygHmAuTDZphMHqBJLc3FhssKjG7w/CeCpFReSfwBWDTKpkzPP8c+cLsK+V",
          crossorigin := "anonymous",
          
        )
      ),
      body(
        div(
          id := "body",
          fragment
        )
      )
    )
  }
}
