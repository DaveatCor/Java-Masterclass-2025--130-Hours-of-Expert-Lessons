public class Dog extends Animal {

    private String earShape;
    private String trailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String trailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.trailShape = trailShape;
    }

    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", trailShape=" + trailShape + ", toString()=" + super.toString() + "]";
    }

    public void makeNoise() {

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.err.println("Dogs walk, run and wag their tail");
    }
}
