package Actividad2.calculadora.v2.operation;

public class Raiz extends BaseOperation {
    public Raiz() { super("raiz"); }

    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Indice de raiz no puede ser cero");
        }
        // b será el indice; a es el radicando
        return Math.pow(a, 1.0 / b);
    }
}
