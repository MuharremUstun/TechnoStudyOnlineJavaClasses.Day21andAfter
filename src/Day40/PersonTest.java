package Day40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p = new Person();
        p.setName("Techno");
        String actual = p.getName();
        String expected = "Techno";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setName() {
        Person s = new Person();
        s.setName("Techno");
        String actual = s.getName();
        Assertions.assertEquals("Techno", actual);
    }
}