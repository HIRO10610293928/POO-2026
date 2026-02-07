package Actividad2.calculadora.v2.operation;

public class Resta extends BaseOperation {
    public Resta() { super("resta"); }

    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
