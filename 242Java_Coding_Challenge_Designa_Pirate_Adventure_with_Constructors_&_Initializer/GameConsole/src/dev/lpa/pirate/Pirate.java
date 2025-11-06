package dev.lpa.pirate;

import dev.lpa.game.Player;

import java.util.*;

public class Pirate implements Player {

    private final String name;
    private final Map<String, Integer> gameData;
    private final List<String> townsVisited = new LinkedList<>();
    private Weapon currentWeapon;

    //--------------------------------------------
    {
        gameData = new HashMap<>(Map.of(
            "health", 100,
            "score", 0,
            "level", 0,
            "townIndex", 0
        ));
        visitTown();
    }

    public Pirate(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getGameData() {
        return gameData;
    }

    public List<String> getTownsVisited() {
        return townsVisited;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    int value(String name){
        return gameData.get(name);
    }

    private void setValue(String name, int value){
        gameData.put(name, value);
    }

    private void adjustValue(String name, int adj){
        gameData.compute(name, (k, v) -> v += adj);
    }

    private void adjustHealth(int adj){
        int health = value("health");
        health += adj;
        health = (health < 0) ? 0 : ((health > 100) ? 100 : health);
        setValue("health", health);
    }

    boolean useWeapon(){
        System.out.println("Used the " + currentWeapon);
        return false;
    }

    boolean visitTown(){
        String town = "My Town, somewhere";
        if (town != null){
            townsVisited.add(town);
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        var current = townsVisited.getLast();
        String[] simpleNames = new String[townsVisited.size()];
        Arrays.setAll(simpleNames, i -> townsVisited.get(i).split(",")[0]);
        return  "---> " + current +
                "\nPirate " + name + " " + gameData +
                "\n\ttownVisited=" + Arrays.toString(simpleNames);
    }
}
