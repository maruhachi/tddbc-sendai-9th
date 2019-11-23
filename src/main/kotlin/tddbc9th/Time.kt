package tddbc9th

class Time(val hour: Int, val minute: Int, val second: Int) {
    fun isMatch(opponentTime: Time): Boolean {
        return hour == opponentTime.hour &&
                minute == opponentTime.minute &&
                second == opponentTime.second
    }
}
