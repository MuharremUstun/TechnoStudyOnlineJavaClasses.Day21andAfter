package Day37.StringBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseString {
    public String reverseString (String yourString) {
        StringBuilder string = new StringBuilder(yourString);
        StringBuilder reverse = string.reverse();
        String result = reverse.toString();
        return result;
    }


    public void test1(){
        String str = "";
        String actual = reverseString(str);
        String expected = "";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2 (){
        String str = "Something";
        String actual = reverseString(str);
        String expected = "gnihtemoS";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3 (){
        String str = "Muharrem";
        String actual = reverseString(str);
        String expected = "merrahuM";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4 (){
        String str = "Termos   ";
        String actual = reverseString(str);
        String expected = "   somreT";
        Assertions.assertEquals(expected, actual);
    }
}
