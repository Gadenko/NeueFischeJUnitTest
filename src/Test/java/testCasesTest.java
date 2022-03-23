import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testCasesTest {

    @Test
    void multiplyByFour() {
        assertEquals(20, testCases.multiplyByFour(5));
    }

    @Test
    void isGreaterThan1000_whenBigger_shouldReturnTrue() {

        assertEquals(true, testCases.isGreaterThan1000(1001));
        assertEquals(true, testCases.isGreaterThan1000(1000343));
        assertEquals(true, testCases.isGreaterThan1000(100122));

    }

    @Test
    void isGreaterThan1000_whenSmaller_shouldReturnFalse() {

        assertEquals(false, testCases.isGreaterThan1000(900));
        assertEquals(false, testCases.isGreaterThan1000(1000));
        assertEquals(false, testCases.isGreaterThan1000(30));

    }


    @Test
    void divideByFour_whenDecimal_shouldreturnvalid() {

        assertEquals(2.525, testCases.divideByFour(10.1));
    }

    @Test
    void isLongerThan20_whenShorter_shouldReturnFalse() {

        assertEquals(false, testCases.isLongerThan20("test"));

    }

    @Test
    void isLongerThan20_whenLonger_shouldReturnTrue() {

        assertEquals(true, testCases.isLongerThan20("I am here and i have more then 20 letters"));
    }
}