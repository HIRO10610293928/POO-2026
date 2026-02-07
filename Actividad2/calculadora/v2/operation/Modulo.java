package Actividad2.calculadora.v2.operation;

public class Modulo extends BaseOperation {
    public Modulo() { super("modulo"); }

    @Override
    public double execute(double a, double b) {
        return a % b;
    }
}
