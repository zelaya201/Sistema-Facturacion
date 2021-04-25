package sistemaFacturacion;

public class Cliente extends Persona {
    private String direccion;

    public Cliente(String nombre, String telefono, String direccion) {
        super(nombre, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.getNombre() + " " + super.getTelefono() + " " + this.direccion;
    }    
}
