public class Employee {

    private String name;
    private String lastName;
    private double salary;

    public Employee(String name, String lastName, double salary){
        this.name = name;
        this.lastName = lastName;

        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        }
    }

    public void showSalary(){
        System.out.printf("The yearly salary of %s %s is %.2f%n",
                getName(), getLastName(), getSalary() * 12);
    }

    public void addRaise(){
        this.salary = salary + (salary * 0.10);
    }


}