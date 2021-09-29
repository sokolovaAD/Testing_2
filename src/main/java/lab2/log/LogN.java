package lab2.log;

import lab2.Function;

public class LogN extends Function {

    private Ln ln;
    private int base;

    public LogN(double accuracy, int base, Ln ln) {
        super(accuracy);
        this.base = base;
        this.ln = ln;
    }

    @Override
    public Double calculate(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else if (x == 0.0) {
            return Double.NEGATIVE_INFINITY;
        }
        return ln.calculate(x) / ln.calculate(this.base);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}

