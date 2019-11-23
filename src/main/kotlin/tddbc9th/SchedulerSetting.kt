package tddbc9th

class SchedulerSetting(val time: Time) {
    fun getString() = "${time.second} ${time.minute} ${time.hour}"
    fun isMatch(opponentTime: Time) = time.isMatch(opponentTime)
}
