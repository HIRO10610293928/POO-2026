package Actividad2.calculadora.v2.operation;

public class Division extends BaseOperation {
    public Division() { super("division"); }

    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division por cero");
        }
        return a / b;
    }
}
