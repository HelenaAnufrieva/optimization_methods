public class DichotomyMethod extends OptimizationMethod{

    double a1 = a, b1 = b;
    double x1, x2;
    int i = 0;

    double getX1(double a, double b, double delta){
        return (a + b - delta)/2;
    }
    double getX2(double a, double b, double delta){
        return (a + b + delta)/2;
    }

    public double min(){

        double min;
      while (b1 - a1 > eps) {
            ++i;
            x1 = getX1(a1,b1,delta);
            x2 = getX2(a1,b1,delta);

            if(getFunction(x1) <= getFunction(x2)) {
                b1 = x2;
            } else {
                a1 = x1;
            }
        }
        System.out.println("Итераций: " + i);
        /*if (getFunction(x1) > getFunction(x2)){
            min = x2;
        } else {
            min = x1;
        }*/
        min = (a1 + b1)/2;
        return min;
    }

}
