package dev.lpa;

enum FlightStages implements Trackable {
    GROUNED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeOff'");
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'land'");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNED;

    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while Orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nexStages = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nexStages);
        return nexStages;
    }

}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();

    default FlightStages transition(FlightStages stage) {
        // System.out.println("transition not implemented on " +
        // this.getClass().getName());
        // return null;
        FlightStages nexStages = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nexStages);
        return nexStages;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
