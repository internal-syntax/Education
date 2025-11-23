package javaCore.lesson2_encapsulationAndInheritance;

import java.util.Objects;

public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public void studentComparison(Hogwarts other) {
        if (getPowerOfMagic() < other.getPowerOfMagic()) {
            System.out.println(other.getName() + " обладает большей мощностью магии, чем " + getName());
        } else
            System.out.println(getName() + " обладает большей мощностью магии, чем " + other.getName());
        if (getTransgressionDistance() < other.getTransgressionDistance()) {
            System.out.println(other.getName() + " может трансгрессировать дальше, чем " + getName());
        } else
            System.out.println(getName() + " может трансгрессировать дальше, чем " + other.getName());
    }

    public void studentDescription() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
