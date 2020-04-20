package Day43;

public class PolymorphismTask2 {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal fox = new Fox();
        ((Cat)cat).sleep();
        ((Dog)dog).brand();
        ((Fox)fox).sneak();

        System.out.println("--------------------------");

        Animal animal = new Cat();
        ((Animal)animal).sound();

        System.out.println("------------------------------");

//        Animal[] animals = {new Cat(), new Dog(), new Fox()};
//        for (Animal anml : animals) {
//            anml.sound();
//        }
    }
}
