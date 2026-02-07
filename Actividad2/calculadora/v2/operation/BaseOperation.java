package Actividad2.calculadora.v2.operation;

public abstract class BaseOperation implements Operation {
    private final String name;

    protected BaseOperation(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract double execute(double a, double b);
}
