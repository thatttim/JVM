//
// Student.java
// Property of Framework LLC
// Author - Tim Sarkisiani
//

public class Student extends Person {
    private String courseName;
    private String university;
    private double averageGrade;

    public Student(String name, int age, String courseName, String university, double averageGrade) {
        super(name, age);
        this.courseName = courseName;
        this.university = university;
        this.averageGrade = averageGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getUniversity() {
        return university;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}