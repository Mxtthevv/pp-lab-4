public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Franek Kowalski", 1000);
        employees[1] = new Employee("Mateusz Kowalski", 2000);
        employees[2] = new Employee("Bartek Kowalski", 3000);
        employees[3] = new Employee("Ewa Kowalska", 4000);
        employees[4] = new Employee("Paweł Kowalski", 5000);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(6000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}