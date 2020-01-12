package PersonalPractices;

import java.util.ArrayList;

public class MatchUp {
    public static void main(String[] args) {
        int[] num1 = { 0, 1, 2};
        int[] num2 = {2, 3, 1};
//        System.out.println(matchUp(num1, num2));

        int[] num3 = num1.clone();
        System.out.print("num3 is " );
        for (int i : num3) {
            System.out.print(i + " ");
        }
    }
    static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        int element1;
        for (int i = 0; i < nums1.length; i++) {
            element1 = nums1[i];

            if(Math.abs(element1) < 3 && Math.abs(nums1[i]) > 0){
                count++;
            }
        }
        return count;
    }

}
