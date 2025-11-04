package languageSyntax.finalWork;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private int numberDepartment;
    private int salary;
    private static int counter = 1;

    public Employee(String name, int numberDepartment, int salary) {
        this.id = counter++;
        this.name = name;
        this.numberDepartment = numberDepartment;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && numberDepartment == employee.numberDepartment && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, numberDepartment, salary);
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "id = " + id +
                ", ФИО = '" + name + '\'' +
                ", Номер отдела = " + numberDepartment +
                ", зарплата = " + salary +
                '}';
    }
}
