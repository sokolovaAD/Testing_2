import lab2.SystemFunctions;
import lab2.log.Ln;
import lab2.log.LogN;
import lab2.trigonometry.*;
import log.LogMocks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.TrigonometryMocks;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class SystemFunctionsTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;
    private SystemFunctions func;
    private Sin sin;
    private Cos cos;
    private Cot cot;
    private Sec sec;
    private Tan tan;
    private Ln ln;
    private LogN log2;
    private LogN log3;
    private LogN log5;


    @ParameterizedTest
    @CsvFileSource(resources = "/system_function_test_data.csv")
    public void SystemWithAllStubsTest(double expected, double num, double den) {
        func = new SystemFunctions(ACCURACY, TrigonometryMocks.getCosMock(), TrigonometryMocks.getCotMock(),
                TrigonometryMocks.getSecMock(), TrigonometryMocks.getTanMock(), LogMocks.getLnMock(), LogMocks.getLog2Mock(),
                LogMocks.getLog3Mock(), LogMocks.getLog5Mock());
        double result = func.calculate(num * PI / den);
        Assertions.assertEquals(expected,result,DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system_function_test_data.csv")
    public void SystemWithBasicStubsTest(double expected, double num, double den) {
        cos = new Cos(ACCURACY, TrigonometryMocks.getSinMock());
        cot = new Cot(ACCURACY, TrigonometryMocks.getSinMock(), cos);
        sec = new Sec(ACCURACY, cos);
        tan = new Tan(ACCURACY, TrigonometryMocks.getSinMock(), cos);
        log2 = new LogN(ACCURACY, 2, LogMocks.getLnMock());
        log3 = new LogN(ACCURACY, 3, LogMocks.getLnMock());
        log5 = new LogN(ACCURACY, 5, LogMocks.getLnMock());

        func = new SystemFunctions(ACCURACY, cos , cot, sec,
                tan, LogMocks.getLnMock(), log2,
                log3, log5);
        double result = func.calculate(num * PI / den);
        Assertions.assertEquals(expected, result, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system_function_test_data.csv")
    public void SystemWithoutStubsTest(double expected, double num, double den) {
        sin = new Sin(ACCURACY);
        cos = new Cos(ACCURACY, sin);
        cot = new Cot(ACCURACY, sin, cos);
        sec = new Sec(ACCURACY, cos);
        tan = new Tan(ACCURACY, sin, cos);
        ln = new Ln(ACCURACY);
        log2 = new LogN(ACCURACY, 2, ln);
        log3 = new LogN(ACCURACY, 3, ln);
        log5 = new LogN(ACCURACY, 5, ln);

        func = new SystemFunctions(ACCURACY, cos , cot,
                sec, tan, ln, log2,
                log3, log5);
        double result = func.calculate(num * PI / den);
        Assertions.assertEquals(expected, result, DELTA);
    }
}
