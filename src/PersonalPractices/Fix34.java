package PersonalPractices;

public class Fix34 {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 1, 4};
//        int[] nums = {1, 3, 1, 4, 4, 3, 1};
//        int[] nums = {3, 2, 2, 4 };
        int[] nums = {6, 3, 5, 4, 4, 4, 2, 3,1, 0,9, 7, 3, 0 };
        int[] result = fix34(nums);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    private static int[] fix34(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int count3 = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 3) {
                res[i] = 3;
                res[i + 1] = 4;
                count3++;
            }
        }
        int[] residue = new int[len - 2 * count3];
        for (int i = 0, j = 0; i < len && j < residue.length; i++, j++) {
            if (nums[i] != 3 && nums[i] != 4) {
                residue[j] = nums[i];
            } else {
                j--;
            }
        }
        int index = 0;
        for (int i = 0; i < residue.length; i++) {
            for (int j = index; j < res.length; j++) {
                if(res[j] != 3 && res[j] != 4) {
                    res[j] = residue[i];
                    index++;
                    break;
                }
                index++;
            }
        }

//        for (int i = 0, j = 0; i < len && j < len; i++, j++) {
//            if (nums[i] != 3 && nums[i] != 4) {
//                res[j] = nums[i];
//            } else if (nums[i] == 3) {
//                j++;
//            } else if (nums[i] == 4) {
//                --j;
//            }
//        }

        return res;
    }
}
