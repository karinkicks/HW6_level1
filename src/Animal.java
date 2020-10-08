
public abstract class Animal {
    protected double distance;


    public Animal(double distance) {
        this.distance=distance;
    }

    public abstract void run();

    public abstract void swim();

    public abstract void jump();

    public abstract void runManually(double limit);

    public abstract void swimManually(double limit);

    public abstract void jumpManually(double limit);

}
