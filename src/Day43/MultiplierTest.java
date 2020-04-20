package Day43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MultiplierTest {

    @Test
    void testMultiply2int() {
        int x = 4;
        int y = 5;
        int expected = x * y;
        int actual = new Multiplier().multiply(4, 5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiply3int() {
        int x = 7;
        int y = 6;
        int z = 8;
        int expected = x * y * z;
        int actual = new Multiplier().multiply(7, 6, 8);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiplyListOfInt() {
        List<Integer> list = Arrays.asList(2, 5, 9, 10, 2, 4);
        int expected = 2 * 5 * 9 * 10 * 2 * 4;
        int actual = new Multiplier().multiply(list);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMultiply2Doubles() {
        double x = 2.524662;
        double y = 6.926464;
        double expected = x * y;
        double actual = new Multiplier().multiply(2.524662, 6.9264649);
        Assertions.assertEquals(expected, actual, 0.00001);
    }
}