package com.github.kamijin_fanta.scala_java_time

import java.time.Duration

object DurationStatics {
  def Days(n: Long): Duration = Duration.ofDays(n)

  def Hours(n: Long): Duration = Duration.ofHours(n)

  def Minutes(n: Long): Duration = Duration.ofMinutes(n)

  def Seconds(n: Long): Duration = Duration.ofSeconds(n)

  def Millis(n: Long): Duration = Duration.ofMillis(n)

  def Nanos(n: Long): Duration = Duration.ofNanos(n)
}
