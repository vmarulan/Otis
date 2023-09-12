public class MainMovimiento {
    public static void main(String[] args) {

        MovimientoDinero movimiento1 = new MovimientoDinero(-250000,"venta de juego","Alejandra Ardila");

        //Mostrar info del movimiento

        movimiento1.mostrarinfo();

        String cadena = "";
        System.out.println(cadena);

        // modificar movimiento

        movimiento1.setMontoMovimiento(250000);
        movimiento1.setConceptoMovimiento("Venta de Mouse");

        movimiento1.mostrarinfo();


    }
}
