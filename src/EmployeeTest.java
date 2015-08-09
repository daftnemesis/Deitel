public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jose", "Lozano", 1000);
        Employee employee2 = new Employee("Juan", "Gomez", 2000);

        employee1.showSalary();
        employee2.showSalary();

        employee1.addRaise();
        employee2.addRaise();

        System.out.println("Adding a %10 of raise");
        employee1.showSalary();
        employee2.showSalary();

    }



}
