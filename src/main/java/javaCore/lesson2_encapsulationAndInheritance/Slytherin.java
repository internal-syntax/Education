package javaCore.lesson2_encapsulationAndInheritance;

import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public void comparisonByFaculty(Slytherin other) {
        if (getCunning() + getDetermination() + getAmbition() < other.getCunning() + other.getDetermination() + other.getAmbition()) {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        } else {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                " имя - " + getName() + '\'' +
                ", powerOfMagic - " + getPowerOfMagic() +
                ", transgressionDistance - " + getTransgressionDistance() +
                ", cunning - " + getCunning() +
                ", determination - " + getDetermination() +
                ", ambition - " + getAmbition() +
                '}';
    }
}
