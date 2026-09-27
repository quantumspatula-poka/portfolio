package zofia.portfolio

import scalatags.Text.all.*

object InsanityProjectPage {

  val content = body(
    div(
      id := "body",
      h1("Insanity"),
      h3("(current working title"),
      p(
        """
          |This project is more abstract than all my previous ones and the best way i can describe it is insanity and exploring thoughts and mindsets and mental states through art.
          |A lot of the work in this project is inspired by music, so i have linked 2 spotify playlists that i took most of my inspiration from,
          |and individual artworks with specific music inspiration will also have links to the relevant song.
          |All the work is ordered in chronological order with newest artworks at the top""".stripMargin),
      a(href := "https://open.spotify.com/playlist/0ZT8fBRBPZjLfaJpRG0tUj?si=959af13f521f482a", "Chaotic insanity playlist"),
      br(),
      a(href := "https://open.spotify.com/playlist/4CVNm2nLwTJ3V3MAxoWE3H?si=a68d7aca881940b3", "Liminal insanity playlist"),
      br(),
      h3("Typewriter animation"),
      p("Date: 12-current/09/2026, Time taken: 7.5h for the model art, at least 15h for the rigging (work in progress)"),
      p(
        """
          |This animation was a much longer project than all my previous ones, because it involves 4 separate models that come together to make one animation.
          |Each model has to be cut up into the correct layers and then rigged each one individually, that way i can animate them all using live 2d.
          |Currently only 3/4 models are fully rigged, with one last one left to do, and after that i will have to set up the keyforms in the animation
          |editor and then edit all the individual clips of animation to make one full complete animation. I suspect this project might take another week or so
          |hopefully if all goes well. It is a lot of work so in order to showcase that i will also display updates of my progress. Here is a current showcase
          |of the 3 models that i already have complete.""".stripMargin),
      video(src := "assets/images/teacherShowcase.mp4", attr("controls") := "", width := "800"),
      video(src := "assets/images/robotShowcase.mp4", attr("controls") := "", width := "800"),
      video(src := "assets/images/cosmicEntityShowcase.mp4", attr("controls") := "", width := "800"),
      br(),
      h3("hell for the lost"),
      p("Date: 16/09/2026, Time taken: 1h"),
      p(
        """
          |This artwork takes quite a lot of inspiration from a psychological horror minecraft video that approaches the game like a storytelling device
          |rather than just a video game, which is something i agree with quite a lot. In my opinion the video is a work of art in itself and i wanted to
          |take inspiration from the ideas and concepts in the video and use it to create this. I also took inspiration from some of the minecraft soundtracks
          |made by C418 like Mellohi, Moog City and Aria Math. Like with most of my recent work, this was made by layering a lot of images with heavy distortion,
          |a lot of visual effects and combinations of blending modes, as well as incorporating some text as its something that resonates with me really strongly.""".stripMargin),
      a(href := "https://youtu.be/qfMB9a7lC4o?si=vfoPMa4JL0qcYnq0", "Link to the video that inspired me (I Survived 100 Days in Minecraft’s End Barrens by Wato1876)"),
      br(),
      a(href := "https://open.spotify.com/track/0jBYLXiEe81YgAs6ZAPXYX?si=d9a28ff43987410e", "Link to Mellohi by C418"),
      br(),
      a(href := "https://open.spotify.com/track/3wmvHdag2I7BpHCtWoiV9w?si=d344dc9870da499f", "Link to Moog City by C418"),
      br(),
      a(href := "https://open.spotify.com/track/6VK8OMA2FhX4KoS3QCH7rL?si=858e7d755dd045be", "Link to Aria Math by C418"),
      br(),
      img(src := "assets/images/hellForTheLost.png", alt := "hell for the lost", width := "700"),
      br(),
      h3("Recycling plant"),
      p("Date: 14-15/09/2026, Time taken: 1h total"),
      p(
        """
          |This is not one but multiple artworks that i group into one because they are all pretty similar.
          |I essentially took old artworks that i made in the past and breathed new life into them by distorting them and transforming them to closer match
          |the style my work currently has. I think some turned out better than others but it was an interesting experiment nonetheless.""".stripMargin),
      img(src := "assets/images/neitherWolfNorRam.png", alt := "neither wolf nor ram", width := "700"),
      img(src := "assets/images/angelOfDeath.png", alt := "angel of death", width := "700"),
      img(src := "assets/images/teaPartyAtThePrologue.png", alt := "Tea Party at the prologue", width := "700"),
      img(src := "assets/images/warIsNotTheEnd.png", alt := "war is not the End", width := "700"),
      img(src := "assets/images/whenFallingIntoDepths.png", alt := "When falling into depths", width := "700"),
      br(),
      h3("Snake de minuit"),
      p("Date: 14/09/2026, Time taken: 1h"),
      p(
        """
          |A short and simple animation focusing on testing a character design idea and experimenting with glitchy visual effects in combination with blending modes.""".stripMargin),
      video(src := "assets/images/snakeDeMinuit.mp4", width := "1000", attr("controls") := ""),
      br(),
      h3("The Meat Grinder"),
      p("Date: 29-31/08/2026, Time taken: 5h"),
      p(
        """
          |This animation was entirely inspired by one singular music, THE MEAT GRINDER by japanesecoffee, that i essentially recreated as how i imagine it visually.
          |I created 3 slightly distinct versions of it that have a different blending mode overlayed on each; normal, analogue horror and distorted nightmare.
          |I have also synced the music into the animation so please watch with sound enabled for the full experience.""".stripMargin),
      a(href := "https://open.spotify.com/track/2HKzjI21jRSjVarDs4XfVo?si=ef8c32f2527541e0", "Link to THE MEAT GRINDER by japanesecoffee"),
      br(),
      video(width := "600", attr("controls") := "", src := "assets/images/theMeatGrinderNormal.mov", `type` := "video.mov"),
      video(src := "assets/images/theMeatGrinderHm.mov", attr("controls") := "", width := "600"),
      video(src := "assets/images/theMeatGrinderD.mov", attr("controls") := "", width := "600"),
      br(),
      h3("Spirit"),
      p("Date: 02-26/08/2026, Time taken: 3h for the model art and around 10-15h for the rigging"),
      p(
        """
          |This project was very different from all my others because its a live 2d model, which is a method of animating flat 2d images
          |to make a pseudo 3d model without redrawing frame by frame or actual 3d modelling. It is done by splitting the art into hundreds of separate layers
          |for every part of the drawing (for example top eyelid, bottom eyelid, iris, pupil, highlight, etc) and creating complex polygonal meshes for each artwork.
          |Then each part of the drawing can be animated separately, also called rigging. They are assigned to specific parameters like blink, mouth open, head tilt
          |and so on, and each deformed individually to give a complete model that can be used to make animations easily or track a human and sync with them
          |to move in real time. I created one of these models myself, although mine is quite different from the typically human looking models that people
          |usually make, but i think its design fits more with my current project and looks very unique.""".stripMargin),
      video(src := "assets/images/spiritTest1.mp4", attr("controls") := "", width := "800"),
      video(src := "assets/images/spiritTest2.mp4", attr("controls") := "", width := "800"),
      br(),
      h3("Eleutheromania"),
      p("Date: 25/08/2026, Time taken: 4h"),
      p(
        """
          |The word eleutheromania means a strong and irrepressible desire for freedom, which is the feeling i wanted to represent in this animation.
          |It was made by animating the base structure but then using real photos for the textures of every element, as a sort of animated digital collage.""".stripMargin),
      video(src := "assets/images/eleutheromania.mp4", attr("controls") := "", width := "700"),
      br(),
      h3("Rodents"),
      p("Date: 19/08/2026, Time taken: 1.5h"),
      p(
        """
          |I used pixel art for this animation loop and layering images and text to create a low quality distorted effect.""".stripMargin),
      video(src := "assets/images/rodents.mp4", attr("controls") := "", attr("autoplay") := "", attr("muted") := "", attr("loop") := "", width := "800"),
      br(),
      h3("Neon Death"),
      p("Date: 14/08/2026, Time taken: 3.5h"),
      p(
        """
          |This animation was made by layering 2 separate artworks and combining them using different combinations of blending modes at every frame
          |for a chaotic and glitchy appearance""".stripMargin),
      video(src := "assets/images/neonDeath.mp4", attr("controls") := "", attr("autoplay") := "", attr("muted") := "", attr("loop") := "", width := "700"),
      br(),
      h3("maybe next time"),
      p("Date: 12/08/2026, Time taken: 3h"),
      p(
        """This was the first time i tried experimenting with using different blending modes and overlaying images for more complex and convoluted appearance
          |to the background and more moving elements in the animation.""".stripMargin),
      video(src := "assets/images/maybeNextTime.mp4", attr("controls") := "", width := "800"),
      br(),
      h3("Reaching for the sky"),
      p("Date: 07/08/2026, Time taken: 1.5h"),
      p("This artwork was made using different more experimental brushes than usual and text overlays for visual interest."),
      img(src := "assets/images/reachingForTheSky.png", alt := "reaching for the sky", width := "700"),
      br(),
      h3("but the world did not want that for me"),
      p("Date: 17/07/2026, Time taken: 2h"),
      p(
        """This artwork was made to symbolise the lassitude and weariness of having to accept life and its constraints on a person,
          |that there are some things that life wont allow you and theres nothing you can do about it other than accept it.
          |The style i used for this piece is a litle different from my usual one, a bit less stylised and more detailed shading and reflections.""".stripMargin),
      img(src := "assets/images/theWorldDidNotWantThatForMe.png", alt := "but the world did not want that for me", width := "1000"),
      br(),
      h3("Dont be scared"),
      p("Date: 01/07/2026, Time taken: 3.5h"),
      p("This artwork was another one in the series of works that are made up of many strange seemingly mismatched elements and layered textures."),
      video(src := "assets/images/dontBeScared.mp4", attr("controls") := "", attr("autoplay") := "", attr("muted") := "", attr("loop") := "", width := "1000"),
      br(),
      h3("oyasumi"),
      p("Date: 30/06/2026, Time taken: 3h"),
      p(
        """Oyasumi (おやすみ in japanese) means goodnight, and its also in the chorus of a song, My Time by bo en, that i used as inspiration for this artwork. It seems to have themes
          |of night, dreams and waking up at the end of a nightmare.""".stripMargin),
      a(href := "https://open.spotify.com/track/4TWcfG5wpqC1jx8zRyk92n?si=034e33b6e44040ad", "Link to My Time by bo en"),
      br(),
      video(src := "assets/images/oyasumi.mp4", attr("controls") := "", attr("autoplay") := "", attr("muted") := "", attr("loop") := "", width := "700"),
      br(),
      h3("untitled"),
      p("Date: 15/06/2026, Time taken: 4h"),
      p("This animation was done mainly to practice my animation skills and smooth transitioning between different states."),
      video(src := "assets/images/untitled.mp4", attr("controls") := "", attr("autoplay") := "", attr("muted") := "", attr("loop") := "", width := "700")
    )
  )
}