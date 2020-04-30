package Day48.Task1;

public class Bird implements Animal {
    int number = num + 1;

    @Override
    public void sound() {
        System.out.println("chik-chik");
    }

    @Override
    public void feed() {
        Food food = new Food("Seedesh", 5.72, 15);
        System.out.println("This animal eats " + food.getBrand());
    }
}
