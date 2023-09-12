public class MovimientoDinero {
    // Atributos

    private double montoMovimiento;
    private String conceptoMovimiento;
    private String realizadoPor;

    // constructor


    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento, String realizadoPor) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.realizadoPor = realizadoPor;
    }

    //get y sett


    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getRealizadoPor() {
        return realizadoPor;
    }

    //public void setRealizadoPor(String realizadoPor) {
    //    this.realizadoPor = realizadoPor;
    //}

    public void mostrarinfo() {
        System.out.println("Monto del Movimiento: " + montoMovimiento);
        System.out.println("Concepto del Movimineto: " + conceptoMovimiento);
        System.out.println("Realizado por: " + realizadoPor);
    }
}
