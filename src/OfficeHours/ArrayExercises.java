package OfficeHours;

public class ArrayExercises {
    public static void main(String[] args) {
        String[] cities = {"London", "Paris", "Rome", "Barcelona", "Madrid"};
//        Reverse the cities London --> nodnoL
        for (String city : cities) {


            for (int c = city.length() - 1; c >= 0; c--) {
                System.out.print(city.charAt(c));
            }
            System.out.print(" ");
        }
/*
            Alternatively
            char city[] = cities[i].toCharArray();
*/

        System.out.println();
    }
}
