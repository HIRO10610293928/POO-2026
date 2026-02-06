package Actividad2.process;

public class Multiplicacion {
    public static int realizarOperacion(int op1, int op2) {
        int resultado = 0;
        int absOp1 = (op1 < 0) ? Resta.realizarOperacion(0, op1) : op1;
        int absOp2 = (op2 < 0) ? Resta.realizarOperacion(0, op2) : op2;

        for (int i = 0; i < absOp2; i = Suma.realizarOperacion(i, 1)) {
            resultado = Suma.realizarOperacion(resultado, absOp1);
        }

        if ((op1 < 0) != (op2 < 0)) {
            resultado = Resta.realizarOperacion(0, resultado);
        }
        return resultado;
    }
}
