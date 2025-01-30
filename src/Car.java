//
// Car.java
// Property of Framework LLC
// Author - Tim Sarkisiani
//

public class Car extends Vehicle {
    private int year;
    private String type;
    private int doors;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}