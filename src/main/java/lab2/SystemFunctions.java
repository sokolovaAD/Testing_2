package lab2;
import lab2.trigonometry.*;
import lab2.log.*;

public class SystemFunctions extends Function {
    private Cos cos;
    private Cot cot;
    private Sec sec;
    private Tan tan;
    private Ln ln;
    private LogN log2;
    private LogN log3;
    private LogN log5;


    public SystemFunctions(double accuracy, Cos cos, Cot cot, Sec sec, Tan tan, Ln ln, LogN log2, LogN log3, LogN log5) {
        super(accuracy);
        this.cos = cos;
        this.cot = cot;
        this.sec = sec;
        this.tan = tan;
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log5 = log5;
    }

    @Override
    public Double calculate(double x) {
        if (x <= 0) {
            return ((((((tan.calculate(x) - cot.calculate(x)) + cot.calculate(x))
                    / sec.calculate(x)) / cos.calculate(x)) - cos.calculate(x)));
        }
        else  {
            return (((Math.pow(((log5.calculate(x) - log5.calculate(x)) * log5.calculate(x)),3) - log3.calculate(x))
                    / ((log3.calculate(x) + ln.calculate(x)) * log2.calculate(x))));
        }
    }

    public void setCos(Cos cos) {
        this.cos = cos;
    }

    public void setTan(Tan tan) {
        this.tan = tan;
    }

    public void setCot(Cot cot) {
        this.cot = cot;
    }

    public void setSec(Sec sec) {
        this.sec = sec;
    }

    public void setLn(Ln ln) {
        this.ln = ln;
    }

    public void setLog2(LogN log2) {
        this.log2 = log2;
    }

    public void setLog3(LogN log3) {
        this.log3 = log3;
    }

    public void setLog5(LogN log5) {
        this.log5 = log5;
    }

    public Cos getCos() {
        return cos;
    }

    public Tan getTan() {
        return tan;
    }

    public Cot getCot() {
        return cot;
    }

    public Sec getSec() {
        return sec;
    }

    public Ln getLn() {
        return ln;
    }

    public LogN getLog2() {
        return log2;
    }

    public LogN getLog3() {
        return log3;
    }

    public LogN getLog5() {
        return log5;
    }

}
