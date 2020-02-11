package Day37.StringBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StringBuilderExample1 {
    public String getInitials (List<String> names) {
        StringBuilder result = new StringBuilder();

        for (String name : names) {
            result.append(name, 0, 1);
        }

        return result.toString();
    }

    @Test
    public void Test1(){
        List<String> names = Arrays.asList("Max", "Susan", "Doroty");
        String expected = "MSD";
        String actual = getInitials(names);
        Assertions.assertEquals(expected, actual);
    }
}
