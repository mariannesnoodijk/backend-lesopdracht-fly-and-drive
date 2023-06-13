public abstract class Vehicle {

    int speed;
    float weight;


    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void startEngine() {

    }

    public void turnOffEngine() {

    }
}
