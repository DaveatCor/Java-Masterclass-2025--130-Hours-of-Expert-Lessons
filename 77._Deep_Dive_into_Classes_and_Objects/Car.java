public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.err
                .println(doors + "-Door" + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}
