import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Tests_for_Calculator {


    private Calculator calculator;

    @BeforeAll
    static void initBeforeAll() {
        System.out.println("Before all called");
    }

    @BeforeEach
    void init() {
        System.out.println("before each called");
        calculator = new Calculator();
    }

    @Test
    void testSumPositiveNumbers() {
        //GIVEN
        int firstnum = 7;
        int secondnum = 9;
        char operation = '+';
        int expectedResult = 16;

        //WHEN
        long actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSumNegativeNumbers() {
        //GIVEN
        int firstnum = -56;
        int secondnum = -14;
        char operation = '+';
        int expectedResult = -70;

        //WHEN
        long actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSumBordenValuesMin() {
        //GIVEN
        int firstnum = Integer.MIN_VALUE;
        int secondnum = 1;
        char operation = '+';
        int expectedResult = -2147483647;

        //WHEN
        long actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSumBordenValuesMax() {
        //GIVEN
        int firstnum = 2147483641;
        int secondnum = 6;
        char operation = '+';
        int expectedResult = Integer.MAX_VALUE;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSumZeroPlus() {
        //GIVEN
        int firstnum = 0;
        int secondnum = 5;
        char operation = '+';
        int expectedResult = 5;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSumZeroMinus() {
        //GIVEN
        int firstnum = -5;
        int secondnum = 5;
        char operation = '+';
        int expectedResult = 0;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSubPositiveNumbers() {
        //GIVEN
        int firstnum = 137;
        int secondnum = 59;
        char operation = '-';
        int expectedResult = 78;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSubOneNegativeNumber() {
        //GIVEN
        int firstnum = -96;
        int secondnum = 89;
        char operation = '-';
        int expectedResult = -185;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSubNegativeNumbers() {
        //GIVEN
        int firstnum = -96;
        int secondnum = -89;
        char operation = '-';
        int expectedResult = -7;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSubBordenValuesMin() {
        //GIVEN
        int firstnum = Integer.MIN_VALUE + 1;
        int secondnum = 1;
        char operation = '-';
        int expectedResult = Integer.MIN_VALUE;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSubBordenValuesMax() {
        //GIVEN
        int firstnum = Integer.MAX_VALUE;
        int secondnum = 6;
        char operation = '-';
        int expectedResult = Integer.MAX_VALUE-6;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSubZeroPlus() {
        //GIVEN
        int firstnum = 0;
        int secondnum = 17;
        char operation = '-';
        int expectedResult = -17;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testSubZeroMinus() {
        //GIVEN
        int firstnum = 22;
        int secondnum = 0;
        char operation = '-';
        int expectedResult = 22;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMulPositiveNumbers() {
        //GIVEN
        int firstnum = 34;
        int secondnum = 52;
        char operation = '*';
        int expectedResult = 1768;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMulOneNegativeNumber() {
        //GIVEN
        int firstnum = 15;
        int secondnum = -12;
        char operation = '*';
        int expectedResult = -180;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMulNegativeNumbers() {
        //GIVEN
        int firstnum = -21;
        int secondnum = -3;
        char operation = '*';
        int expectedResult = 63;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMulBordenValuesMin() {
        //GIVEN
        int firstnum = Integer.MIN_VALUE;
        int secondnum = 1;
        char operation = '*';
        int expectedResult = Integer.MIN_VALUE;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMulBordenValuesMax() {
        //GIVEN
        int firstnum = Integer.MAX_VALUE;
        int secondnum = 1;
        char operation = '*';
        int expectedResult =Integer.MAX_VALUE;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMulZeroPlus() {
        //GIVEN
        int firstnum = 0;
        int secondnum = 17;
        char operation = '*';
        int expectedResult = 0;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMulZeroMinus() {
        //GIVEN
        int firstnum = -22;
        int secondnum = 0;
        char operation = '*';
        int expectedResult = 0;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDivPositiveNumbers() {
        //GIVEN
        int firstnum = 12;
        int secondnum = 3;
        char operation = '/';
        int expectedResult = 4;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDivOneNegativeNumber() {
        //GIVEN
        int firstnum = -64;
        int secondnum = 8;
        char operation = '/';
        int expectedResult = -8;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDivNegativeNumbers() {
        //GIVEN
        int firstnum = -42;
        int secondnum = -6;
        char operation = '/';
        int expectedResult = 7;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDivBordenValuesMin() {
        //GIVEN
        int firstnum = Integer.MIN_VALUE;
        int secondnum = 100;
        char operation = '/';
        int expectedResult = -21474836;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDivBordenValuesMax() {
        //GIVEN
        int firstnum = Integer.MAX_VALUE;
        int secondnum = 100;
        char operation = '/';
        int expectedResult =21474836;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDivZero() {
        //GIVEN
        int firstnum = 0;
        int secondnum = 17;
        char operation = '/';
        int expectedResult = 0;

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testZeroDiv() {
        //GIVEN
        int firstnum = 54;
        int secondnum = 0;
        char operation = '/';
        String expectedResult = "Ділення на нуль неможливе. Повторіть операцію!";

        //WHEN
        int actualResult = calculator.calculate(firstnum,secondnum,operation);

        //THEN
        assertEquals(expectedResult, actualResult);
    }
    @AfterAll
    static void initAfterAll() {
        System.out.println("After all called");
    }
}
