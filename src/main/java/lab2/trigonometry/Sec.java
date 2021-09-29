package lab2.trigonometry;

import lab2.Function;

public class Sec extends Function {
    Cos cos;

    public Sec(double accuracy, Cos cos) {
        super(accuracy);
        this.cos = cos;
    }

    @Override
    public Double calculate(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x))
            return Double.NaN;
        return (1 / cos.calculate(x));
    }

    public void setCos(Cos cos) {
        this.cos = cos;
    }
}
