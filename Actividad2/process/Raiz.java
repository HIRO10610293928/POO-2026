package Actividad2.process; 
 
/** 
* Este metodo recibe indice de raiz y operando y devuelve la raiz (entera exacta) usando busqueda con potencia 
* @return raiz n del operando (positiva) 
* @param n indice de la raiz (ej. 2 para cuadrada) 
* @param op operando 
*/ 
public class Raiz { 
    public static int realizarOperacion(int n, int op) { 
        if (n < 2 || op < 1) throw new IllegalArgumentException("Indice invalido o op <1"); 
        int k = 1; 
        while (true) { 
            int pow = Potencia.realizarOperacion(k, n); 
            if (pow == op) return k; 
            if (pow > op) throw new IllegalArgumentException("No es una raiz exacta"); 
            k = Suma.realizarOperacion(k, 1); 
        } 
    } 
} 

 