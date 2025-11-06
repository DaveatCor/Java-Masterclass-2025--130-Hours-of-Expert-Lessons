package dev.lpa.pirate;

public enum Feature {
    ALLIGATOR(-45),
    ALOE(5),
    JELLYFISH(-10),
    PINEAPPLE(10),
    SNAKE(-25),
    SPRING(25),
    SUN_POISON(-15);

    private final int healthPoint;

    Feature(int worth) {
        this.healthPoint = worth;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}
