package zofia.portfolio

import scalatags.Text.all.*

object TarotProjectPage {

  val content = body(
    div(
      id := "body",
      h1("The tarot project - redesigning the 22 cards of the major arcana of a tarot deck"),
      h3("(except i only ended up doing half of them because i ran out of time)"),
      p("In this project, i created human designs and other artworks of 10 tarot cards from the major arcana. They are sorted here in ascending order, with a few additional artworks towards the end."),
      br(),
      h3("0 - The Fool"),
      p(
        """The Fool, also known as Folly or The Crocodile is the first card of the major arcana of the tarot deck.
          |Most interpret it as signifying new beginnings, infinite potential, innocence, trust and faith, lack of ego and the ability to take risks.
          |Some symols that are typically associated with that are lambs, lotuses, sunrises and the infinity symbol, as well as quite pale and pastel colours, so i tried to go in that direction with my design.
          |I came up with 5 design ideas, and although i tried to keep them relatively distinct and different, they do all share the same childlike proportions and a similar silhouette, as i thought it fit the character the best.
          |I eventually settled on combining aspects from my favourite designs into one final idea, and i think it turned out exactly how i imagined it.""".stripMargin),
      img(src := "assets/images/theFoolIdeas.png", alt := "The Fool ideas", width := "1900"),
      p("Fool design ideas"),
      img(src := "assets/images/theFoolTurnaround.png", alt := "The Fool turnaround", width := "1300"),
      p("Full character turnaround and closeups"),
      img(src := "assets/images/theFoolDesign.png", alt := "The Fool design", width := "800"),
      img(src := "assets/images/theFoolPlan.png", alt := "The Fool plan", width := "800"),
      p("Finished design render and final artwork plan"),
      img(src := "assets/images/theFoolFinal.png", alt := "The Fool final artwork", width := "1000"),
      p("The Fool final poster"),
    )
  )
}
