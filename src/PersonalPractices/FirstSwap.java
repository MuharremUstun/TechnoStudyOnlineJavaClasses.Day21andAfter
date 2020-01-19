package PersonalPractices;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public static void main(String[] args) {
        String[] strings = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        printTheStrings(firstSwap(strings));
    }

    static String[] firstSwap(String[] strings) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length - 1; i++) {
            char ch1 = strings[i].charAt(0);
            if (!map.containsKey(ch1)) {
//                map.put(ch1, false);
                for (int j = i + 1; j < strings.length; j++) {
                    char ch2 = strings[j].charAt(0);
                    if (ch1 == ch2) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                        map.put(ch1, true);
                        break;
                    }


//            } else if (map.get(ch1) == false) {
//
//                }
                }
            }

        }
        return strings;
    }


    static void printTheStrings(String[] strings) {
        for (String word : strings) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}