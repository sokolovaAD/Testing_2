package lab2.trigonometry;

import lab2.Function;

public class Sin extends Function {
    public Sin(double accuracy) {
        super(accuracy);
    }

    @Override
    public Double calculate(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x))
            return Double.NaN;
        boolean signReverse=false;
        if (x<0){
            x=(-1)*x;
            signReverse=true;
        }
        x = x % (2 * Math.PI);
        if (x>Math.PI){
            signReverse=!signReverse;
            x-=Math.PI;
        }
        if (Math.abs(x-Math.PI)>getAccuracy()){
            long i=3;
            int sign=-1;
            double previous=0;
            double current=x;
            double partMul=x;
            long factor=1;
            while (Math.abs(current-previous)>getAccuracy()){
                previous=current;
                for (long j=i;j>i-2;j--){
                    partMul*=x;
                    factor*=j;
                }
                current+=sign*partMul/factor;
                sign*=-1;
                i+=2;
            }
            if(signReverse) current=-current;
            return current;
        }
        else return 0.0;
    }

}
