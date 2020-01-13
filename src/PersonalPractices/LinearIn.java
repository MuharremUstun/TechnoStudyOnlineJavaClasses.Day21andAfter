package PersonalPractices;

import java.lang.module.FindException;

public class LinearIn {
    public static void main(String[] args) {
        int[] outer = {-1, 0, 3, 3, 3, 10, 12};
        int[] inner = {0, 3, 12, 14};
//        boolean result = linearIn(outer,inner);
        boolean result = linearIn2(outer,inner);
        System.out.println(result);
    }

    private static boolean linearIn2(int[] outer, int[] inner) {
        int index = 0;
        boolean res = true;
        for (int i = 0; i < inner.length; i++) {
            for (int o = index; o < outer.length; o++) {
                if (outer[o] == inner[i]) {
                    index = o+1;
                    if (o == outer.length-1 && i != inner.length - 1 ) {
                        res = false;
                    }
                    break;
                }
                if (o == outer.length-1 /* && i != inner.length - 1 */) {
                    res = false;
                    break;
                }
//                if(index == outer.length) {
//                    res = false;
//                    break;
//                }
            }
        }
        return res;
    }

    static boolean linearIn(int[] outer, int[] inner) {
//        int k = 0;
        boolean elemThere;
        boolean res = true;
        for(int i = 0; i < inner.length; i++) {
            for(int j = 0; j < outer.length; j++) {
                elemThere = false;
                if (inner[i] == outer[j]) {
//                    k = j++;
                    elemThere = true;
                    break;
                }
            }
            if(elemThere = false) break; else res = elemThere;
        }
        return res;
    }

}

