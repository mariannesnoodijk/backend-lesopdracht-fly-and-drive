public class Plane extends Vehicle implements Flyable {

    public Plane(int speed, float weight) {
        super(speed, weight);
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
