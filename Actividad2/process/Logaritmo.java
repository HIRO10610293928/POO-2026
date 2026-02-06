package Actividad2.process;

/**
 * Este metodo recibe base y operando y devuelve el logaritmo (entero exacto) usando multiplicacion repetida
 * @return log base del operando
 * @param base base del log
 * @param num operando
 */
public class Logaritmo {
    public static int realizarOperacion(int base, int num) {
        if (base <= 1 || num < 1) throw new IllegalArgumentException("Base invalida o num <1");
        int count = 0;
        int temp = 1;
        while (temp < num) {
            temp = Multiplicacion.realizarOperacion(temp, base);
            count = Suma.realizarOperacion(count, 1);
            if (temp > num) throw new IllegalArgumentException("No es un logaritmo exacto");
        }
        if (temp == num) return count;
        throw new IllegalArgumentException("No es un logaritmo exacto");
    }
}
