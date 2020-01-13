package PersonalPractices;


public class MaxMirror {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 8, 9, 3, 2, 1 };
//        int[] nums = {7, 1, 2, 9, 7, 2, 1};
//        int[] nums = {1, 2, 1, 4 };
//        int[] nums = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};
//        int[] nums = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        int[] nums = {9, 1, 1, 4, 2, 1, 1, 1};

//        int result = maxMirror(nums);
        int result = maxMirror2(nums);
        System.out.println(result);
    }

    private static int maxMirror2(int[] nums) {
        int maxCount = 0;
        int count;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = len-1; j >= 0; j--) {
                if(nums[i] == nums[j]) {
                    count = countsMirror(nums, i, j);
                    if (count > maxCount) maxCount = count;
                }
            }
        }
        return maxCount;


    }

    private static int maxMirror(int[] nums) {
        int maxCount = 0;
        int count;
        int len = nums.length;
        for (int i = 0, j = len - 1; i < len && j >= 0; i++, j--) {
            if (nums[i] == nums[j]) {
                count = countsMirror(nums, i, j);
                if (count > maxCount) maxCount = count;
            } else if (i + 1 < len) {
                if (nums[i + 1] == nums[j]) {
                    count = countsMirror(nums, i + 1, j);
                    if (count > maxCount) maxCount = count;
                } else if (j -1 >= 0) {
                    if (nums[i] == nums[j - 1]) {
                        count = countsMirror(nums, i, j - 1);
                        if (count > maxCount) maxCount = count;
                    }
                }
            }
        }
        return maxCount;
    }

    private static int countsMirror(int[] nums, int i, int j) {
        int len = nums.length;
        int count = 0;
        for (int n = i, m = j; n < len && m >= 0; n++, m--) {
            if (nums[n] == nums[m]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }


}
