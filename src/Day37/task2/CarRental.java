package Day37.task2;

import Day37.task1.Car;

public class CarRental {
    public Car car;
    public Driver driver;
    public License license;

    public String toString() {
        String result = "";
        result += "Name of the car: " + car.name + "\n"
                + "Year of the car: " + car.year + "\n"
                + "Full name of the driver: " + driver.fullName + "\n"
                + "Age of the driver: " + driver.age + "\n";

        return result;
    }
}