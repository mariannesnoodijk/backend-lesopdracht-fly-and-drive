public class Car extends Vehicle implements Driveable {

    public Car(int speed, float weight) {
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
}
