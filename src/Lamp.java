public class Lamp {

    private String color;
    private int power;
    private boolean isEnergyEfficient;
    private boolean isOn;
    private boolean isOff;

    public Lamp(String color, int power, boolean isEnergyEfficient) {
        this.color = color;
        this.power = power;
        this.isEnergyEfficient = isEnergyEfficient;
        this.isOff = true;
        this.isOn = false;
    }

    private void turnOn() {
        this.isOn = true;
        this.isOff = false;
        System.out.println("Lamp is ON");
    }

    private void turnOff() {
        this.isOn = false;
        this.isOff = true;
        System.out.println("Lamp is OFF");
    }

    public void pushSwitchButton() {
        if (isOn == true) {
            turnOff();
        } else {
            turnOn();
        }
    }

}
