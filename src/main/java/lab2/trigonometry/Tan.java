package lab2.trigonometry;

import lab2.Function;

public class Tan extends Function {
    Sin sin;
    Cos cos;

    public Tan(double accuracy, Sin sin, Cos cos) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
    }

    @Override
    public Double calculate(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x))
            return Double.NaN;
        return (sin.calculate(x) / cos.calculate(x));
    }

    public void setSin(Sin sin) {
        this.sin = sin;
    }

    public void setCos(Cos cos) {
        this.cos = cos;
    }
}
