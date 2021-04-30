package classes;

public class Detalle {
    private Producto producto;
    private int cantidad;
    private double subTotal;

    public Detalle(Producto p, int cantidad) {
        this.cantidad = cantidad;
        this.producto = p;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    public double calcularSubTotal(Producto p) {
        return p.getPrecio() * this.cantidad;
    }

    @Override
    public String toString() {
        return "Detalle{" + "codigo=" + producto.getCodigo() + ", descripcion=" + producto.getDescripcion() + ", precio=" + producto.getPrecio() + ", cantidad=" + cantidad + ", subTotal=" + subTotal + '}';
    }
}