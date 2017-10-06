import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class GoldenSectionMethod extends OptimizationMethod{

    private double ak = a, bk = b;

    private double getX1(double a, double b) {
        return a + (3 - sqrt(5)) / 2 * (b - a);
    }

    private double getX2(double a, double b) {
        return a + (sqrt(5) - 1) / 2 * (b - a);
    }

    public double min(){
        double min;
        double x1, x2;
        int i = 1;
        x1 = getX1(ak, bk);
        x2 = getX2(ak, bk);
        while(abs(bk - ak) > eps) {
            if (getFunction(x1) < getFunction(x2)) {
                bk = x2;
                x2 = x1;
                x1 = getX1(ak,bk);
            } else {
                ak = x1;
                x1 = x2;
                x2 = getX2(ak,bk);
            }
            i++;
        }
        System.out.println("Итераций: " + i);
        min = (ak + bk)/2;
        return min;
    }

}
