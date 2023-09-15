public class Empresa {
    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    // Constructor
    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }
    // Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    // Método para imprimir información sobre la empresa
    public void infoEmpresa() {
        System.out.println("Nombre de la Empresa: " + nombre);
        System.out.println("Dirección de la Empresa: " + direccion);
        System.out.println("Teléfono de la Empresa: " + telefono);
        System.out.println("NIT de la Empresa: " + nit);
    }
}