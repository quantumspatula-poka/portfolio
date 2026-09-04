package zofia.nea

import cats.effect.Sync
import cats.syntax.all.*
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl
import org.http4s.scalatags.*

object NeaRoutes:

  def index[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(IndexPage.content).pure[F].flatMap(Ok(_))
    }

  def login[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(LoginPage.content).pure[F].flatMap(Ok(_))
    }

  def home[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(HomePage.content).pure[F].flatMap(Ok(_))
    }

  def questionnaire[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(QuestionnairePage.content).pure[F].flatMap(Ok(_))
    }

  def profile[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(ProfilePage.content).pure[F].flatMap(Ok(_))
    }

  def browse[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(BrowsePage.content).pure[F].flatMap(Ok(_))
    }

  def chat[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(ChatPage.content).pure[F].flatMap(Ok(_))
    }

  def settings[F[_] : Sync]: HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl.*
    HttpRoutes.of[F] {
      case GET -> Root =>
        MainPage.withMainDiv(SettingsPage.content).pure[F].flatMap(Ok(_))
    }