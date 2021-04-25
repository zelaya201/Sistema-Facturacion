package sistemaFacturacion;

public class Vendedor extends Persona {
    private static final double COMISION = 0.05;
    private String dui;

    public Vendedor(String dui, String nombre, String telefono) {
        super(nombre, telefono);
        this.dui = dui;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }  
}