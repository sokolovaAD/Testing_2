package lab2.trigonometry;

import lab2.Function;

public class Cos extends Function {
    private Sin sin;

    public Cos(double accuracy, Sin sin) {
        super(accuracy);
        this.sin = sin;
    }

    public Double calculate(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x))
            return Double.NaN;
        double result =Math.sqrt(1-Math.pow(sin.calculate(x),2));
        double newX=x%(2*Math.PI);
        if (newX>Math.PI/2 && newX<3*Math.PI/2 || newX<-Math.PI/2 &&
                newX>-3*Math.PI/2) result=-result;
        return result;
    }

    public void setSin(Sin sin) {
        this.sin = sin;
    }
}