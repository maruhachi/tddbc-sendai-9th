package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SchedulerSettingSpec : Spek({
    describe("スケジューラー設定クラス") {
        describe("時刻 (時、分、秒)を与えて、スケジューラー設定オブジェクトを作成") {
            it("オブジェクトを作成") {
                val schedulerSetting = SchedulerSetting()
                Assertions.assertNotNull(schedulerSetting)
            }
            it("時間を保持する") {
                val schedulerSetting = SchedulerSetting(hour = 18)
                Assertions.assertEquals(18, schedulerSetting.hour)
            }
            it("分を保持する") {
                val schedulerSetting = SchedulerSetting(minute = 9)
                Assertions.assertEquals(9, schedulerSetting.minute)
            }
        }
    }
})