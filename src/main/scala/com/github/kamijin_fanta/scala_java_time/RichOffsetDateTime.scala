package com.github.kamijin_fanta.scala_java_time

import java.time.{Duration, OffsetDateTime}

class RichOffsetDateTime(val base: OffsetDateTime) extends AnyVal {
  def +(d: Duration): OffsetDateTime = base.plus(d)

  def -(d: Duration): OffsetDateTime = base.minus(d)
}
