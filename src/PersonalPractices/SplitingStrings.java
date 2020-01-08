package PersonalPractices;

import java.util.Collections;

public class SplitingStrings {
    public static void main(String[] args) {
        String str = "adfhvbrtkkfhj1v9681kjgj";
        String word = "[+]";
        System.out.println(word);
        String[] splitArr = str.split("[hv]");
        for (String s : splitArr) {
            System.out.println(s);
        }
//        String replacedStr = str.replaceAll(".", "+");
//        System.out.println(replacedStr);
    }
}