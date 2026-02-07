package Actividad2.calculadora.v2.operation;

public class Multiplicacion extends BaseOperation {
    public Multiplicacion() { super("multiplicacion"); }

    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
