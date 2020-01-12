package PersonalPractices;

public class CenteredAverage {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 100 };
        System.out.println(centeredAverage(nums));
    }
    static int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        int average;
        int centeredSum;
        int centeredNum;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min) {
                min = nums[i];
            }
            sum+=nums[i];
        }
        centeredSum = sum - max - min;
        centeredNum = nums.length-2;
        average = centeredSum / centeredNum;
        return average;




    }
}
