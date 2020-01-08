package PersonalPractices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {
        String word = "abi";
        String str = "lkAxyAxyByf";
        System.out.println(str.indexOf(word,4));

//        Pattern pat = Pattern.compile(".?" + word + ".?");
//        Pattern pat = Pattern.compile("(.?)" + word + "(.?)");
//        Matcher mat = pat.matcher("lkAxyAhBxyByf");
//        String result = mat.group();
//        System.out.println(result);

//        System.out.println(Pattern.compile(".?" + word + ".?"));
//        String result = str.replaceAll(".?" + word + ".?", "-");
//        String result = str.replaceAll("(?!\bxy\b).", "");
//        String result = str.replaceAll("[^xy]", "+");
    }
}
