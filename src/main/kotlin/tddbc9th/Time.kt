package tddbc9th

class Time(val hour: String, val minute: String, val second: String) {
    fun isMatch(opponentTime: Time): Boolean {
        return hour == opponentTime.hour &&
                minute == opponentTime.minute &&
                second == opponentTime.second
    }
}
