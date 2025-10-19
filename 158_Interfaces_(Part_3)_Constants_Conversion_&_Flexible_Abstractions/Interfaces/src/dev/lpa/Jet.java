package dev.lpa;

public class Jet implements FlightEnabled, Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinate recorded");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is fly");
    }

}
