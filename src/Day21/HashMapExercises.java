package Day21;
//https://beginnersbook.com/2013/12/hashmap-in-java-with-example/

import java.util.HashMap;
import java.util.Map;

public class HashMapExercises {
    public static void main(String[] args) {

        //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        System.out.println("Task 1 --------------------------------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Max", 54);
        map.put("Sergey", 100);
        map.put("Maxim", 78);
        map.put("Mahmut", 100);
        System.out.println(map.entrySet());

        //2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("\nTask 2 --------------------------------");
        int size = map.size();
        System.out.println("Map size is: " + size);

        //3. Write a Java program to copy all of the mappings from the specified map to another map.
        System.out.println("\nTask 3 --------------------------------");
        // 1. way: during declaration:
        HashMap<String, Integer> map2 = new HashMap(map);
        // 2. way: putAll
        HashMap<String, Integer> map3 = new HashMap<>();
        map3.putAll(map);
        // 3. way: loop
        HashMap<String, Integer> map4 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            map4.put(key, value);
        }
        System.out.println("1. map: " + map.entrySet());
        System.out.println("2. map: " + map2.entrySet());
        System.out.println("3. map: " + map3.entrySet());
        System.out.println("4. map: " + map4.entrySet());

        //4. Write a Java program to remove all of the mappings from a map.
        System.out.println("\nTask 4 --------------------------------");
        map2.clear();
        System.out.println(map2.entrySet());

        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("\nTask 5 --------------------------------");
        boolean isEmpty = map.isEmpty();
        boolean isEmpty2 = map2.isEmpty();
        System.out.println("Map is empty?: " + isEmpty);
        System.out.println("Map2 is empty?: " + isEmpty2);

        //6. Write a Java program to get a shallow copy of a HashMap instance.
        System.out.println("\nTask 6 --------------------------------");
        HashMap<String, Integer> shallowCopy = new HashMap<>();
        shallowCopy = map;
        System.out.println("Original map: " + map.entrySet());
        System.out.println("Shallow copy: " + shallowCopy.entrySet());

        //7. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("\nTask 7 --------------------------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            boolean ifContains = map.containsKey(entry.getKey());
            if (ifContains) {
                System.out.println("The map contains: " + entry.getValue());
            } else System.out.println("The map does not contain: " + map.get(entry.getKey()));
        }

        //8. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("\nTask 8 --------------------------------");
        int value = 100;

        if (map.containsValue(value)) System.out.println("The map has " + value);
        else System.out.println("The map does not have a value of " + value);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) System.out.println("You have " + value + " on " + entry.getKey());
        }

        //9. Write a Java program to create a set view of the mappings contained in a map.
        System.out.println("\nTask 9 --------------------------------");
        System.out.println(map);

        //10. Write a Java program to get the value of a specified key in a map.
        System.out.println("\nTask 10 --------------------------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Value of " + entry.getKey() + " is " + entry.getValue());
        }

        //11. Write a Java program to get a set view of the keys contained in this map.
        System.out.println("\nTask 11 --------------------------------");
        System.out.println(map.keySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ", ");
        }
        System.out.println();

        //12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("\nTask 12 --------------------------------");
        System.out.println(map.values());

        //13. Create a map of at least 5 entries and calculate the sum of the vlues.
        System.out.println("\nTask 13 --------------------------------");
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Apple", 4.2);
        prices.put("Orange", 3.1);
        prices.put("Banana", 0.7);
        prices.put("Pear", 1.9);
        prices.put("Pineapple", 5.5);

        double sum = 0;
        for (Double entry : prices.values()) {
            sum += entry;
        }
        System.out.println(prices.entrySet());
        System.out.println("Sum of the values of prices is: $" + sum);

        //14. Print list of the keys and list of the values without the brackets [ ] and commas.
        System.out.println("\nTask 14 --------------------------------");
        for (String fruit : prices.keySet()) {
            System.out.print(fruit + "     ");
        }
        System.out.println();
        for (Double price : prices.values()) {
            System.out.print(price + "      ");
        }
        System.out.println();

        //15. Print list of the keys and list of the values without the brackets [ ] and commas LINE BY LINE.
        System.out.println("\nTask 15 --------------------------------");
        for (Map.Entry<String, Double> e : prices.entrySet()) {
            System.out.println(e.getKey() + "       " + e.getValue());
        }

        //16. Change the values of first two entries
        System.out.println("\nTask 16 --------------------------------");
        System.out.println(prices);
        double appleValue = prices.get("Apple");
        double orangeValue = prices.get("Orange");
        prices.put("Apple", orangeValue);
        prices.put("Orange", appleValue);
        System.out.println(prices);

        //17. Count each letter in a string array and record them in a map.
        System.out.println("\nTask 17 --------------------------------");
        String arr = "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!";
        HashMap<Character, Integer> numsOfChars = new HashMap<>();
        for (int i = 0; i < arr.length(); i++) {
            if (numsOfChars.containsKey(arr.charAt(i))) {
                int val = numsOfChars.get(arr.charAt(i));
                val++;
                numsOfChars.put(arr.charAt(i), val);
            } else {
                numsOfChars.put(arr.charAt(i), 1);
            }
        }
        System.out.println(numsOfChars);
        // 2. way ---------------------------------
        HashMap<Character, Integer> numsOfChars2 = new HashMap<>();
        for( int i = 0; i < arr.length(); i++) {
            char ch = arr.charAt(i);
            if (!numsOfChars2.containsKey(ch)) {
                int charCounter = 0;
                for (int j = i; j < arr.length(); j++) {
                    if (arr.charAt(j) == ch) charCounter++;
                }
                numsOfChars2.put(ch, charCounter);
            }
        }
        System.out.println(numsOfChars2);




    }
}
