//
// Employee.java
// Property of Framework LLC
// Author - Tim Sarkisiani
//

public class Employee extends Person {
    private String surname;
    private double salary;
    private String department;

    public Employee(String name, int age, String surname, double salary, String department) {
        super(name, age);
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public void checkSalary() {
        if (salary > 6000) {
            System.out.println("High salary");
        } else if (salary < 2000) {
            System.out.println("Low salary");
        } else {
            System.out.println("Average salary");
        }
    }
}