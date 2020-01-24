package Day26;

public class ArrayExercises {
    public static void main(String[] args) {
        System.out.println("\nTask 1 -------------------------");
        int[] arr = {Integer.MIN_VALUE};
        int max = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        boolean noPreMax = true;
        for (int num : arr) {
            if(max == preMax && num == Integer.MIN_VALUE) noPreMax = false;
            if (num > max) {
                if (max > preMax || num == Integer.MIN_VALUE) {
                    preMax = max;
                    noPreMax = false;
                }
                max = num;
            }
        }
        System.out.println("Max num is " + max);
        if (noPreMax) System.out.println("There is no PreMax number.");
        else
            System.out.println("PreMax is " + preMax);

    }
}
