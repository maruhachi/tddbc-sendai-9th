package tddbc9th

class SchedulerSetting(val time: Time) {
    fun getString() = "${time.second} ${time.minute} ${time.hour}"
    fun isTimeMatch(opponentTime: Time): Boolean{
        return time.isMatch(opponentTime)

    }
}
