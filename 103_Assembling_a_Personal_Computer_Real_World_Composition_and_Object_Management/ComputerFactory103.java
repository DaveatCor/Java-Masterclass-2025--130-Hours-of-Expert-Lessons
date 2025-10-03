public class ComputerFactory103 {
    public static void main(String[] args) {
        ComputerCase103 theCase = new ComputerCase103("2208", "Dell", "204");

        Monitor103 theMonitor = new Monitor103("27ince Beast", "Acer", 27, "2540 x 1440");

        Motherboard103 theMotherboard = new Motherboard103("BJ-200", "Asus", 4, 6, "2540 x 1440");

        PersonalComputer103 thePc = new PersonalComputer103("2208", "Dell", theCase, theMonitor, theMotherboard);

        // thePc.getMonitor().drawPixelAt(10, 10, "red");

        // thePc.getMotherboard().loadProgram("Window OS");

        // thePc.getComputerCase().pressPowerButton();
        thePc.powerUp();
    }
}
