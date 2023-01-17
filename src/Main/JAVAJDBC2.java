package Main;

import JDBC.Service.EmpleadoService;

public class JAVAJDBC2 {

    public static void main(String[] args) {
        EmpleadoService emple = new EmpleadoService();
        emple.listAll();

        emple.insertarEmp();
        emple.listAll();

    }

}
