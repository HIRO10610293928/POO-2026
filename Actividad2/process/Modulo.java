package Actividad2.process;

public class Modulo {
    public static int realizarOperacion(int op1, int op2) {
        if (op2 == 0) {
            throw new IllegalArgumentException("No se puede hacer modulo por cero");
        }

        int absOp1 = (op1 < 0) ? Resta.realizarOperacion(0, op1) : op1;
        int absOp2 = (op2 < 0) ? Resta.realizarOperacion(0, op2) : op2;
        int temp = absOp1;

        while (temp >= absOp2) {
            temp = Resta.realizarOperacion(temp, absOp2);
        }

        if (op1 < 0) {
            temp = Resta.realizarOperacion(0, temp);
        }
        return temp;
    }
}
