public class ClassPart1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.err.println("make = " + car.getMake());
        System.err.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porche");
        targa.setModel("Carrera");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.describeCar();
    }

}