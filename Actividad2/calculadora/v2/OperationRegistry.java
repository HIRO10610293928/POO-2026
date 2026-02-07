package Actividad2.calculadora.v2;

import Actividad2.calculadora.v2.operation.Operation;
import java.util.HashMap;
import java.util.Map;

public class OperationRegistry {
    private final Map<String, Operation> registry = new HashMap<>();

    public void register(Operation op) {
        registry.put(op.getName().toLowerCase(), op);
    }

    public Operation get(String name) {
        if (name == null) return null;
        return registry.get(name.toLowerCase());
    }
}
