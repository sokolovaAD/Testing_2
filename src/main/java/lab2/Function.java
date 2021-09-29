package lab2;

public abstract class Function {

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    private double accuracy;

    public Function(double accuracy) {
        this.accuracy = accuracy;
    }

    public abstract Double calculate(double x);


}
