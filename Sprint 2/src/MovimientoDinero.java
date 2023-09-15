public class MovimientoDinero {
    // Atributos
    private double monto;
    private String concepto;
    private String usuarioEncargado;

    // Constructor
    public MovimientoDinero(double monto, String concepto, String usuarioEncargado) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuarioEncargado = usuarioEncargado;
    }

    // Métodos get y set
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }

    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }

    // Método para imprimir información sobre el movimiento
    public void infoMovimiento() {
        System.out.println("Monto: " + monto);
        System.out.println("Concepto: " + concepto);
        System.out.println("Usuario Encargado: " + usuarioEncargado);
    }
}