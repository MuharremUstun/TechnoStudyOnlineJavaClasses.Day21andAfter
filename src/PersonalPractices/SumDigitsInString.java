package PersonalPractices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumDigitsInString {
    public static void main(String[] args) {
        String str = "k2j3hh920gd3ff4";
        Pattern pat = Pattern.compile("[0-9]");
        Matcher mat = pat.matcher(str);
        String digits = mat.group();
        System.out.println(digits);



    }
}
