package sistemaFacturacion;

import java.util.Date;

public class Factura {
    private Cliente cliente;
    private Vendedor vendedor;
    private Detalle detalle;
    
    private Date fecha;
    private double total;
    private static int numero;

    public Factura(Date fecha) {
         this.fecha = fecha;
    }
    
    public void addCliente(String nombre, String telefono, String direccion) {
        this.cliente = new Cliente(nombre, telefono, direccion);
    }
    
    public void addVendedor(String dui, String nombre, String telefono) {
        this.vendedor = new Vendedor(dui, nombre, telefono);
    }
    
    public void addDetalle(Detalle d) {
        this.detalle = d;
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

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
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
