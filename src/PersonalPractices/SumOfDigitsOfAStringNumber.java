package PersonalPractices;

public class SumOfDigitsOfAStringNumber {
    public static void main(String[] args) {
        String srtNum = "26876842";
        int num = Integer.parseInt(srtNum);
        System.out.println("Sum of the digits of the number value of " + srtNum + " is " + strToIntValue(num));
    }

    private static int strToIntValue(int n) {
       int sum = 0, m;
        while (n > 0) {
            m = n%10;
            sum +=m;
            n/=10;
        }
        return sum;
    }
}
