package animals_01;

public class Dog extends Animals {

    private static int count;

    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = 500;
        this.maxSwim = 10;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
