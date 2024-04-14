import employees.Employee;
import employees.Manager;
import employees.Worker;
public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Franek Kowalski", 1000);
        employees[1] = new Worker("Mateusz Kowalski", 2000);
        employees[2] = new Employee("Bartek Kowalski", 3000);
        employees[3] = new Employee("Ewa Kowalska", 4000);
        employees[4] = new Worker("Paweł Kowalski", 5000);
        employees[5] = new Manager("Sebastian Kowalski", 6000);
        employees[6] = new Worker("Natalia Kowalska", 7000);

        ((Worker) employees[1]).setPosition("Technik 1");

        ((Worker) employees[4]).setPosition("Technik 2");

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);

        employees[0].setSalary(7500);

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(3);
                employee.setSalary(7500);
            }
        }

        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}