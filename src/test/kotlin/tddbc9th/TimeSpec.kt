package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object TimeSpec : Spek({
    describe("時刻クラス"){
        var time= Time(0,0,0)
        beforeEachTest {
            time = Time(18, 9, 32)
        }
        it("時刻18時9分32秒 と 時刻18時9分32秒 は一致する") {
            var opponentTime = Time(18, 9, 32)
            Assertions.assertTrue(time.isMatch(opponentTime))
        }
        it("時刻18時9分32秒 と 時刻8時7分15秒 は一致しない") {
            var opponentTime = Time(8, 7, 15)
            Assertions.assertFalse(time.isMatch(opponentTime))
        }
    }
})