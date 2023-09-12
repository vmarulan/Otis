public class Empleado {
    //Atributos Empleado
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;
    private String rolEmpleado;

    // Constructor
    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    //Get y Sett

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    //Mostrar info Empleado

    public void mostrarEmpleado () {
        System.out.println("Nombre Empleado: " + nombreEmpleado);
        System.out.println("Correo Empleado: " + correoEmpleado);
        System.out.println("Empresa a la que Pertenece: " + empresaEmpleado);
        System.out.println("Rol del Empleado: " + rolEmpleado);
    }
}
