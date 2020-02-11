package Day37.StringBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringBufferAlphabet {
    public static String alphabet (){
        StringBuffer sb = new StringBuffer();
        for (char i = 'A'; i <= 'Z'; i++){
            sb.append(i);
        }
     return sb.toString();
    }



    @Test
    public void testAlphabet (){
        Assertions.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", alphabet());
    }

//    public static void main(String[] args) {
//        System.out.println(alphabet());
//
//    }
}
