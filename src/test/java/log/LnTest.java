package log;

import lab2.CsvOut;
import lab2.log.Ln;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class LnTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Ln ln;

    @BeforeEach
    void init() {
        ln = new Ln(ACCURACY);
    }

    @AfterAll
    public void logInCSV() {
        CsvOut csvLogger = new CsvOut("ln.csv", 0.1, 5, 0.1);
        csvLogger.log(ln);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/ln_test_data.csv")
    public void tableValuesTest(double expected, double num, double den) {
        double actual = ln.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = ln.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeValueStubsTest() {
        double expected = Double.NaN;
        double actual = ln.calculate(-1);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = ln.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        double expected = Double.NEGATIVE_INFINITY;
        double actual = ln.calculate(0.0);
        assertEquals(expected, actual, DELTA);
    }

}