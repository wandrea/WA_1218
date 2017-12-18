package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.18..
 */
public abstract class AbstractVehicle {
    private String name;
    private float speed;
    private String color;

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
