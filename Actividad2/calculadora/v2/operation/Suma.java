package Actividad2.calculadora.v2.operation;

public class Suma extends BaseOperation {
    public Suma() { super("suma"); }

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
