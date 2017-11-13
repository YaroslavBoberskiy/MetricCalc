public class Room {

    private Clock clock;
    private Lamp lamp;

    public Room(Clock clock, Lamp lamp) {
        this.clock = clock;
        this.lamp = lamp;
    }

    public Clock getClock() {
        return clock;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
