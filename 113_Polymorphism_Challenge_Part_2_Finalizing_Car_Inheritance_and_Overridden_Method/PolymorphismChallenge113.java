public class PolymorphismChallenge113 {
    public static void main(String[] args) {
        Car113 car = new Car113("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car113 ferrari = new GasPoweredCar113("2022 Blue Ferrari 296 GTS", 15.4, 6);

        runRace(ferrari);

        Car113 tesla = new ElectricCar113("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car113 ferrariHybid = new HybridCar113("2022 Black Ferrai SF90 Stradale");
        runRace(ferrariHybid);
    }

    public static void runRace(Car113 car) {
        car.startEngine();
        car.drive();
    }
}
