package actividad1.process;
 
import actividad1.data.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
 
public class Venta {
    private String cliente;
    private LocalDate fecha;
    private ArrayList<Vehiculo> vehiculos;
 
    public Venta(String cliente) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.vehiculos = new ArrayList<>();
    }
 
    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }
 
    public double calcularTotal() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getPrecio();
        }
        return total;
    }
 
    public String generarTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("----- TICKET DE VENTA -----\n");
        ticket.append("Cliente: ").append(cliente).append("\n");
        ticket.append("Fecha: ").append(fecha).append("\n\n");
        ticket.append("Vehículos comprados:\n");
 
        for (Vehiculo v : vehiculos) {
            ticket.append("- ").append(v.getDescripcion()).append("\n");
        }
 
        ticket.append("\nTotal a pagar: $").append(calcularTotal());
        return ticket.toString();
    }
}
