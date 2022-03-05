package models;

import java.util.ArrayList;

public class Team {
    private String name;
    private String cause;
    private static ArrayList<Team> instances = new ArrayList<>();
    private static ArrayList<Integer> chosenHerosIds = new ArrayList<>();
    private ArrayList<Hero> chosenHeros = new ArrayList<>();

    public Team(String name, String cause, Hero hero1, Hero hero2, Hero hero3, Hero hero4) {
        this.name = name;
        this.cause = cause;
        chosenHerosIds.add(hero1.getId());
        chosenHerosIds.add(hero2.getId());
        chosenHerosIds.add(hero3.getId());
        chosenHerosIds.add(hero4.getId());
        this.chosenHeros.add(hero1);
        this.chosenHeros.add(hero2);
        this.chosenHeros.add(hero3);
        this.chosenHeros.add(hero4);
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public static ArrayList<Team> getAll() {
        return instances;
    }

    public static ArrayList<Integer> getChosenHerosIds() {  // Used to set the max size of the team.
        return chosenHerosIds;
    }

    public ArrayList<Hero> getChosenHeros() {
        return chosenHeros;
    }
}
