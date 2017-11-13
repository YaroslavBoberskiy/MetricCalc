public class Checker {


    public static void main(String[] args) {
        Clock clock = new Clock("11:21", "12:30");
        Lamp lamp = new Lamp("blue", 12, true);

        Room room = new Room(clock, lamp);

        room.getClock().setCurrentTime("23:00");
        room.getClock().setAlarmTime("23:01");

        room.getLamp().pushSwitchButton();
        room.getLamp().pushSwitchButton();
        room.getLamp().pushSwitchButton();
        room.getLamp().pushSwitchButton();
        room.getLamp().pushSwitchButton();

    }
}
