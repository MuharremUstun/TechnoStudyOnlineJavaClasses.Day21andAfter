package PersonalPractices;

public class xyzThereCodingBat {
    public static void main(String[] args) {
        String str = "abcxyz";
        System.out.println(xyzThere(str));
    }

    private static boolean xyzThere(String str) {
        boolean result = false;
        if (str.length() < 4) {
            if (str.equals("xyz")) result = true;
        } else for (int i = 1; i <= str.length() - 3; i++) {
            if (!str.substring(i - 1, i).equals(".") && str.substring(i, i + 3).equals("xyz"))
                result = true;
            break;
        }
        return result;
    }
}