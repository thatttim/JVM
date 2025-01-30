//
// Main.java
// Property of Framework LLC
// Author - Tim Sarkisiani
//

public class Main {
    public static void main(String[] args) {
        // მანქანა
        Car car = new Car();
        car.setManufacturer("Tesla");
        car.setColor("White");
        car.setYear(2024);
        car.setType("Sedan");
        car.setDoors(4);
        System.out.println("Car Details:");
        System.out.println("Manufacturer: " + car.getManufacturer());
        System.out.println("Color: " + car.getColor());
        System.out.println("Year: " + car.getYear());
        System.out.println("Type: " + car.getType());
        System.out.println("Doors: " + car.getDoors());

        // სტუდენტი
        Student student = new Student("Tim", 21, "Computer Science", "BTU", 2.8);
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourseName());
        System.out.println("University: " + student.getUniversity());
        System.out.println("Average Grade: " + student.getAverageGrade());

        // თანამშრომელი
        Employee employee = new Employee("Tim", 21, "Sarkisiani", 4500, "IT");
        System.out.println("\nEmployee Salary Check:");
        employee.checkSalary();

        // ტელეფონები
        Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone();
        BasicPhone basicPhone = new BasicPhone();

        System.out.println("\nPhone Calls:");
        phone.makeCall();
        smartPhone.makeCall();
        basicPhone.makeCall();
    }
}
