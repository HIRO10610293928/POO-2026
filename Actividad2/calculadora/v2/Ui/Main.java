package Actividad2.calculadora.v2.Ui;

import Actividad2.calculadora.v2.Calculator;
import Actividad2.calculadora.v2.OperationRegistry;
import Actividad2.calculadora.v2.operation.*;

public class Main {
    public static void main(String[] args) {
        OperationRegistry registry = new OperationRegistry();
        // Registrar operaciones (Open/Closed: nuevas operaciones se agregan aquí sin cambiar Calculator)
        registry.register(new Suma());
        registry.register(new Resta());
        registry.register(new Multiplicacion());
        registry.register(new Division());
        registry.register(new Potencia());
        registry.register(new Raiz());
        registry.register(new Modulo());
        registry.register(new Logaritmo());

        Calculator calc = new Calculator(registry);

        // Demo rápido
        System.out.println("5 + 3 = " + calc.calculate("suma", 5, 3));
        System.out.println("10 - 4 = " + calc.calculate("resta", 10, 4));
        System.out.println("6 * 7 = " + calc.calculate("multiplicacion", 6, 7));
        System.out.println("20 / 4 = " + calc.calculate("division", 20, 4));
        System.out.println("2^8 = " + calc.calculate("potencia", 2, 8));
        System.out.println("raiz(27,3) = " + calc.calculate("raiz", 27, 3));
        System.out.println("10 % 3 = " + calc.calculate("modulo", 10, 3));
        System.out.println("log_2(8) = " + calc.calculate("logaritmo", 8, 2));
    }
}
