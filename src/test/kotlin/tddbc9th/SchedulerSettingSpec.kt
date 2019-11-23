package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SchedulerSettingSpec : Spek({
    describe("スケジューラー設定クラス") {
        // 0,0,0は初期化のための無意味な値
        var time = Time("18", "9", "32")
        var schedulerSetting = SchedulerSetting(Time("0", "0", "0"))
        beforeEachTest {
            schedulerSetting = SchedulerSetting(time)
        }

        describe("スケジューラー設定オブジェクトの時刻の文字列表現を取得") {
            it("18時9分32秒の文字列表現「32 9 18」を取得") {
                Assertions.assertEquals("32 9 18", schedulerSetting.getString())
            }
        }

        describe("時刻が一致するか判断") {
            it("スケジューラ設定「32 9 18」と実行時刻18時9分32秒が一致する") {
                Assertions.assertTrue(schedulerSetting.isTimeMatch(Time("18", "9", "32")))
            }
            it("スケジューラ設定「32 9 18」と時刻8時7分15秒が一致しない") {
                Assertions.assertFalse(schedulerSetting.isTimeMatch(Time("8", "7", "15")))
            }
        }
    }
    describe("スケジュ-ラ-設定クラスの毎時・毎分・毎秒に対応した拡張") {
        describe("毎時、毎分、毎秒を設定した箇所の文字列表現は *(アスタリスク) "){
            it("スケジューラー設定に 毎時、9、32 を与えると、その文字列表現は文字列 「32 9 *」"){
                val schedulerSetting = SchedulerSetting(Time("*", "9", "32"))
                Assertions.assertEquals("32 9 *", schedulerSetting.getString())
            }
        }
        describe("秒を*にしたとき、任意の時・分の0〜59秒の範囲で一致する") {
            it("スケジューラ設定「* 9 18」と実行時刻18時9分0秒が一致する") {
                val schedulerSetting = SchedulerSetting(Time("18", "9", "*"))
                Assertions.assertTrue(schedulerSetting.isTimeMatch(Time("18", "9", "0")))
            }
        }
    }
})
