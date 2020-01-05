package OfficeHours;

public class SixteenDigitStringExercise {
    public static void main(String[] args) {
        String code = "65";
        char[] charCode = code.toCharArray();
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < charCode.length; i += 2) {
            evenSum += Character.getNumericValue(charCode[i]);
        }
        for (int i = 1; i < charCode.length; i += 2) {
            oddSum += Character.getNumericValue(charCode[i]);
        }
        System.out.println("evenSum is " + evenSum);
        System.out.println("oddSum is " + oddSum);

        if ((evenSum + oddSum) % 10 == 0) {
            System.out.println(code + " is a valid cart number.");
        } else {
            System.out.println(code + " is NOT a valid cart number.");
        }
    }


}
