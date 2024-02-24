//> using scala "3.3.2"
//> using lib "org.typelevel::cats-effect:3.5.3"
//> using lib "co.fs2::fs2-io:3.9.4"

import cats.effect.IO
import cats.effect.IOApp

object main extends IOApp.Simple {
  val run = IO.println("hello")
}
