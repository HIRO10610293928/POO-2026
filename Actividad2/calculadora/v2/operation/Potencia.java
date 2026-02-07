package Actividad2.calculadora.v2.operation;

public class Potencia extends BaseOperation {
    public Potencia() { super("potencia"); }

    @Override
    public double execute(double a, double b) {
        return Math.pow(a, b);
    }
}
