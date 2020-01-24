package Day26;

import java.util.HashSet;
import java.util.List;

public class RepetitiveLetters {
    public static void main(String[] args) {
        char[] letters = {'a', 'a', 'a', 'a', 'a', 'a'};
        HashSet<Character> list = new HashSet<>();
        boolean repetetive = false;
        for (char letter : letters) {
            if (list.contains(letter)) {
                repetetive = true;
            } else {
                list.add(letter);
            }
        }
        System.out.println(repetetive);
    }
}
