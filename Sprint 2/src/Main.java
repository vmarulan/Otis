public class Main {
   public static void main(String[] args) {
       // Crear una instancia de Empresa
       Empresa miEmpresa = new Empresa("Mi Empresa S.A.", "123 Calle Principal", "555-123-6789", "123456789");

       // Imprimir información de la empresa
       miEmpresa.infoEmpresa();

       /* Modificar la dirección y el teléfono de la empresa
       miEmpresa.setDireccion("456 Avenida Secundaria");
       miEmpresa.setTelefono("555-987-6543");

       // Imprimir la información actualizada de la empresa
       miEmpresa.infoEmpresa(); */

       System.out.println("============");
       // Crear una instancia de Empleado
       Empleado empleado = new Empleado("Sebastián", "sebastian@miempresa.com", "MI Empresa S.A", "Administrador");
       empleado.infoEmpleado();

       /* Modificar los atributos del empleado
       empleado.setNombre("Juan");
       empleado.setCorreo("juan@otraempresa.com");
       empleado.setEmpresaPerteneciente("Empresa.Inc");
       empleado.setRol("Operativo");

       empleado.infoEmpleado(); */

       System.out.println("============");
       // Crear una instancia de MovimientoDinero
       MovimientoDinero movimiento = new MovimientoDinero(100.0, "Compra de suministros", "Usuario1");

       // Imprimir información del movimiento
       movimiento.infoMovimiento();

       /* Modificar el monto y el concepto
       movimiento.setMonto(150.0);
       movimiento.setConcepto("Pago de facturas");

       // Imprimir la información actualizada del movimiento
       movimiento.infomovimiento(); */
   }
}