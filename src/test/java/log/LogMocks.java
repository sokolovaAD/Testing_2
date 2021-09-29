package log;

import lab2.log.Ln;
import lab2.log.LogN;
import org.mockito.Mockito;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogMocks {

    public static Ln getLnMock() {
        Ln ln = mock(Ln.class);

        when(ln.calculate(Mockito.eq(1 * PI / 6))).thenReturn(-0.6470295833786549);
        when(ln.calculate(Mockito.eq(1 * PI / 4))).thenReturn(-0.2415644752704905);
        when(ln.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.046117597181290375);
        when(ln.calculate(Mockito.eq(2 * PI / 3))).thenReturn(0.7392647777412357);
        when(ln.calculate(Mockito.eq(3 * PI / 4))).thenReturn(0.8570478133976193);
        when(ln.calculate(Mockito.eq(5 * PI / 6))).thenReturn(0.9624083290554456);
        when(ln.calculate(Mockito.eq(7 * PI / 6))).thenReturn(1.2988805656766584);
        when(ln.calculate(Mockito.eq(5 * PI / 4))).thenReturn(1.3678734371636099);
        when(ln.calculate(Mockito.eq(4 * PI / 3))).thenReturn(1.432411958301181);
        when(ln.calculate(Mockito.eq(5 * PI / 3))).thenReturn(1.6555555096153909);
        when(ln.calculate(Mockito.eq(7 * PI / 4))).thenReturn(1.7043456737848228);
        when(ln.calculate(Mockito.eq(11 * PI / 6))).thenReturn(1.7508656894197157);
        when(ln.calculate(Mockito.eq(PI))).thenReturn(1.1447298858494002);
        when(ln.calculate(Mockito.eq(2 * PI))).thenReturn(1.8378770664093453);
        when(ln.calculate(Mockito.eq(1 * PI / 2))).thenReturn(0.4515827052894548);

        when(ln.calculate(Mockito.eq(5 * PI/ 1))).thenReturn(2.7541675867932587);
        when(ln.calculate(Mockito.eq(10 * PI/ 1))).thenReturn(3.4470788719676975);

        when(ln.calculate(Mockito.eq(2.0))).thenReturn(0.6931471805599453);
        when(ln.calculate(Mockito.eq(3.0))).thenReturn(1.0986122886681098);
        when(ln.calculate(Mockito.eq(5.0))).thenReturn(1.6094379124341003);
        when(ln.calculate(Mockito.eq(10.0))).thenReturn(2.3025850929940);

        when(ln.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(NaN);
        when(ln.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(NaN);
        when(ln.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(NaN);
        when(ln.calculate(Mockito.eq(-PI ))).thenReturn(NaN);
        when(ln.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(NaN);
        when(ln.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(NaN);

        when(ln.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(ln.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(ln.calculate(NaN)).thenReturn(NaN);

        return ln;
    }

    public static LogN getLog2Mock() {
        LogN log2 = mock(LogN.class);

        when(log2.calculate(Mockito.eq(1 * PI / 6))).thenReturn(-0.9334663712488376);
        when(log2.calculate(Mockito.eq(1 * PI / 4))).thenReturn(-0.3485038705276813);
        when(log2.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.06653362875116246);
        when(log2.calculate(Mockito.eq(2 * PI / 3))).thenReturn(1.0665336287511624);
        when(log2.calculate(Mockito.eq(3 * PI / 4))).thenReturn(1.236458630193475);
        when(log2.calculate(Mockito.eq(5 * PI / 6))).thenReturn(1.388461723638525);
        when(log2.calculate(Mockito.eq(7 * PI / 6))).thenReturn(1.8738885508087668);
        when(log2.calculate(Mockito.eq(5 * PI / 4))).thenReturn(1.9734242243596811);
        when(log2.calculate(Mockito.eq(4 * PI / 3))).thenReturn(2.0665336287511624);
        when(log2.calculate(Mockito.eq(5 * PI / 3))).thenReturn(2.388461723638525);
        when(log2.calculate(Mockito.eq(7 * PI / 4))).thenReturn(2.458851051529923);
        when(log2.calculate(Mockito.eq(11 * PI / 6))).thenReturn(2.5259652473884597);
        when(log2.calculate(Mockito.eq(PI))).thenReturn(1.651496129472319);
        when(log2.calculate(Mockito.eq(2 * PI))).thenReturn(2.6514961294723185);
        when(log2.calculate(Mockito.eq(1 * PI / 2))).thenReturn(0.6514961294723187);

        when(log2.calculate(Mockito.eq(5 * PI/ 1))).thenReturn(3.9734239192437593);
        when(log2.calculate(Mockito.eq(10 * PI/ 1))).thenReturn(4.973083594140921);

        when(log2.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(NaN);
        when(log2.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(NaN);
        when(log2.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(NaN);
        when(log2.calculate(Mockito.eq(-PI ))).thenReturn(NaN);
        when(log2.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(NaN);
        when(log2.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(NaN);

        when(log2.calculate(Double.POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(log2.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(log2.calculate(NaN)).thenReturn(NaN);

        return log2;
    }

    public static LogN getLog3Mock() {
        LogN log3 = mock(LogN.class);

        when(log3.calculate(Mockito.eq(1 * PI / 6))).thenReturn(-0.5889517075792716);
        when(log3.calculate(Mockito.eq(1 * PI / 4))).thenReturn(-0.21988146115072904);
        when(log3.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.04197804599218576);
        when(log3.calculate(Mockito.eq(2 * PI / 3))).thenReturn(0.6729077995636431);
        when(log3.calculate(Mockito.eq(3 * PI / 4))).thenReturn(0.780118538849271);
        when(log3.calculate(Mockito.eq(5 * PI / 6))).thenReturn(0.8760218131386556);
        when(log3.calculate(Mockito.eq(7 * PI / 6))).thenReturn(1.1822920415821505);
        when(log3.calculate(Mockito.eq(5 * PI / 4))).thenReturn(1.245092059567198);
        when(log3.calculate(Mockito.eq(4 * PI / 3))).thenReturn(1.3038375531351005);
        when(log3.calculate(Mockito.eq(5 * PI / 3))).thenReturn(1.506951566710113);
        when(log3.calculate(Mockito.eq(7 * PI / 4))).thenReturn(1.551362288010693);
        when(log3.calculate(Mockito.eq(11 * PI / 6))).thenReturn(1.5937066310648664);
        when(log3.calculate(Mockito.eq(PI))).thenReturn(1.0419780459921857);
        when(log3.calculate(Mockito.eq(2 * PI))).thenReturn(1.672907799563643);
        when(log3.calculate(Mockito.eq(1 * PI / 2))).thenReturn(0.4110482924207284);

        when(log3.calculate(Mockito.eq(5 * PI / 1))).thenReturn(2.5069513742034006);
        when(log3.calculate(Mockito.eq(10 * PI/ 1))).thenReturn(3.1376664065415905);

        when(log3.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(NaN);
        when(log3.calculate(Mockito.eq(-PI ))).thenReturn(NaN);

        when(log3.calculate(Double.POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(log3.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(log3.calculate(NaN)).thenReturn(NaN);

        return log3;
    }

    public static LogN getLog5Mock() {
        LogN log5 = mock(LogN.class);

        when(log5.calculate(Mockito.eq(1 * PI / 6))).thenReturn(-0.40202208384670945);
        when(log5.calculate(Mockito.eq(1 * PI / 4))).thenReturn(-0.15009244743411718);
        when(log5.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.028654474226683595);
        when(log5.calculate(Mockito.eq(2 * PI / 3))).thenReturn(0.45933103230007666);
        when(log5.calculate(Mockito.eq(3 * PI / 4))).thenReturn(0.5325137470518682);
        when(log5.calculate(Mockito.eq(5 * PI / 6))).thenReturn(0.5979779161532907);
        when(log5.calculate(Mockito.eq(7 * PI / 6))).thenReturn(0.8070398712754582);
        when(log5.calculate(Mockito.eq(5 * PI / 4))).thenReturn(0.8499075525658829);
        when(log5.calculate(Mockito.eq(4 * PI / 3))).thenReturn(0.8900075903734698);
        when(log5.calculate(Mockito.eq(5 * PI / 3))).thenReturn(1.0286544742266837);
        when(log5.calculate(Mockito.eq(7 * PI / 4))).thenReturn(1.0589695076880505);
        when(log5.calculate(Mockito.eq(11 * PI / 6))).thenReturn(1.0878740185582687);
        when(log5.calculate(Mockito.eq(PI))).thenReturn(0.711260668712669);
        when(log5.calculate(Mockito.eq(2 * PI))).thenReturn(1.141937226786062);
        when(log5.calculate(Mockito.eq(1 * PI / 2))).thenReturn(0.2805841106392759);

        when(log5.calculate(Mockito.eq(5 * PI/ 1))).thenReturn(1.7112605373063934);
        when(log5.calculate(Mockito.eq(10 * PI/ 1))).thenReturn(2.1417905253358698);

        when(log5.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(NaN);
        when(log5.calculate(Mockito.eq(-PI ))).thenReturn(NaN);

        when(log5.calculate(Double.POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(log5.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(log5.calculate(NaN)).thenReturn(NaN);

        return log5;
    }
}
