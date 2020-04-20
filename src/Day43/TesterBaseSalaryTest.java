package Day43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesterBaseSalaryTest {

    @Test
    void juniorTesterSalaryTest(){
        JuniorTesterSalary juniorTester = new JuniorTesterSalary();
        int expected = TesterBaseSalary.getBaseSalary() - 50_000;
        int actual = juniorTester.getSalary();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void middleTesterSalaryTest(){
        MiddleTesterSalary middleTester = new MiddleTesterSalary();
        int expected = TesterBaseSalary.getBaseSalary() + 10_000;
        int actual = middleTester.getSalary();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void seniorTesterSalaryTest(){
        SeniorTesterSalary seniorTester = new SeniorTesterSalary();
        int expected = TesterBaseSalary.getBaseSalary() + 100_000;
        int actual = seniorTester.getSalary();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void sumOfThreeJuniors(){
        JuniorTesterSalary junTester1 = new JuniorTesterSalary();
        JuniorTesterSalary junTester2 = new JuniorTesterSalary();
        JuniorTesterSalary junTester3 = new JuniorTesterSalary();
        int expected = 150_000;
        int actual = junTester1.getSalary() + junTester2.getSalary() + junTester3.getSalary();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void sumOfNMiddle(){
        int N = 158;
        int sum = 0;
        for(int i = 0; i < N; i++) {
            MiddleTesterSalary s = new MiddleTesterSalary();
            sum += s.getSalary();
        }

        int expected = 110_000 * N;
        int actual = sum;
        Assertions.assertEquals(expected,actual);
    }

}
