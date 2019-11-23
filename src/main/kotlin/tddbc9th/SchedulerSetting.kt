package tddbc9th

class SchedulerSetting(val time: Time) {
    fun getString() = "${time.hour} ${time.minute} ${time.second}"
}
