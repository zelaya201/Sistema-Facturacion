/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaFacturacion;

import java.util.Date;

/**
 *
 * @author Mario Zelaya
 */
public class Test {
    public static void main(String[] args) {
        Date fecha = new Date();
        
        
        Cliente cliente = new Cliente("Antonio", "78514680", "Res");
        Producto p = new Producto(12345, "Corn Flakes", 3.75);
        
        Detalle detalle = new Detalle(p, 2);
        detalle.setSubTotal(detalle.calcularSubTotal(p));

        Vendedor v = new Vendedor("12345678", "Irvin", "7549632");
        
        Factura f = new Factura(fecha);
        
        f.addCliente("Jose", "78514680", "Res");
        f.addVendedor("12345678", "Irvin", "78499652");
        f.addDetalle(detalle);
        f.setTotal(detalle.getSubTotal());
        
        System.out.println(f);
    }
}
