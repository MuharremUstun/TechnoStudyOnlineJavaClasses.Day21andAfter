package OfficeHours;

import java.util.ArrayList;

public class ComparingArrayLists {
    public static void main(String[] args) {
        ArrayList<String> animals1 = new ArrayList<>();
        animals1.add("Lion");
        animals1.add("Bird");
        animals1.add("Cat");
        animals1.add("Elephant");
        animals1.add("Cow");

        ArrayList<String> animals2 = new ArrayList<>();
        animals2.add("Lion");
        animals2.add("Bird");
        animals2.add("Cat");
        animals2.add("Giraffe");
        animals2.add("Cow");
boolean isSame = true;
        for (int i = 0; i < animals1.size(); i++) {
            if(!animals1.get(i).equals(animals2.get(i))) {
               isSame = false;
                break;
            }
        }
        if (isSame) System.out.println("The ArrayLists are the same.");
        else System.out.println("The ArrayLists are NOT the same.");
    }
}
