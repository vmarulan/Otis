public class Empresa {
    // Atributos de la Empresa

    private String nombreEmpresa;
    private int nit;
    private String numeroTelefono;
    private String direccionEmpresa;
    private int numeroEmplreados;

    //Contructor
    public Empresa(String nombreEmpresa, int nit, String numeroTelefono, String direccionEmpresa, int numeroEmplreados) {
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.numeroTelefono = numeroTelefono;
        this.direccionEmpresa = direccionEmpresa;
        this.numeroEmplreados = numeroEmplreados;
    }

    // get y set


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getNumeroEmplreados() {
        return numeroEmplreados;
    }

    public void setNumeroEmplreados(int numeroEmplreados) {
        this.numeroEmplreados = numeroEmplreados;
    }


    //Mostrar informacion de la empresa

    public void mostrarInformacion(){
        System.out.println("Nombre de la Empresa: " + nombreEmpresa);
        System.out.println("Nit de La Empresa: " + nit);
        System.out.println("Direccion de la empresa" + direccionEmpresa);
        System.out.println("Telefono de la Empresa: " + numeroTelefono);
        System.out.println("Numero de Empleados: " + numeroEmplreados);
    }
}
