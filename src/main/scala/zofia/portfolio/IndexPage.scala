package zofia.portfolio

import scalatags.Text
import scalatags.Text.all.{a, *}

object IndexPage {

  val content: Text.TypedTag[String] = body(
    div(
      id := "body",
      p("Welcome to the main page"),
      p(
        """
          |Please note that all my artworks are watermarked and have had noise applied to make it harder to train AI using it. 
          |Thank you for your understanding""".stripMargin),
      br(),
      p(
        """
          |There are multiple projects contained here, so i will give a quick run down of what each one is that way its easy to find what you are looking for.
          |The tarot project is the one where i created human designs for the tarot cards of the major arcana, which was the first project i did.
          |The poka and neo project was when i did work on 2 specific characters with comic strips and storyboarding mainly, which was my second project.
          |The insanity project is the current working name of my ongoing project that has more abstract and chaotic art. 
          |If youre looking for my recent work, thats where it is.""".stripMargin),
      a(href := "/tarot", button("Tarot project page")),
      br(),
      a(href := "/poka&neo", button("Poka and neo project page")),
      br(),
      a(href := "/insanity", button("Insanity project page"))
      //button(attr("hx-get") := "/tarot", attr("hx-target") := "#area", "link"),
      //div(id := "area")
    )
  )
}
