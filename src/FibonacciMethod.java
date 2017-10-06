
public class FibonacciMethod extends OptimizationMethod{

    double a1 = a, b1 = b;
    double v[] = new double[20];
    double u[] = new double[20];

    public double min(){
        double min;
        boolean check;
        int k = 1, n;
        double []f = new double[20];
        f[1] = 1; f[2] = 1;

        while(true){
            f[k+2] = f[k+1] + f[k];
            if(f[k+1] <= ((b-a)/eps) && ((b-a)/eps) <= f[k+2]) {
                n = k;
                break;
            } else {
                k++;
            }
        }
        System.out.println("Итераций: " + n);

        u[1] = a1 + f[n]/f[n+2] * (b1 - a1);
        v[1] = a1 + f[n+1]/f[n+2] * (b1 - a1);


        if (getFunction(u[1]) <= getFunction(v[1])){
            b1 = v[1];
            check = true;
        } else {
            a1 = u[1];
            check = false;
        }
        for (k = 2; k < n; k++){
            if (check){
                u[k] = a1 + f[n-k+1]/f[n+2] * (b - a);
                v[k] = u[k-1];
            } else {
                u[k] = v[k-1];
                a1 = u[k-1];
                v[k] = a1 + f[n-k+2]/f[n+2] * (b - a);
            }
            if (getFunction(u[k]) <= getFunction(v[k])) {
                b1 = v[k];
                check = true;
            } else {
                a1 = u[k];
                check = false;
            }
        }
        min = (a1 + b1)/2;
        return min;
    }
}
