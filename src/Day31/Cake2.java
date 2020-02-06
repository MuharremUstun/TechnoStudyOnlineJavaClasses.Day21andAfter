package Day31;

class Cake {
    int fruits;
    String color;
    String name;

//    public Cake(int numOfFruits, String cakeColor) {
//        fruits = numOfFruits;
//        color = cakeColor;
//    }

    public Cake(int numOfFruits, String n, String cakeColor) {
        fruits = numOfFruits;
        name = n;
        color = cakeColor;

    }

    public Cake(String cakeColor, int numOfFruits, String n) {
        color = cakeColor;
        fruits = numOfFruits;
        name = n;
    }

    public Cake(String cakeColor, String n, int numOfFruits) {
        name = n;
        color = cakeColor;
        fruits = numOfFruits;

    }

    public static void printAttributes(Cake cake) {
        System.out.print("Name of the cake is " + cake.name + ". ");
        System.out.print("Its color is " + cake.color + ". ");
        System.out.println("It has " + cake.fruits + " fruits.");
    }
}

public class Cake2 {
    public static void main(String[] args) {
        Cake applePie = new Cake("red", 2, "Apple Pie");
        Cake.printAttributes(applePie);

        Cake tramisu = new Cake(5, "Tramisu", "Yellow");
        Cake.printAttributes(tramisu);

        Cake birthdayCake = new Cake("White", "Birthday Cake", 3);
        Cake.printAttributes(birthdayCake);

    }


}
