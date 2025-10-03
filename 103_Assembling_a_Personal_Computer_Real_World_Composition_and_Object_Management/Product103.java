public class Product103 {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product103(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

}

class Monitor103 extends Product103 {
    private int size;
    private String resolution;

    public Monitor103(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor103(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.printf("Drawing pixel at %d %d in color %s", x, y, color);
    }
}

class Motherboard103 extends Product103 {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard103(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard103(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

}

class ComputerCase103 extends Product103 {
    private String powerSupply;

    public ComputerCase103(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase103(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
