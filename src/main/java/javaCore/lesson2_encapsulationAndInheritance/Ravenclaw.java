package javaCore.lesson2_encapsulationAndInheritance;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public void comparisonByFaculty(Ravenclaw other) {
        if (getMind() + getWisdom() + getCreativity() < other.getMind() + other.getWisdom() + other.getCreativity()) {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        } else {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                " имя - " + getName() + '\'' +
                ", powerOfMagic - " + getPowerOfMagic() +
                ", transgressionDistance - " + getTransgressionDistance() +
                ", mind - " + getMind() +
                ", wisdom - " + getWisdom() +
                ", creativity - " + getCreativity() +
                '}';
    }
}
