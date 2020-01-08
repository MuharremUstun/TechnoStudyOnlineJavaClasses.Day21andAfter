package PersonalPractices;

import org.w3c.dom.ls.LSOutput;

public class LastIndexOfMethod {
    public static void main(String[] args) {
        String str1 = "This is a sample sentence.";
        String str2 = "en";
        int index = str1.lastIndexOf('z');
        System.out.println(index);
    }

    public boolean sameStarChar(String str) {
        String[] arr = str.split("[*]");
        boolean isSame = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].charAt(arr[i - 1].length() - 1) != arr[i].charAt(0)) isSame = false;
            break;
        }
        return isSame;
    }
}