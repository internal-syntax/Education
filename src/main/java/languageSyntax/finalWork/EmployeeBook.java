package languageSyntax.finalWork;

public class EmployeeBook {
    private final Employee[] employees;

    private int size;

    public EmployeeBook() {
        this.employees = new Employee[5];
    }

    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить нового сотрудника, законичилось место");
        }
        Employee newEmployee = employee;
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println(employees[i].getName() + " удалён");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void printAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public void sumSalary() {
        int salarySum = 0;
        for (Employee emp : employees) {
            salarySum += emp.getSalary();
        }
        System.out.printf("Сумма затрат на зарплаты в месяц = %,d%n", salarySum);
    }

    public void minSalaryEmployee() {
        int minSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
            }
        }
        System.out.println("Минимальная зарплата = " + minSalary);
    }

    public void maxSalaryEmployee() {
        int maxSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
        }
        System.out.println("Максимальная зарплата = " + maxSalary);
    }

    public void averageSalary() {
        int salarySum = 0;
        int avgSalary = 0;
        for (Employee emp : employees) {
            salarySum += emp.getSalary();
            avgSalary = salarySum / employees.length;
        }
        System.out.println("Средняя зарплата = " + avgSalary);
    }

    public void fioEmployee() {
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }

    public void salaryIndexation(int indexationPercent) {
        int indexationSalary = 0;
        for (Employee emp : employees) {
            indexationSalary = ((emp.getSalary() * indexationPercent) / 100) + emp.getSalary();
            System.out.println("Проиндексированная зарплата сотрудника " + emp.getName() + " = " + indexationSalary);
        }
    }

    public void minSalaryDepartment(int numberDepartment) {
        Employee minSalaryEmployee = null;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                if (minSalaryEmployee == null || emp.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = emp;
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе №" + numberDepartment + " у сотрудника - " + minSalaryEmployee);
    }

    public void maxSalaryDepartment(int numberDepartment) {
        Employee maxSalaryEmployee = null;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                if (maxSalaryEmployee == null || emp.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = emp;
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе №" + numberDepartment + " у сотрудника - " + maxSalaryEmployee);
    }

    public void sumSalaryDepartment(int numberDepartment) {
        int sumSalary = 0;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                sumSalary += emp.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц по отделу №" + numberDepartment + " = " + sumSalary);
    }

    public void avgSalaryDepartment(int numberDepartment) {
        int sumEmployeeDepartment = 0;
        int sumSalaryDepartment = 0;
        int avgSalaryDepartment = 0;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                sumEmployeeDepartment++;
                sumSalaryDepartment += emp.getSalary();
            }
        }
        avgSalaryDepartment = sumSalaryDepartment / sumEmployeeDepartment;
        System.out.println("Средняя зарплата в отделе № " + numberDepartment + " = " + (float) avgSalaryDepartment);
    }

    public void salaryIndexationDepartment(int numberDepartment, int indexationPercent) {
        int indexationSalary = 0;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                indexationSalary = ((emp.getSalary() * indexationPercent) / 100) + emp.getSalary();
                System.out.println("Проиндексированная зарплата сотрудника отдела №" + numberDepartment + " " + emp.getName() + " = " + indexationSalary);
            }
        }
    }

    public void printDepartmentEmploee(int numberDepartment) {
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
            }
        }
    }

    public void findMinSalaryEmployee(int salarySize) {
        for (Employee emp : employees) {
            if (emp.getSalary() < salarySize) {
                System.out.println("Сотрудник с зарплатой меньше " + salarySize + " : " + emp.getId() + " " + emp.getName() + " " + emp.getSalary());
            }
        }
    }

    public void findMaxSalaryEmployee(int salarySize) {
        for (Employee emp : employees) {
            if (emp.getSalary() > salarySize) {
                System.out.println("Сотрудник с зарплатой больше " + salarySize + " : " + emp.getId() + " " + emp.getName() + " " + emp.getSalary());
            }
        }
    }

    public void changeDepartment(String name, int newNumberDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i].setNumberDepartment(newNumberDepartment);
                System.out.println("У сотрудника " + employees[i].getName() + " изменился № отдела на " + newNumberDepartment);
            }
        }
    }

    public void changeSalary(String name, int newSalarySum) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i].setSalary(newSalarySum);
                System.out.println("У сотрудника " + employees[i].getName() + " изменилась зарплата на " + newSalarySum);
            }
        }
    }

    public void printEmployeeDepartment() {
        for (Employee emp : employees) {
            System.out.println("№ отдела " + emp.getNumberDepartment() + " сотрудник " + emp.getName());
        }
    }
}
