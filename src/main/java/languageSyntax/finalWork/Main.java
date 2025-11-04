package languageSyntax.finalWork;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 100_000);
        Employee petrov = new Employee("Петров Петр Петрович", 1, 55_000);
        Employee sidorov = new Employee("Сидоров Иван Иванович", 1, 65_000);
        Employee makarov = new Employee("Макаров Макар Макарович", 2, 70_000);
        Employee karaev = new Employee("Караев Алексей Вячеславович", 2, 75_000);

        employeeBook.addEmployee(ivanov);
        employeeBook.addEmployee(petrov);
        employeeBook.addEmployee(sidorov);
        employeeBook.addEmployee(makarov);
        employeeBook.addEmployee(karaev);
        employeeBook.printAllEmployees();
        employeeBook.sumSalary();
        employeeBook.minSalaryEmployee();
        employeeBook.maxSalaryEmployee();
        employeeBook.averageSalary();
        employeeBook.fioEmployee();
        employeeBook.salaryIndexation(10);
        employeeBook.minSalaryDepartment(1);
        employeeBook.maxSalaryDepartment(2);
        employeeBook.sumSalaryDepartment(2);
        employeeBook.avgSalaryDepartment(1);
        employeeBook.salaryIndexationDepartment(2, 10);
        employeeBook.printDepartmentEmploee(1);
        employeeBook.findMaxSalaryEmployee(70_000);
        employeeBook.findMinSalaryEmployee(60_000);
        employeeBook.removeEmployee("Караев Алексей Вячеславович");
        employeeBook.printAllEmployees();
        employeeBook.addEmployee(karaev);
        employeeBook.printAllEmployees();
        employeeBook.changeDepartment("Макаров Макар Макарович", 1);
        employeeBook.printAllEmployees();
        employeeBook.changeSalary("Петров Петр Петрович", 75_000);
        employeeBook.printEmployeeDepartment();
    }
}
