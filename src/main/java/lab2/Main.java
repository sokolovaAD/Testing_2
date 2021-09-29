package lab2;

import lab2.log.Ln;
import lab2.log.LogN;
import lab2.trigonometry.*;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        func(10*PI);
    }

    static void func (double x) {
        Ln ln = new Ln(0.0001);
        LogN log2 = new LogN(0.0001, 2, ln);
        LogN log3 = new LogN(0.0001, 3, ln);
        LogN log5 = new LogN(0.0001, 5, ln);
        Sin sin = new Sin(0.0001);
        Cos cos = new Cos(0.0001,sin);
        Sec sec = new Sec(0.0001, cos);
        Cot cot = new Cot(0.0001,sin,cos);
        Tan tan = new Tan(0.0001, sin, cos);
        SystemFunctions func = new SystemFunctions(0.0001, cos, cot, sec, tan, ln, log2, log3, log5);

        System.out.println(sin.calculate(x));
        System.out.println(cos.calculate(x));
        System.out.println(sec.calculate(x));
        System.out.println(cot.calculate(x));
        System.out.println(tan.calculate(x));
        System.out.println();
        System.out.println(ln.calculate(x));
        System.out.println(log2.calculate(x));
        System.out.println(log3.calculate(x));
        System.out.println(log5.calculate(x));

        CsvOut csvLogger1 = new CsvOut("out/cot.csv", -10, -0.1, 0.2);
        csvLogger1.log(cot);

        CsvOut csvLogger2 = new CsvOut("out/cos.csv", -10, -0.1, 0.2);
        csvLogger2.log(cos);

        CsvOut csvLogger3 = new CsvOut("out/sin.csv", -10, -0.1, 0.2);
        csvLogger3.log(sin);

        CsvOut csvLogger4 = new CsvOut("out/sec.csv", -10, -0.1, 0.2);
        csvLogger4.log(sec);

        CsvOut csvLogger5 = new CsvOut("out/tan.csv", -10, -0.1, 0.2);
        csvLogger5.log(tan);

        CsvOut csvLogger6 = new CsvOut("out/ln.csv", 0.1, 10, 0.2);
        csvLogger6.log(ln);

        CsvOut csvLogger7 = new CsvOut("out/log2.csv", 0.1, 10, 0.2);
        csvLogger7.log(log2);

        CsvOut csvLogger8 = new CsvOut("out/log3.csv", 0.1, 10, 0.2);
        csvLogger8.log(log3);

        CsvOut csvLogger9 = new CsvOut("out/log5.csv", 0.1, 10, 0.2);
        csvLogger9.log(log5);

        CsvOut csvLogger10 = new CsvOut("out/func.csv", -10, 10, 0.1);
        csvLogger10.log(func);
    }
}
