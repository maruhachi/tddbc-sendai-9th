package tddbc9th

class SchedulerSetting(val time: Time) {
    fun getString() = "${time.second.replace("毎秒", "*")} ${time.minute.replace("毎分", "*")} ${time.hour.replace("毎時", "*")}"
    fun isTimeMatch(opponentTime: Time): Boolean{
        if( !time.hour.equals("毎時")){
             if (!opponentTime.hour.equals(time.hour)){
                 return false
             }
        }else if(!time.minute.equals("毎分")){
            if (!opponentTime.minute.equals(time.minute)){
                return false
            }
        }else if(!time.second.equals("毎秒")){
            if (!opponentTime.second.equals(time.second)){
                return false
            }
        }
        return true
    }
}
