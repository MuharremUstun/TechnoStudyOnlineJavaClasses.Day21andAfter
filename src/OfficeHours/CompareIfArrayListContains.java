package OfficeHours;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CompareIfArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> animals1 = new ArrayList<>();
        animals1.add("Lion");
        animals1.add("Bird");
        animals1.add("Cat");
        animals1.add("Cow");
        animals1.add("Giraffe");
        animals1.add("Elephant");
        animals1.add("Fox");


        ArrayList<String> animals2 = new ArrayList<>();
        animals2.add("Lion");
        animals2.add("Bird");
        animals2.add("Cat");
        animals2.add("Giraffe");
        animals2.add("Cow");
        animals2.add("Elephant");
        animals2.add("Fox");


        HashSet<String> hashAnimals1 = new HashSet<>(animals1);
        HashSet<String> hashAnimals2 = new HashSet<>(animals2);

        boolean isSame = true;
        if(!hashAnimals1.containsAll(hashAnimals2) || !hashAnimals2.containsAll(hashAnimals1)) isSame = false;

//        for (String animal : hashAnimals1) {
//            if(!hashAnimals2.contains(animal)) {
//                isSame = false;
//                break;
//            }
//        }
//        for (String animal : hashAnimals2) {
//            if(!hashAnimals1.contains(animal)) {
//                isSame = false;
//                break;
//            }
//        }
        if (isSame) System.out.println("The ArrayLists contains the same elements.");
        else System.out.println("The ArrayLists are DOES NOT contain the same elements.");
    }
}
