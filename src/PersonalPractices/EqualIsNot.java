package PersonalPractices;

import javax.swing.plaf.IconUIResource;

public class EqualIsNot {
    public static void main(String[] args) {
        String str = "This is not and not";
        String IS = "is";
        String NOT ="not";
        System.out.println(str.replace(IS, ""));
        System.out.println(str.replaceFirst(IS, ""));


       int counter = countsSubstringInString(str, IS);
        System.out.println(counter);
    }
    private static int countsSubstringInString(String str, String subStr) {
        int count = 0;
        int index = str.indexOf(subStr);
        while (index>=0) {
            count++;
            str = str.replaceFirst(subStr, "");
            index = str.indexOf(subStr);
        }
        return count;

    }
}
