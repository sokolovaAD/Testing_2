package trigonometry;

import lab2.trigonometry.*;
import org.mockito.Mockito;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigonometryMocks {

    public static Sin getSinMock() {
        Sin sin = mock(Sin.class);

        when(sin.calculate(Mockito.eq(1 * PI / 6))).thenReturn(0.49999999999999994);
        when(sin.calculate(Mockito.eq(1 * PI / 4))).thenReturn(0.7071067811865475);
        when(sin.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.8660254037844386);
        when(sin.calculate(Mockito.eq(2 * PI / 3))).thenReturn(0.8660254037844387);
        when(sin.calculate(Mockito.eq(3 * PI / 4))).thenReturn(0.7071067811865476);
        when(sin.calculate(Mockito.eq(3 * PI / 2))).thenReturn(-0.9999999999939768);
        when(sin.calculate(Mockito.eq(5 * PI / 6))).thenReturn(0.49999999999999994);
        when(sin.calculate(Mockito.eq(7 * PI / 6))).thenReturn(-0.4999999999999997);
        when(sin.calculate(Mockito.eq(5 * PI / 4))).thenReturn(-0.7071067811865475);
        when(sin.calculate(Mockito.eq(4 * PI / 3))).thenReturn(-0.8660254037844384);
        when(sin.calculate(Mockito.eq(5 * PI / 3))).thenReturn(-0.8660254037844386);
        when(sin.calculate(Mockito.eq(7 * PI / 4))).thenReturn(-0.7071067811865477);
        when(sin.calculate(Mockito.eq(11 * PI / 6))).thenReturn(-0.5000000000000004);
        when(sin.calculate(Mockito.eq(PI))).thenReturn(0.0);
        when(sin.calculate(Mockito.eq(2 * PI))).thenReturn(0.0);
        when(sin.calculate(Mockito.eq(1 * PI / 2))).thenReturn(1.0);
        when(sin.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(-1.0);
        when(sin.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(-0.7071067811865475);
        when(sin.calculate(Mockito.eq(-2 * PI / 3))).thenReturn(-0.8660230570631883);
        when(sin.calculate(Mockito.eq(-1 * PI / 6))).thenReturn(-0.4999999918690232);
        when(sin.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(-0.7071067811865476);
        when(sin.calculate(Mockito.eq(-PI))).thenReturn(0.0);
        when(sin.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(0.7071067811865475);
        when(sin.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(0.7071067811865477);

        when(sin.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(sin.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(sin.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return sin;
    }

    public static Cos getCosMock() {
        Cos cos = mock(Cos.class);

        when(cos.calculate(Mockito.eq(1 * PI / 6))).thenReturn(0.8660254037844387);
        when(cos.calculate(Mockito.eq(1 * PI / 4))).thenReturn(0.7071067811865476);
        when(cos.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.5000000000000001);
        when(cos.calculate(Mockito.eq(2 * PI / 3))).thenReturn(-0.4999999999999998);
        when(cos.calculate(Mockito.eq(3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(cos.calculate(Mockito.eq(5 * PI / 6))).thenReturn(-0.8660254037844387);
        when(cos.calculate(Mockito.eq(7 * PI / 6))).thenReturn(-0.8660254037844388);
        when(cos.calculate(Mockito.eq(5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(cos.calculate(Mockito.eq(4 * PI / 3))).thenReturn(-0.5000000000000004);
        when(cos.calculate(Mockito.eq(5 * PI / 3))).thenReturn(0.5000000000000001);
        when(cos.calculate(Mockito.eq(7 * PI / 4))).thenReturn(0.7071067811865474);
        when(cos.calculate(Mockito.eq(11 * PI / 6))).thenReturn(0.8660254037844384);
        when(cos.calculate(Mockito.eq(PI))).thenReturn(-1.0);
        when(cos.calculate(Mockito.eq(2 * PI))).thenReturn(1.0);
        when(cos.calculate(Mockito.eq(1 * PI / 2))).thenReturn(0.0);
        when(cos.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(0.0);
        when(cos.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(0.7071067811865476);
        when(cos.calculate(Mockito.eq(-1 * PI / 6))).thenReturn(0.8660254084788602);
        when(cos.calculate(Mockito.eq(-2 * PI / 3))).thenReturn(-0.5000040646184086);
        when(cos.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(cos.calculate(Mockito.eq(-PI))).thenReturn(-1.0);
        when(cos.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(cos.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(0.7071067811865474);

        when(cos.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cos.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cos.calculate(NaN)).thenThrow(IllegalArgumentException.class);

        return cos;
    }

    public static Tan getTanMock() {
        Tan tan = mock(Tan.class);

        when(tan.calculate(Mockito.eq(PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(tan.calculate(Mockito.eq(- PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(tan.calculate(Mockito.eq(PI))).thenReturn(0.0);
        when(tan.calculate(Mockito.eq(2 * PI))).thenReturn(0.0);
        when(tan.calculate(Mockito.eq(-PI))).thenReturn(0.0);

        when(tan.calculate(Mockito.eq(1 * PI / 6))).thenReturn(0.5773502691896257);
        when(tan.calculate(Mockito.eq(1 * PI / 4))).thenReturn(0.9999999999999999);
        when(tan.calculate(Mockito.eq(1 * PI / 3))).thenReturn(1.7320508075688767);
        when(tan.calculate(Mockito.eq(2 * PI / 3))).thenReturn(-1.7320508075688783);
        when(tan.calculate(Mockito.eq(3 * PI / 4))).thenReturn(-1.0000000000000002);
        when(tan.calculate(Mockito.eq(5 * PI / 6))).thenReturn(-0.5773502691896257);
        when(tan.calculate(Mockito.eq(7 * PI / 6))).thenReturn(0.5773502691896254);
        when(tan.calculate(Mockito.eq(5 * PI / 4))).thenReturn(0.9999999999999997);
        when(tan.calculate(Mockito.eq(4 * PI / 3))).thenReturn(1.7320508075688754);
        when(tan.calculate(Mockito.eq(5 * PI / 3))).thenReturn(-1.732050807568877);
        when(tan.calculate(Mockito.eq(7 * PI / 4))).thenReturn(-1.0000000000000004);
        when(tan.calculate(Mockito.eq(11 * PI / 6))).thenReturn(-0.5773502691896265);
        when(tan.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(-288119.0742742186);
        when(tan.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(-0.9999999999999999);
        when(tan.calculate(Mockito.eq(-1 * PI / 6))).thenReturn(-0.5773502566711681);
        when(tan.calculate(Mockito.eq(-2 * PI / 3))).thenReturn(1.7320320340277968);
        when(tan.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(1.0000000000000002);
        when(tan.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(-0.9999999999999997);
        when(tan.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(1.0000000000000004);

        when(tan.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(tan.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(tan.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return tan;
    }

    public static Cot getCotMock() {
        Cot cot = mock(Cot.class);

        when(cot.calculate(Mockito.eq(-PI))).thenReturn(Double.POSITIVE_INFINITY);
        when(cot.calculate(Mockito.eq(- PI / 2))).thenReturn(0.0);
        when(cot.calculate(Mockito.eq(PI / 2))).thenReturn(0.0);
        when(cot.calculate(Mockito.eq(PI))).thenReturn(Double.POSITIVE_INFINITY);
        when(cot.calculate(Mockito.eq(2 * PI))).thenReturn(Double.POSITIVE_INFINITY);

        when(cot.calculate(Mockito.eq(1 * PI / 6))).thenReturn(1.7320508075688776);
        when(cot.calculate(Mockito.eq(1 * PI / 4))).thenReturn(1.0000000000000002);
        when(cot.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.577350269189626);
        when(cot.calculate(Mockito.eq(2 * PI / 3))).thenReturn(-0.5773502691896255);
        when(cot.calculate(Mockito.eq(3 * PI / 4))).thenReturn(-0.9999999999999999);
        when(cot.calculate(Mockito.eq(5 * PI / 6))).thenReturn(-1.7320508075688776);
        when(cot.calculate(Mockito.eq(7 * PI / 6))).thenReturn(1.7320508075688785);
        when(cot.calculate(Mockito.eq(5 * PI / 4))).thenReturn(1.0000000000000002);
        when(cot.calculate(Mockito.eq(4 * PI / 3))).thenReturn(0.5773502691896265);
        when(cot.calculate(Mockito.eq(5 * PI / 3))).thenReturn(-0.577350269189626);
        when(cot.calculate(Mockito.eq(7 * PI / 4))).thenReturn(-0.9999999999999996);
        when(cot.calculate(Mockito.eq(11 * PI / 6))).thenReturn(-1.7320508075688752);
        when(cot.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(-6.123234e-17);
        when(cot.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(-1.0000000000000002);
        when(cot.calculate(Mockito.eq(-1 * PI / 6))).thenReturn(-1.732050845124251);
        when(cot.calculate(Mockito.eq(-2 * PI / 3))).thenReturn(0.5773565271044816);
        when(cot.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(0.9999999999999999);
        when(cot.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(-1.0000000000000002);
        when(cot.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(0.9999999999999996);

        when(cot.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cot.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cot.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return cot;
    }

    public static Sec getSecMock() {
        Sec sec = mock(Sec.class);

        when(sec.calculate(Mockito.eq(0.0))).thenReturn(1.0);
        when(sec.calculate(Mockito.eq(-PI))).thenReturn(1.0);
        when(sec.calculate(Mockito.eq(- PI / 2))).thenReturn(Double.NaN);
        when(sec.calculate(Mockito.eq(PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(sec.calculate(Mockito.eq(PI))).thenReturn(1.0);
        when(sec.calculate(Mockito.eq(2 * PI))).thenReturn(1.0);

        when(sec.calculate(Mockito.eq(1 * PI / 6))).thenReturn(1.1547005383792515);
        when(sec.calculate(Mockito.eq(1 * PI / 4))).thenReturn(1.414213562373095);
        when(sec.calculate(Mockito.eq(1 * PI / 3))).thenReturn(1.9999999999999996);
        when(sec.calculate(Mockito.eq(2 * PI / 3))).thenReturn(-2.000000000000001);
        when(sec.calculate(Mockito.eq(3 * PI / 4))).thenReturn(-1.4142135623730951);
        when(sec.calculate(Mockito.eq(5 * PI / 6))).thenReturn(-1.1547005383792515);
        when(sec.calculate(Mockito.eq(7 * PI / 6))).thenReturn(-1.1547005383792512);
        when(sec.calculate(Mockito.eq(5 * PI / 4))).thenReturn(-1.4142135623730947);
        when(sec.calculate(Mockito.eq(4 * PI / 3))).thenReturn(-1.9999999999999982);
        when(sec.calculate(Mockito.eq(5 * PI / 3))).thenReturn(1.9999999999999996);
        when(sec.calculate(Mockito.eq(7 * PI / 4))).thenReturn(1.4142135623730954);
        when(sec.calculate(Mockito.eq(11 * PI / 6))).thenReturn(1.154700538379252);
        when(sec.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(1.414213562373095);
        when(sec.calculate(Mockito.eq(-1 * PI / 6))).thenReturn(1.1547005321200228);
        when(sec.calculate(Mockito.eq(-2 * PI / 3))).thenReturn(-1.9999837416585333);
        when(sec.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(-1.4142135623730951);
        when(sec.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(-1.4142135623730947);
        when(sec.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(1.4142135623730954);

        when(sec.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(sec.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(sec.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return sec;
    }

}
