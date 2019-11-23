package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SchedulerSettingSpec : Spek({
    describe("スケジューラー設定クラス") {
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

        describe("スケジューラー設定オブジェクトの時刻を文字列へ取得"){
            it("18時9分32秒の文字列表現「32 9 18」を取得"){
                Assertions.assertEquals("32 9 18", schedulerSetting.getString())
            }
        }
    }
})