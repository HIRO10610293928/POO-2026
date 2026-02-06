package Actividad2.process;

/**
 * Este metodo recibe base y exponente y devuelve la potencia usando multiplicacion repetida
 * @return base elevado a exp
 * @param base operando base
 * @param exp exponente
 */
public class Potencia {
    public static int realizarOperacion(int base, int exp) {
        if (exp < 0) throw new IllegalArgumentException("Exponentes negativos no soportados");
        int resultado = 1;
        for (int i = 0; i < exp; i = Suma.realizarOperacion(i, 1)) {
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}
