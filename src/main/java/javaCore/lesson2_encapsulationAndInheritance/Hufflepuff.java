package javaCore.lesson2_encapsulationAndInheritance;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void comparisonByFaculty(Hufflepuff other) {
        if (getHardWork() + getLoyalty() + getHonesty() < other.getHardWork() + other.getLoyalty() + other.getHonesty()) {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        } else {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        }
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                " имя - " + getName() + '\'' +
                ", powerOfMagic - " + getPowerOfMagic() +
                ", transgressionDistance - " + getTransgressionDistance() +
                ", hardWork - " + getHardWork() +
                ", loyalty - " + getLoyalty() +
                ", honesty - " + getHonesty() +
                "} ";
    }
}
