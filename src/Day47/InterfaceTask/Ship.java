package Day47.InterfaceTask;

public class Ship implements Floatable {

    @Override
    public void floats() {
        System.out.println("Ships float.");
    }

    @Override
    public int speed() {
        return 200;
    }
}
