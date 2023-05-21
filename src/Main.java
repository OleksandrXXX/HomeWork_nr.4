public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Pete");

        Dog dog1 = new Dog("Bark");
        Dog dog2 = new Dog("Pig");

        System.out.println();

        dog1.run(400);
        dog2.swim(5);

        System.out.println();

        cat1.run(1700);
        cat2.swim(5);

        System.out.println();

        System.out.println("Total animals created: " + Animals.getCount());
        System.out.println("Total cats created: " + Cat.getCount());
        System.out.println("Total dogs created: " + Dog.getCount());
    }
}