public class Clock {

    private String currentTime;
    private String alarmTime;

    public Clock(String currentTime, String alarmTime) {
        this.currentTime = currentTime;
        this.alarmTime = alarmTime;
    }

    private void AlarmAlarm() {
        System.out.println("Beep, beep, beep... Wake up!");
    }

    private boolean TimeInputCheck(String time) {
        String[] timeCheck = time.split(":");
        if (Integer.parseInt(timeCheck[0]) <= 23 && Integer.parseInt(timeCheck[0]) >= 0 &&
                Integer.parseInt(timeCheck[1]) <= 59 && Integer.parseInt(timeCheck[1]) >= 0) {
            return true;
        } else {
            System.out.println("TimeInputCheck: Incorrect format!");
            return false;
        }
    }

    public void setCurrentTime(String currentTime) {
        if (TimeInputCheck(currentTime)) {
            this.currentTime = currentTime;
            System.out.println("Current time set to " + currentTime);
        } else {
            System.out.println("Incorrect format!");
        }
    }

    public void setAlarmTime(String alarmTime) {
        if (TimeInputCheck(alarmTime)) {
            this.alarmTime = alarmTime;
            System.out.println("Alarm time set to " + alarmTime);
            if (this.alarmTime.equals(this.currentTime)) {
                System.out.println(" and ...");
                AlarmAlarm();
            }
        }
    }
}
