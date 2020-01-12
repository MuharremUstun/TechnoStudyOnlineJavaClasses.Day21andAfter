package PersonalPractices;

public class LinearIn {
    public static void main(String[] args) {
        int[] outer = {1,2,4,6};
        int[] inner = {2,4};
        System.out.println(linearIn(outer,inner));
//        int n = 0;
//        int[] square = new int[n*n];
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

