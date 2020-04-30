package Day48.Task1;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("woof");
    }

    @Override
    public void feed() {
        Food dogFood = new Food("Priskee", 8.58, 700);
        System.out.println("This animal eats " + dogFood.getBrand());
    }
}
