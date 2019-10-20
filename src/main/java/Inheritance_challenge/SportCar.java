package Inheritance_challenge;

public class SportCar extends Car {
    private int roadServiceMonth;

    public SportCar(int roadServiceMonth) {
        super("Porshe", "4WD", 4, 3, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
        } else if (newVelocity < 0) {
            changingGears(1);
        } else if (newVelocity < 10) {
            changingGears(2);
        } else if (newVelocity < 20) {
            changingGears(3);
        } else if (newVelocity < 30) {
            changingGears(4);
        } else if (newVelocity < 50) {
            changingGears(5);
        } else if (newVelocity < 80) {
            changingGears(6);
        } else {
            changingGears(0);
        }
        if (newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }


}
