package models;

import java.util.ArrayList;

public class Hero {

    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;

    public Hero(String name, int age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }

    public static Hero getById(int id) {
        return instances.get(id - 1);
    }
}