package Day48.Task1;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("meaw");
    }

    @Override
    public void feed() {
        Food food = new Food("Whiskas", 10.5, 500);
        System.out.println("This animal eats " + food.getBrand());
    }
}
