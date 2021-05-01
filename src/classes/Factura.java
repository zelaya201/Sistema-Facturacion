package classes;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Detalle> detalle;
    
    private Date fecha;
    private double total;
    private int numero;

    public Factura(Date fecha, int numero) {
        this.numero = numero; 
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        
    public double calcularTotal() {
        
        double totalFactura = 0;
        
        for(Detalle d : detalle){
            totalFactura += d.getSubTotal();
        }
        
        totalFactura = calcularIva(totalFactura) + totalFactura;
        
        return totalFactura;
    }
    
    public double calcularSubTotal() {
        double subTotal = 0;
        
        for(Detalle d: detalle) {
            subTotal += d.getSubTotal();
        }
        
        return subTotal;
    }
    
    public double calcularIva(double total) {
       return 0.13 * total;
    }


}
