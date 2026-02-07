package Actividad2.calculadora.v2;

import Actividad2.calculadora.v2.operation.Operation;

public class Calculator {
    private final OperationRegistry registry;

    public Calculator(OperationRegistry registry) {
        this.registry = registry;
    }

    public double calculate(String opName, double a, double b) {
        Operation op = registry.get(opName);
        if (op == null) {
            throw new IllegalArgumentException("Operación desconocida: " + opName);
        }
        return op.execute(a, b);
    }
}
