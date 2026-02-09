package actividad1.data;
 
public class Vehiculo { 
    private String modelo; 
    private String marca; 
    private double precio; 
 
    public Vehiculo(String marca, String modelo, double precio) { 
        this.marca = marca; 
        this.modelo = modelo; 
        this.precio = precio; 
    } 
 
    public String getDescripcion() { 
        return marca + " " + modelo + " - $" + precio; 
    } 
 
    public double getPrecio() { 
        return precio; 
    } 
} 
