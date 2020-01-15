package Day22;

import java.util.HashMap;

public class ExercisesHashMap {
    public static void main(String[] args) {
        String[] firstNames = {"\"Max\"", "\"Drake\"", "\"Susan\""};
        String[] lastNames = {"\"Smith\"", "\"Jones\"", "\"Miller\""};
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < firstNames.length; i++) {
            map.put(firstNames[i], lastNames[i]);
        }
        System.out.println(map);
    }
}
