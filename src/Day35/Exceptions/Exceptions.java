package Day35.Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } finally {
            System.out.println("Finally part");
        }

        System.out.println("End of the code.");
    }
}
