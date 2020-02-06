package Day31;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FoodTest {


    @Test
    void hasButter() {
        Food food = new Food();
        food.oil = "butter";
        boolean actual = food.hasButter("butter");

        assertEquals(true, actual);
    }

    @Test
    void taste() {
//        assertEquals();
    }
}