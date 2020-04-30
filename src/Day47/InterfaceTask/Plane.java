package Day47.InterfaceTask;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Planes fly.");
    }

    @Override
    public int speed() {
        return 500;
    }
}
