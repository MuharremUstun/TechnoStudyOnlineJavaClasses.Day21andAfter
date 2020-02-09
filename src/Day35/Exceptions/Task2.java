package Day35.Exceptions;

public class Task2 {
    public static Integer stringToTheInteger(String number) {
        Integer integer = null;
        try {
           integer = Integer.valueOf(number);
        } catch (Exception e) {
            System.out.println("Use digits only.");
        }
        return integer;
    }

    public static void main(String[] args) {

            System.out.println(stringToTheInteger("one"));
            System.out.println(stringToTheInteger("-8"));
            System.out.println(stringToTheInteger("2"));

    }
}
