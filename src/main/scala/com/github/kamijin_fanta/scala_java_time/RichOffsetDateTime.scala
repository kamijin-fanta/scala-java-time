package com.github.kamijin_fanta.scala_java_time

import java.time.temporal.TemporalAdjusters
import java.time.{Duration, OffsetDateTime}

class RichOffsetDateTime(val base: OffsetDateTime) extends AnyVal with Ordered[OffsetDateTime] {
  def +(d: Duration): OffsetDateTime = base.plus(d)

  def -(d: Duration): OffsetDateTime = base.minus(d)

  override def compare(that: OffsetDateTime): Int = base.compareTo(that)

  def withLastDayOfMonth: OffsetDateTime = base.`with`(TemporalAdjusters.lastDayOfMonth())

  def withLastDayOfYear: OffsetDateTime = base.`with`(TemporalAdjusters.lastDayOfYear())

  def withFirstDayOfMonth: OffsetDateTime = base.`with`(TemporalAdjusters.firstDayOfMonth())

  def withFirstDayOfYear: OffsetDateTime = base.`with`(TemporalAdjusters.firstDayOfYear())
}
