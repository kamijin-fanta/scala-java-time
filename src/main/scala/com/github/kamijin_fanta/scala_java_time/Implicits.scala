package com.github.kamijin_fanta.scala_java_time

import java.time.{Duration, OffsetDateTime}

object Implicits extends Implicits

trait Implicits {
  implicit def richInt(n: Int): RichInt = new RichInt(n)

  implicit def richDuration(n: Duration): RichDuration = new RichDuration(n)

  implicit def richOffsetDateTime(n: OffsetDateTime): RichOffsetDateTime = new RichOffsetDateTime(n)
}
