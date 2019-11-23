package tddbc9th

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SchedulerSettingSpec : Spek({
    describe("スケジューラー設定クラス") {
        val schedulerSetting by memoized{ SchedulerSetting() }
        describe("時刻 (時、分、秒)を与えて、スケジューラー設定オブジェクトを作成") {
            it("オブジェクトを作成") {
                Assertions.assertTrue(false)
            }
        }
    }
})