public class FlyingCar extends Vehicle implements Flyable, Driveable {

    public FlyingCar(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating");
    }

    @Override
    public void brake() {
        System.out.println("braking");
    }

    @Override
    public void changeGear() {
        System.out.println("changing gear");
    }

    @Override
    public void takeOff() {
        System.out.println("taking off");
    }

    @Override
    public void land() {
        System.out.println("landing");
    }

    @Override
    public void changeAltitude() {
        System.out.println("changing altitude");
    }
}
