public abstract class OptimizationMethod {
    final double eps = 0.01;
    final double delta = 0.005;
    final double a = -1.5;
    final double b = 0;
    protected double getFunction(double x) {

        return x / (x * x + 1);
    }
    public abstract double min();
}
