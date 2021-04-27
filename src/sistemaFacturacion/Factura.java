package sistemaFacturacion;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Detalle> detalle;
    
    private Date fecha;
    private double total;
    private static int numero;

    public Factura(Date fecha, int numero) {
        Factura.numero = numero; 
        this.fecha = fecha;
        this.detalle = new ArrayList();
    }
    
    public void addCliente(String nombre, String telefono, String direccion) {
        this.cliente = new Cliente(nombre, telefono, direccion);
    }
    
    public void addVendedor(String dui, String nombre, String telefono) {
        this.vendedor = new Vendedor(dui, nombre, telefono);
    }
    
    public void addDetalle(Detalle obj) {
        this.detalle.add(obj);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Factura.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalle;
    }

    public void setDetalles(ArrayList<Detalle> detalles) {
        this.detalle = detalles;
    }
        
    public void calcularTotal() {
        
    }
    
    public double calcularIva() {
       return 3;
    }

    @Override
    public String toString() {
        return "Factura{ Num=" + Factura.numero +" "+  cliente.toString() + ", vendedor=" + vendedor.getNombre() + ", " + detalle.toString() + 
                ", fecha=" + fecha + ", total=" + total + '}';
    }  
}
