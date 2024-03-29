package Inheritance_challenge;

public abstract class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle() {
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    void move(int speed, int direction){
        currentDirection = direction;
        currentVelocity = speed;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction "+ currentDirection);
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering " +currentDirection + " degrees.");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
