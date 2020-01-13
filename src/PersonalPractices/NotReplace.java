package PersonalPractices;

public class NotReplace {
    public static void main(String[] args) {
        String str = "is";
        System.out.println(notReplace2(str));
    }

    private static String notReplace2(String str) {
        String res = "";
        if (str.length() < 2) return str;
        else {
            str = "0".concat(str).concat("0");
            for (int i = 0; i < str.length() - 3; i++) {
                if (!Character.isLetter(str.charAt(i))
                        && str.substring(i + 1, i + 3).equals("is")
                        && !Character.isLetter(str.charAt(i + 3))) {
                    res = res.concat(str.substring(i, i + 3)).concat(" not");
                    i += 2;
                } else res = res.concat(str.substring(i, i + 1));
            }
            if (   !str.substring(str.length()-3, str.length()-1).equals("is")
                || (   str.substring(str.length()-3, str.length()-1).equals("is")
                    && Character.isLetter(str.charAt(str.length()-4)))               )
                res = res.concat(str.substring(str.length()-3, str.length()-1));
        }
        return res.substring(1);
    }
}
