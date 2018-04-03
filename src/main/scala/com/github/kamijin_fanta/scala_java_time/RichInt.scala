package com.github.kamijin_fanta.scala_java_time

import java.time.Duration

class RichInt(val num: Int) extends AnyVal {
  def days: Duration = DurationStatics.Days(num)

  def hours: Duration = DurationStatics.Hours(num)

  def minutes: Duration = DurationStatics.Minutes(num)

  def seconds: Duration = DurationStatics.Seconds(num)

  def millis: Duration = DurationStatics.Millis(num)

  def nanos: Duration = DurationStatics.Nanos(num)
}
