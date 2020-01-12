package PersonalPractices;

public class SeriesUp {
    public static void main(String[] args) {
        int n = 3;
        int[] series = new int[n*(n+1)/2];
        int index = 0;
        for(int k=1; k<=n; k++){
            for(int i = 1; i <= k; i++) {
//                index = i+k-2;
                series[index] = i;
                index++;
            }
        }
        for (int i : series) {
            System.out.print(i + " ");
        }
    }
}
