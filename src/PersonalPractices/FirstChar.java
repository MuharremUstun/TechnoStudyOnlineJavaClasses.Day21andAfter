package PersonalPractices;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args) {
//        String[] strings = {"salt", "tea", "soda", "toast"};
        String[] strings = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"};
        System.out.println(firstChar(strings));
    }

    static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String word : strings) {
            String key = word.substring(0, 1);
            if (map.containsKey(key)) {
                String value = map.get(key).concat(word);
                map.put(key, value);
            } else map.put(key, word);
        }
        return map;
    }
}
