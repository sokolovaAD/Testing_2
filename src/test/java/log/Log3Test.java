package log;

import lab2.log.LogN;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class Log3Test {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LogN log3;

    @BeforeEach
    void init() {
        log3 = new LogN(ACCURACY, 3, LogMocks.getLnMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/log3_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = log3.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = log3.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeValueStubsTest() {
        double expected = Double.NaN;
        double actual = log3.calculate(-1);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = log3.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        double expected = Double.NEGATIVE_INFINITY;
        double actual = log3.calculate(0.0);
        assertEquals(expected, actual, DELTA);
    }

}