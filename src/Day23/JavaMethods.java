package Day23;

public class JavaMethods {
    public static void main(String[] args) {
        int sum = addTwoNumbers (4, 56);
        System.out.println("The sum is " + sum);

        double ave = averageOfThreeNumbers(23, 45, 68);
        System.out.println("The average is " + ave);
    }

    private static int addTwoNumbers(int x, int y) {
        return x + y;
    }

    private static double averageOfThreeNumbers (int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
