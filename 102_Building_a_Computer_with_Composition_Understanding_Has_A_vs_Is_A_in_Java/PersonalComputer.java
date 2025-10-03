public class PersonalComputer extends Product103 {

    private ComputerCase103 computerCase;
    private Monitor103 monitor;
    private Motherboard103 motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase103 computerCase, Monitor103 monitor,
            Motherboard103 motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase103 getComputerCase() {
        return computerCase;
    }

    public Monitor103 getMonitor() {
        return monitor;
    }

    public Motherboard103 getMotherboard() {
        return motherboard;
    }

}
