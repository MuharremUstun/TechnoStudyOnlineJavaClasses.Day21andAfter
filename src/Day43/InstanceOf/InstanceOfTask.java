package Day43.InstanceOf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstanceOfTask {

    @Test
    void checkOnion1() {
        Vegetable onion = new Onion();
        boolean isOnion = onion instanceof Onion;
        Assertions.assertTrue(isOnion);
    }

    @Test
    void checkOnion2() {
        Vegetable cabbage = new Cabbage();
        Assertions.assertFalse(cabbage instanceof Onion);
    }
}
