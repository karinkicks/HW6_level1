
public class Animal {

protected void run(double length){
    System.out.println("run " + length);
}

protected void swim(double length) {
    System.out.println("swim " + length);
}

protected void jump(double height){
    System.out.println("jump " + height);
}

    protected void runManually(double length, double limit){
        System.out.println("run " + length);
    }

    protected void swimManually(double length, double limit) {
        System.out.println("swim " + length);
    }

    protected void jumpManually(double height, double limit){
        System.out.println("jump " + height);
    }
}
