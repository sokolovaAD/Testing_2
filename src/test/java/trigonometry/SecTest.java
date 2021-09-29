package trigonometry;

import lab2.CsvOut;
import lab2.trigonometry.Sec;
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
public class SecTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Sec sec;

    @BeforeEach
    void init() {
        sec = new Sec(ACCURACY, TrigonometryMocks.getCosMock());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/sec_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = sec.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = sec.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = sec.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = sec.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}