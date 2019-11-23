package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SchedulerSettingSpec : Spek({
    describe("スケジューラー設定クラス") {
        // 0,0,0は初期化のための無意味な値
        var time = Time(18, 9, 32)
        var schedulerSetting = SchedulerSetting(Time(0, 0, 0))
        beforeEachTest {
            schedulerSetting = SchedulerSetting(time)
        }

        describe("スケジューラー設定オブジェクトの時刻の文字列表現を取得"){
            it("18時9分32秒の文字列表現「32 9 18」を取得"){
                Assertions.assertEquals("32 9 18", schedulerSetting.getString())
            }
        }

        describe("時刻が一致するか判断"){
            it("スケジューラ設定「32 9 18」と実行時刻18時9分32秒が一致する"){
                Assertions.assertTrue(schedulerSetting.isMatch(Time(18, 9, 32)))
            }
            it("スケジューラ設定「32 9 18」と時刻8時7分15秒が一致しなi") {
                Assertions.assertFalse(schedulerSetting.isMatch(Time(8, 7, 15)))
            }
        }
    }
})
