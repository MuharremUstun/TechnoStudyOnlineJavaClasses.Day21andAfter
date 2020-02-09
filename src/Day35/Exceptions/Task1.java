package Day35.Exceptions;

public class Task1 {
    public static void main(String[] args) {
        try {
            String[] words = {"Hi", "Hello", null};
            for (String word : words) {
                System.out.println(word.charAt(0));
            }
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally part");
        }

        System.out.println("End of the code.");
    }
}
