public class ClassPart1 {
    public static void main(String[] args) {
        Car car = new Car();
        System.err.println("make = " + car.getMake());
        System.err.println("model = " + car.getModel());
        car.describeCar();
    }

}