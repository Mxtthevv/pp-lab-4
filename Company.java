import employees.Employee;
import employees.Manager;
import employees.Worker;
public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Franek Kowalski", 1000);
        employees[1] = new Worker("Mateusz Kowalski", 2000);
        employees[2] = new Employee("Bartek Kowalski", 3000);
        employees[3] = new Employee("Ewa Kowalska", 4000);
        employees[4] = new Worker("Paweł Kowalski", 5000);

        ((Manager) employees[0]).setNumberOfSubordinates(0);

        ((Worker) employees[1]).setPosition("Technik 1");

        ((Worker) employees[4]).setPosition("Technik 2");

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}