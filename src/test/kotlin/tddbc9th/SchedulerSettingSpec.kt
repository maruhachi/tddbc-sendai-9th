package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SchedulerSettingSpec : Spek({
    describe("スケジューラー設定クラス") {
        // 0,0,0は初期化のための無意味な値
        var schedulerSetting: SchedulerSetting = SchedulerSetting(hour = 0, minute = 0, second = 0)
        beforeEachTest {
            schedulerSetting = SchedulerSetting(hour = 18, minute = 9, second = 32)
        }
        describe("時刻 (時、分、秒)を与えて、スケジューラー設定オブジェクトを作成") {
            it("時間を保持する") {
                Assertions.assertEquals(18, schedulerSetting.hour)
            }
            it("分を保持する") {
                Assertions.assertEquals(9, schedulerSetting.minute)
            }
            it("秒を保持する") {
                Assertions.assertEquals(32, schedulerSetting.second)
            }
        }

        describe("スケジューラー設定オブジェクトの時刻の文字列表現を取得"){
            it("18時9分32秒の文字列表現「32 9 18」を取得"){
                Assertions.assertEquals("32 9 18", schedulerSetting.getString())
            }
        }

        describe("時刻が一致するか判断"){
            it("「32 9 18」と実行時刻18時9分32秒が一致する"){
                Assertions.assertTrue(schedulerSetting.isMatch("32 9 18"))
            }

        }
    }
})