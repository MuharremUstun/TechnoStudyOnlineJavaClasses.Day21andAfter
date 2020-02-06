package Day31;

public class Cake {
    int fruits;
    String color;
    public Cake(int numOfFruits, String cakeColor) {
        fruits = numOfFruits;
        color = cakeColor;
    }

    public Cake(int numOfFruits) {
        fruits = numOfFruits;
    }

    public Cake(String cakeColor){
        color = cakeColor;
    }

    public static void main(String[] args) {
        Cake applePie = new Cake(1, "Red");
        System.out.println("Applepie is " + applePie.color + " and it has " + applePie.fruits + " fruit(s).");

        Cake tramisu = new Cake("Yellow");
        System.out.println("Tramisu is " + tramisu.color + ".");

        Cake birthdayCake = new Cake(6);
        System.out.println("Birthday Cake has " + birthdayCake.fruits + ".");

    }



}
