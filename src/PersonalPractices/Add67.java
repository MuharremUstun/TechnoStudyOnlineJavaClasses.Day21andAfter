package PersonalPractices;

public class Add67 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
        System.out.println(add67(nums));
    }

    private static int add67(int[] nums) {
        int sum = 0;
        boolean met6 = false;
        boolean met7 = false;

        for (int i = 0; i < nums.length; i++) {
            if (!met6 && nums[i] == 6) {
                met6 = true;
                met7 = false;
            }
            if (met6 && !met7 && nums[i] == 7) {
                met7 = true;
                met6 = false;
            }
            else if (met6 && !met7)
                continue;
            else
                sum += nums[i];
        }
        return sum;

    }
// if (!met6 && met7)  (met6 && !met7)  (!met6 && !met7)  (met6 && met7)
//      add               !add            add                add


}
