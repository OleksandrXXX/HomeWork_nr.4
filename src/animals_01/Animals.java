package animals_01;

public class Animals {

    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    private static int count;

    public Animals(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't run so far.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't swim so far.");
    }
}