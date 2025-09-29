public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    public Fish(int gills, int fins) {
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMusles() {
        System.out.println("muscles moving");
    }

    private void moveBackFin() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMusles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish [gills=" + gills + ", fins=" + fins + ", toString()=" + super.toString() + "]";
    }

}
