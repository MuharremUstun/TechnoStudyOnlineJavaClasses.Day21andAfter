package Day48.Task1;

import Day37.task1.Car;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Animal tekir = new Cat();
        Animal yumak = new Cat();
        Animal sarisin = new Cat();
        Animal mirnav = new Cat();
        Animal atilgan = new Dog();
        Animal benekli = new Dog();
        Animal yaramaz = new Dog();
        Animal zumrut = new Bird();
        Animal boncuk = new Bird();
        Animal mavis = new Bird();

        Animal[] zoo = new Animal[]{tekir, yumak, sarisin, mirnav, atilgan, benekli, yaramaz, zumrut, boncuk, mavis};

        for (Animal animal : zoo) {
            animal.sound();
        }

        for (Animal animal : zoo) {
            if (animal instanceof Bird) {
                System.out.println("This is a special animal");
            }
        }

//        Food catFood = new Food("Whiskas", 10.5, 500);
//        Food dogFood = new Food("Priskee", 8.58, 700);
//        Food birdFood = new Food("Seedesh", 5.72, 15);

        for (Animal animal : zoo) {
            animal.feed();
        }

    }
}
