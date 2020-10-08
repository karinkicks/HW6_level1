public class Main {

    public static void main(String[] args) {
	Animal dog1 = new Dog(0.6);
	Animal dog2 = new Dog(500);

	Animal cat1 = new Cat(2);
	Animal cat2 = new Cat(5);

        dog1.jump();
        dog2.runManually(100);

        cat1.swim();
        cat2.jumpManually(6.7);
    }
}
