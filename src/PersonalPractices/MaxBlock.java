package PersonalPractices;

public class MaxBlock {
    public static void main(String[] args) {
        String str = "hoople";
        int max = 0, count =0;
        for(int i=0; i<str.length()-1; i++) {
            for(int j=i; j<str.length()-1; j++){
                if(str.charAt(j)==str.charAt(j+1)) {
                    count++;
                } else break;
            }
            if(count>max) max = count;
        }
    }
}
