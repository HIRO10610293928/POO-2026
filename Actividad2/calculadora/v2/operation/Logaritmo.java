package Actividad2.calculadora.v2.operation;

public class Logaritmo extends BaseOperation {
    public Logaritmo() { super("logaritmo"); }

    @Override
    public double execute(double a, double b) {
        // a = numero, b = base
        if (a <= 0 || b <= 0 || b == 1) {
            throw new IllegalArgumentException("Parametros invalidos para logaritmo");
        }
        return Math.log(a) / Math.log(b);
    }
}
