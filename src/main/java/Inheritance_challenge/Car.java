package Inheritance_challenge;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gearsNumber;
    private boolean isManual;
    private int currentGear;


    public Car() {
    }

    public Car(String name, String size, int wheels, int doors, int gearsNumber, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gearsNumber = gearsNumber;
        this.isManual = isManual;
        this.currentGear = 0;
    }

    void handSteering() {
        System.out.println("Car has on a left-hand steering wheel");
    }

    void changingGears(int gear) {
        switch (gear) {
            case 0:
                setCurrentGear(gear);
                System.out.println("The transmission is in neutral");
                break;
            case 1:
                setCurrentGear(gear);
                System.out.println("The transmission is in first gear");
                break;
            case 2:
                setCurrentGear(gear);
                System.out.println("The transmission is in second gear");
                break;
            case 3:
                setCurrentGear(gear);
                System.out.println("The transmission is in third gear");
                break;
            case 4:
                setCurrentGear(gear);
                System.out.println("The transmission is in forth gear");
                break;
            case 5:
                setCurrentGear(gear);
                System.out.println("The transmission is in fifth gear");
                break;
            case 6:
                setCurrentGear(gear);
                System.out.println("The transmission is in sixth gear");
                break;
            default:
                System.out.println("No such transmission. It is back to neutral");
                break;
        }
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + ", in direction: " + direction);
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
