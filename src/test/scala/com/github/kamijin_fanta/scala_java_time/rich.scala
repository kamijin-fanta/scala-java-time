package com.github.kamijin_fanta.scala_java_time

import java.time.Duration

import org.scalatest.FunSpec

class rich extends FunSpec {
  describe("rich int") {
    import Implicits.richInt
    it("standard") {
      assert(1.seconds === Duration.ofSeconds(1))
    }
  }
  describe("rich duration") {
    import Implicits.richDuration
    import Implicits.richInt
    it("standard") {
      assert(1.seconds + 2.minutes === Duration.ofSeconds(1).plusMillis(2))
    }
  }
}
