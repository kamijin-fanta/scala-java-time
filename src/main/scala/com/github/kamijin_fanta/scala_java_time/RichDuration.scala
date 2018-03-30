package com.github.kamijin_fanta.scala_java_time

import java.time.Duration

class RichDuration(val left: Duration) extends AnyVal {
  def -(right: Duration): Duration = left.minus(right)

  def +(right: Duration): Duration = left.plus(right)
}
