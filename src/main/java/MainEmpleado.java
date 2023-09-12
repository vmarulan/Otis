public class MainEmpleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Dalilia Ardila","alejaardilag@gmail.com","LetsPlay","Administradora");

        //mostrar info empleado

        empleado1.mostrarEmpleado();

        String cadena = "";
        System.out.println(cadena);

        //Editar informacion del empleado

        empleado1.setNombreEmpleado("Pablo Giraldo");
        empleado1.setCorreoEmpleado("pdgm92@hotmail.com");
        empleado1.setEmpresaEmpleado("Systemcorppa");
        empleado1.setRolEmpleado("Dueño");

        empleado1.mostrarEmpleado();

    }
}
