package PersonalPractices;

import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceIsWithIsNot {
    public static void main(String[] args) {
        String str = "is-is";
        System.out.println(notReplace(str));

        {
//        String pattern = "[^A-Za-z]is";
////        String pattern = "Dogs can";
////        String replace = " is not ";
//        String group;
//        String newgroup;
//        String newstr = "";
//        str = "0".concat(str).concat("0");
//        Pattern pat = Pattern.compile(pattern);
//        Matcher mat = pat.matcher(str);
//        int kaldigiYer = 0;
//        while (mat.find()) {
//            if(!Character.isLetter(str.charAt(mat.end()))) {
//            group = mat.group();
////                System.out.println(group);
////                newgroup = group.concat(" not");
//                newstr = newstr.concat(str.substring(kaldigiYer, mat.start()+3)).concat(" not");
//                kaldigiYer = mat.start()+3;
////            newstr = newstr.concat(str.substring(0, mat.start() + 3)).concat(" not").concat(str.substring(mat.start() + 3));
//
//            }
//
////
////            System.out.println(mat.replaceAll(newgroup));
////            System.out.println("Group:" + mat.group() + "\tNew Group:" + newgroup);
//        } System.out.println(newstr.concat(str.substring(kaldigiYer)));
//        str = mat.replaceAll(replace);
//        System.out.println(str);


//        str = "0".concat(str).concat("000");
//
//        for (int i = 1; i < str.length()-1; i++) {
//            if (!Character.isLetter(str.charAt(i - 1))
//                    && str.substring(i, i + 2).equals("is")
//                    && !Character.isLetter(str.charAt(i + 2))) {
//                newstr = newstr.concat(str.substring(i - 1, i + 2)).concat(" not").concat(str.substring(i+2, i+3));
//                str = str.substring(i + 2);
//
//            } else {
//
//                newstr = newstr.concat(str.substring(i - 1, i));
//                str = str.substring(i);
//
//            }
//        }
//        System.out.println(newstr.substring(1));
//

//            else if (str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i+2))) {
//                newstr = newstr.concat(str.substring(i, i+2)).concat(" not");
//                str = str.substring(i+2);
//            }
//        }


//        str = "0".concat(str).concat("0");
//        for (int i=0; i<str.length()-1; i++) {
//            if(str.substring(i, i+2).matches("[^A-Za-z]?is[^A-Za-z]?")){
//                newstr = newstr.concat(str.substring(i-1, i+2)).concat(" not").concat(str.substring(i+2, i+3));
//                i=i+3;
//            } else newstr = newstr.concat(str.substring(i-1, i));
//        }
//        newstr=newstr.concat(str.substring(str.length()-3));
//        System.out.println(newstr.substring(1, newstr.length()-1));


//        newstr = str.replaceAll("[^A-Za-z]is[^A-Za-z]", " is not ");
//        System.out.println(newstr);


//        Pattern pat = Pattern.compile("[^A-Za-z]is[^A-Za-z]");
//        Matcher mat = pat.matcher(str);
//        newstr = mat.region(1,3).replaceAll("is not");
//        System.out.println(newstr);
        }

    }

    static String notReplace(String str) {

        String pattern = "[^A-Za-z]is";
        String newstr = "";
        int kaldigiYer = 0;

        str = "0".concat(str).concat("0");

        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(str);

        while (mat.find()) {

            if(!Character.isLetter(str.charAt(mat.end()))) {
                newstr = newstr.concat(str.substring(kaldigiYer, mat.start()+3)).concat(" not");
                kaldigiYer = mat.start()+3;
            }


        }

        String result = newstr.concat(str.substring(kaldigiYer));
        return result.substring(1, result.length()-1);

    }


}
