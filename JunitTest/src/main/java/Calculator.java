public class Calculator {
    public Calculator() {
    }

    public double add(double var1, double var2) {
        return var1 + var2;
    }

    public double sub(double var1, double var2) {
        return var1 - var2;
    }

    public double mul(double var1, double var2) {
        return var1 * var2;
    }

    public double div(double var1, double var2) {
        if (var2 == 0.0) {
            throw new IllegalArgumentException(" Can't div by Zero");
        } else {
            return var1 / var2;
        }
    }
}
