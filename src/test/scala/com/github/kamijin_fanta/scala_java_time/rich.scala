package com.github.kamijin_fanta.scala_java_time

import java.time.{Duration, OffsetDateTime}

import org.scalatest.FunSpec

class rich extends FunSpec {
  describe("rich int") {
    import Implicits.richInt
    it("standard") {
      assert(1.seconds == Duration.ofSeconds(1))
    }
  }
  describe("rich duration") {
    import Implicits.{richDuration, richInt}
    it("standard") {
      assert(1.seconds + 2.minutes == Duration.ofSeconds(1).plusMinutes(2))
    }
  }
  describe("rich offset datetime") {
    import Implicits.{richInt, richOffsetDateTime}
    it("compare") {
      assert(OffsetDateTime.now() < OffsetDateTime.now() + 2.seconds)
    }
    it("with last") {
      assert(OffsetDateTime.parse("2018-04-10T00:00:00Z").withLastDayOfMonth == OffsetDateTime.parse("2018-04-30T00:00:00Z"))
    }
  }
}
