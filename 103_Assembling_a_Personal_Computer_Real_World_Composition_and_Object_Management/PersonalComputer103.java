public class PersonalComputer103 extends Product103 {

    private ComputerCase103 computerCase;
    private Monitor103 monitor;
    private Motherboard103 motherboard;

    public PersonalComputer103(String model, String manufacturer, ComputerCase103 computerCase, Monitor103 monitor,
            Motherboard103 motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

    // public ComputerCase103 getComputerCase() {
    // return computerCase;
    // }

    // public Monitor103 getMonitor() {
    // return monitor;
    // }

    // public Motherboard103 getMotherboard() {
    // return motherboard;
    // }

}
