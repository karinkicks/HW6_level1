
public class Dog extends Animal{

    public Dog(double distance){
        super(distance);
    }

    @Override
    public void run() {
        if(distance>=0 && distance<=500){
            System.out.println("run: true");
        }else{
            System.out.println("run: false");
        }
    }
    @Override
    public void jump() {
        if (distance >= 0 && distance <= 0.5) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
    }

    @Override
    public void swim() {
        if (distance >= 0 && distance <= 10) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
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
        if (distance >= 0 && distance <= limit) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
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
