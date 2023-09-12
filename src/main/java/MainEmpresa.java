public class MainEmpresa {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Lets Play",1143844775, "3178574488","Avenida el Progreso # 9 -03  Tunja-Boyacá",2);

        // Leer informacion de la empresa
        empresa1.mostrarInformacion();

        String cadena = "";
        System.out.println(cadena);

        //Modificar informacion de la empresa
        empresa1.setNombreEmpresa("Systemcorppa");
        empresa1.setNit(66846206);
        empresa1.setNumeroTelefono("3057129584");
        empresa1.setDireccionEmpresa("Cra 111 # 49 - 32 Cali- Valle");
        empresa1.setNumeroEmplreados(15);

        empresa1.mostrarInformacion();

    }

}

