package actividad1.ui;
 
import actividad1.data.Vehiculo;
import actividad1.process.Venta;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Menu {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Vehiculo> catalogo = new ArrayList<>();
        catalogo.add(new Vehiculo("Chevrolet", "chevy pop", 70000));
        catalogo.add(new Vehiculo("Nisan", "Sense", 187300));
        catalogo.add(new Vehiculo("Cupra", "Suvs", 699900));

        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = sc.nextLine();
        Venta venta = new Venta(cliente);

        int opcion;
        do {
            System.out.println("\nVehículos disponibles:");
            for (int i = 0; i < catalogo.size(); i++) {
                System.out.println((i + 1) + ". " + catalogo.get(i).getDescripcion());
            }
            System.out.println("0. Finalizar compra");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion > 0 && opcion <= catalogo.size()) {
                venta.agregarVehiculo(catalogo.get(opcion - 1));
                System.out.println("Vehículo agregado.");
            }

        } while (opcion != 0);

        System.out.println("\n" + venta.generarTicket());
    }
}
