package javaCore.lesson2_encapsulationAndInheritance;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void comparisonByFaculty(Gryffindor other) {
        if (getNobility() + getHonor() + getBravery() < other.getNobility() + other.getHonor() + other.getBravery()) {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + getName());
        } else {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + other.getName());
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                " имя - " + getName() +
                ", powerOfMagic - " + getPowerOfMagic() +
                ", transgressionDistance - " + getTransgressionDistance() +
                ", nobility - " + getNobility() +
                ", honor - " + getHonor() +
                ", bravery - " + getBravery() +
                "} ";
    }
}
