package Day37.task1;

public class Car {
    public String name;
    public int year;

    Profile profile = new Profile();

    public Car(String name, int year, String color, int numberOfDoors, double engine) {
        this.name = name;
        this.year = year;

        profile.color = color;
        profile.numberOfDoors = numberOfDoors;
        profile.engine = engine;

    }

    public String toString () {
        String result = "";
        result += "Name of the car: " + this.name + "\n"
                + "Model year: " + this.year + "\n"
                + "Color of the car: " + profile.color + "\n"
                + "Number of doors: " + profile.numberOfDoors + "\n"
                + "Volume of the engine: " + profile.engine + "\n";
        return result;
    }

}
