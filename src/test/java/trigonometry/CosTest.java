package trigonometry;


import lab2.trigonometry.Cos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class CosTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Cos cos;

    @BeforeEach
    void init() {
        cos = new Cos(ACCURACY, TrigonometryMocks.getSinMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/cos_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = cos.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = cos.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }


    @Test
    public void positiveInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = cos.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = cos.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}