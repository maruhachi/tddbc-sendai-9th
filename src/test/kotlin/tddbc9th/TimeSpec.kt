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
        it("18時9分32秒を与えると時として18を返す"){
            Assertions.assertEquals(time.hour , 18)
        }
        it("18時9分32秒を与えると分として9を返す"){
            Assertions.assertEquals(time.minute , 9)
        }
        it("18時9分32秒を与えると秒として32を返す"){
            Assertions.assertEquals(time.second , 32)
        }
        it("時刻18時9分32秒 と 時刻18時9分32秒 は一致する") {
            var opponentTime = Time(18, 9, 32)
            Assertions.assertTrue(time.isMatch(opponentTime))
        }
    }
})