package dev.lpa;

public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicityType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub

    }

}
