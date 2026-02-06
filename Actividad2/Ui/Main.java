package Actividad2.Ui;

import java.util.Scanner;

import Actividad2.process.Division;
import Actividad2.process.Logaritmo;
import Actividad2.process.Modulo;
import Actividad2.process.Multiplicacion;
import Actividad2.process.Potencia;
import Actividad2.process.Raiz;
import Actividad2.process.Resta;
import Actividad2.process.Suma;

public class Main {

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Logaritmo");
            System.out.println("8. Raíz");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            if (opcion == 0) {
                break;
            }

            System.out.print("Operando 1: ");
            int a = sc.nextInt();
            System.out.print("Operando 2: ");
            int b = sc.nextInt();

            try {
                int resultado;

                switch (opcion) {
                    case 1:
                        resultado = Suma.realizarOperacion(a, b);
                        break;
                    case 2:
                        resultado = Resta.realizarOperacion(a, b);
                        break;
                    case 3:
                        resultado = Multiplicacion.realizarOperacion(a, b);
                        break;
                    case 4:
                        resultado = Division.realizarOperacion(a, b);
                        break;
                    case 5:
                        resultado = Modulo.realizarOperacion(a, b);
                        break;
                    case 6:
                        resultado = Potencia.realizarOperacion(a, b);
                        break;
                    case 7:
                        resultado = Logaritmo.realizarOperacion(a, b);
                        break;
                    case 8:
                        resultado = Raiz.realizarOperacion(a, b);
                        break;
                    default:
                        throw new IllegalArgumentException("Opción inválida");
                }

                System.out.println("Resultado: " + resultado);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (true);

        sc.close();
        System.out.println("Programa finalizado.");
    }

    public static void main(String[] args) {
        showMenu();
    }
}


 