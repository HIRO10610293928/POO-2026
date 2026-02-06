package Actividad2.process;

public class Division {
    public static int realizarOperacion(int op1, int op2) {
        if (op2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }

        int count = 0;
        int absOp1 = (op1 < 0) ? Resta.realizarOperacion(0, op1) : op1;
        int absOp2 = (op2 < 0) ? Resta.realizarOperacion(0, op2) : op2;
        int temp = absOp1;

        while (temp >= absOp2) {
            temp = Resta.realizarOperacion(temp, absOp2);
            count = Suma.realizarOperacion(count, 1);
        }

        if ((op1 < 0) != (op2 < 0)) {
            count = Resta.realizarOperacion(0, count);
        }
        return count;
    }
}
