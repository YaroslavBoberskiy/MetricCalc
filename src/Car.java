public class Car {

    private String name;
    private int cylinders = 4;
    private int wheels = 4;
    private boolean engine = true;


    public Car(String name, int cylinders) {
        this.name = name;

        if (cylinders >= 3 && cylinders <=12) {
            this.cylinders = cylinders;
        }

        this.wheels = wheels;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public void StartEngine() {
        System.out.println("Default car engine started");
    }

    public void Accelerate() {
        System.out.println("Default car acceleration");
    }
}
