package Day42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @Test
    void getUsernameTest1() {
        Login gmail = new Login();
        gmail.setUsername("techno.study");

        String expected = "techno.study";
        String actual = gmail.getUsername();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getPasswordTest1() {
        Login gmail = new Login();
        gmail.setPassword("123abc");

        String expected = "123abc";
        String actual = gmail.getUsername();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPasswordTest2() {
        Login gmail = new Login();
        gmail.setPassword("123456");

        String expected = null;
        String actual = gmail.getUsername();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPasswordTest3() {
        Login gmail = new Login();
        gmail.setPassword("123ERT");

        String expected = "123ERT";
        String actual = gmail.getUsername();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isRememberMeTest1() {
        Login gmail = new Login();
        gmail.setRememberMe(false);

        boolean expected = false;
        boolean actual = gmail.isRememberMe();
        Assertions.assertEquals(expected,actual);
    }

}