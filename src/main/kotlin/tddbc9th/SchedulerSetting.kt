package tddbc9th

class SchedulerSetting(val hour: Int, val minute: Int, val second: Int) {
    fun getString() = "$second $minute $hour"
}
