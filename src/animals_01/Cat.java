package animals_01;

public class Cat extends Animals {

    private static int count;

    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.type = "Cat";
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat's no swim!");
    }

}
