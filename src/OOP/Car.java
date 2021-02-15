package OOP;

import jdk.swing.interop.SwingInterOpUtils;

public class Car extends Vehicle {

    private int wheels ;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currrentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currrentGear = 1;
    }

    public void changeGear(int currrentGear){
        this.currrentGear = currrentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currrentGear + " gear.");

    }

    public void changeVelocity(int speed,int direction){
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed,direction);
    }


}
