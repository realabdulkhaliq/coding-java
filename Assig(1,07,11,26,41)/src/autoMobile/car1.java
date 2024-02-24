package autoMobile;

public abstract class car1 implements Vahicals {

    public double price, capacity, speed;

    public void speed(double s) {
        speed = s;
    }

    public abstract void price(double p);

    public abstract void name(String n);
}
