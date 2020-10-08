
public class Cat extends Animal{

    public Cat(double distance){
        super(distance);
    }

    @Override
    public void run() {
        if(distance>=0 && distance<=200){
            System.out.println("run: true");
        }else{
            System.out.println("run: false");
        }
    }

    @Override
    public void jump() {
        if (distance >= 0 && distance <= 2) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
    }

    @Override
    public void swim() {
        System.out.println("swim: false");
    }

    @Override
    public void runManually(double limit) {
        if(distance>=0 && distance<=limit){
            System.out.println("run: true");
        }else{
            System.out.println("run: false");
        }
    }

    @Override
    public void swimManually(double limit) {
        System.out.println("swim: false");
    }

    @Override
    public void jumpManually(double limit) {
        if (distance >= 0 && distance <= limit) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
    }
}
