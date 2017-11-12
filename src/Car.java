public class Car extends Vehicle {

    private int wheels;
    private int doorsCount;
    private String engineType;

    public Car(int maxSpeed, int wheels, int doorsCount,
               String engineType) {
        super(maxSpeed, 0, Direction.FORWARD);
        this.wheels = wheels;
        this.doorsCount = doorsCount;
        this.engineType = engineType;
    }

    public void MoveLeft () {
        this.setCurrentDirection(Direction.LEFT);
    }

    public void MoveRight () {
        this.setCurrentDirection(Direction.RIGHT);
    }

    public void MoveBack () {
        this.setCurrentDirection(Direction.BACK);
    }

    public void MoveForward () {
        this.setCurrentDirection(Direction.FORWARD);
    }

    public void setSpeed (int speed) {
        if (speed <= this.getMaxSpeed() && speed >= 0) {
            this.setCurrentSpeed(speed);
            this.setMoving(true);
        } else {
            System.out.println("Error: Max speed can't be larger than: " + this.getMaxSpeed());
        }

        if (this.getCurrentSpeed() == 0) {
            this.setCurrentSpeed(0);
            this.setMoving(false);
        }
    }

    @Override
    public void Move() {
        super.Move();
    }
}
