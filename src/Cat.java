
public class Cat extends Animal{
    @Override
    protected void run(double length) {
        if(length>=0 && length<=200){
            System.out.println("run: true");
        }else{
            System.out.println("run: false");
        }
    }

    @Override
    protected void jump(double height) {
        if (height >= 0 && height <= 2) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
    }

    @Override
    protected void swim(double length) {
        System.out.println("swim: false");
    }

    @Override
    protected void runManually(double length, double limit) {
        if(length>=0 && length<=limit){
            System.out.println("run: true");
        }else{
            System.out.println("run: false");
        }
    }

    @Override
    protected void swimManually(double length, double limit) {
        System.out.println("swim: false");
    }

    @Override
    protected void jumpManually(double height, double limit) {
        if (height >= 0 && height <= limit) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
    }
}
