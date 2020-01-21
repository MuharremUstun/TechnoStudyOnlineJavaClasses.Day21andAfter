package Day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTasks {
    public static void main(String[] args) {
        System.out.println("Task 1 ----------------------");
        int[] arr = {1, 3, 9, 4, 90, 34, 19, 72, 105, 105};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 2 -------------------------");
        int m = 3;
        int n = 4;
        int[][] arrays = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }

//        char[] charArray = new char[5];
//        System.out.println(Arrays.toString(charArray));
        System.out.println("\nTask 3 -------------------------");
        boolean ifContains = false;
        int checkValue = 34;
        for (int i : arr) {
            if (i == checkValue) {
                ifContains = true;
            }
        }
        if (ifContains) System.out.println("The array contains " + checkValue);
        else System.out.println("The array DOES NOT contain " + checkValue);

//        List<Integer> list = Arrays.asList(2, 3, 4, 1, 6, 7, 9);
//        list.remove(Integer.valueOf(9));
//        System.out.println(list);
        System.out.println("\nTask 4 -------------------------");
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % 2 == 0) list.add(i);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        System.out.println("\nTask 5 -------------------------");
        int k = arr.length-1;
        while (k >= 0) {
            System.out.print(arr[k] + " ");
            k--;
        }
        System.out.println();

        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
            System.out.println(arr[i] + " " + arr[j]);
        }

        System.out.println("\nTask 5 -------------------------");
        int max = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                preMax = max;
                max = num;
            }
//            if (num < max && num >= preMax) preMax = num;
        }
        System.out.println("Max num is " + max);
        System.out.println("PreMax is " + preMax);

    }
}
