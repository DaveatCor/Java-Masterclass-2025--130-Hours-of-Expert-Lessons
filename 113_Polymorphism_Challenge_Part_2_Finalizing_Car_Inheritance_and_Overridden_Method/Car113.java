public class Car113 {
    private String description;

    public Car113(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar113 extends Car113 {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar113(String desc) {
        super(desc);
    }

    public GasPoweredCar113(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exeeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar113 extends Car113 {
    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar113(String desc) {
        super(desc);
    }

    public ElectricCar113(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerLiter;
        this.batterySize = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar113 extends Car113 {
    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar113(String desc) {
        super(desc);
    }

    public HybridCar113(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", batterySize);
        System.out.printf("BEV -> switch %d kWh battery on, Ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}
