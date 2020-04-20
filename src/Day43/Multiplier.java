package Day43;

import java.util.ArrayList;
import java.util.List;

public class Multiplier {

    int multiply(int a, int b){
        return a * b;
    }

    int multiply(int a, int b, int c){
        return a * b * c;
    }

    double multiply(double a, double b){
        return a * b;
    }

    int multiply(List<Integer> list){
        int result = 1;
        for (Integer integer : list) {
            result *= integer;
        }
        return result;
    }

}
