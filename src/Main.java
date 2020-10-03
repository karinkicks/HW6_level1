public class Main {

    public static void main(String[] args) {
	Animal dog1 = new Dog();
	Animal dog2 = new Dog();

	Animal cat1 = new Cat();
	Animal cat2 = new Cat();

        dog1.jump(0.6);
        dog2.runManually(100,500);

        cat1.swim(2);
        cat1.jumpManually(6,7);
    }
}
