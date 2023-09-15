public class Empleado {
    // Atributos
    private String nombre;
    private String correo;
    private String empresaPerteneciente;
    private String rol;

    // Constructor
    public Empleado(String nombre, String correo, String empresaPerteneciente, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.rol = rol;
    }

    // Metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPerteneciente() {
        return empresaPerteneciente;
    }

    public void setEmpresaPerteneciente(String empresaPerteneciente) {
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void infoEmpleado(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Correo del empleado: " + correo);
        System.out.println("Empresa en la que trabaja: " + empresaPerteneciente);
        System.out.println("Rol que desempeña: " + rol);
    }
}
