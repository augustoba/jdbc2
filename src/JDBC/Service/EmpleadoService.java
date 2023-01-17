package JDBC.Service;

import JDBC.entities.Empleado;
import dao.EmpleadoDao;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;

public class EmpleadoService {

    private EmpleadoDao empDao = new EmpleadoDao();

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void listAll() {

        List<Empleado> empleados = empDao.listAll();

        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());

        }

    }

    public void insertarEmp() {
        Empleado empleado = new Empleado();
        System.out.println("ingrese el nombre y apellido");
        empleado.setNombre(read.nextLine());
        System.out.println("ingrese el sexo");
        empleado.setSexo(read.next());
        
        
        System.out.println("ingrese la fecha de nacimiento año/mes/dia");
        int anio = read.nextInt() -1900;
        int mes = read.nextInt()-1 ;
        int dia = read.nextInt();
        
       Date nac = new Date(anio,mes,dia);
        System.out.println(nac);
       
        
        empleado.setFechaNac(nac);
        
        
        System.out.println("ingrese la fecha de incorporacion año/mes/dia");
        anio = read.nextInt()-1900 ;
        mes = read.nextInt()-1;
        dia = read.nextInt();
        
      
        Date incorp = new Date(anio,mes,dia);
        System.out.println(incorp);
        
        empleado.setFechaInc(incorp);
        
        System.out.println("ingrese salario del empleado");
        empleado.setSalario(read.nextFloat());
        
        System.out.println("ingrese la comision del empleado");
        empleado.setComision(read.nextFloat());
        
        
        read.nextLine();
        
        System.out.println("ingrese el cargo del empleado");
        empleado.setCargo(read.nextLine());
        
        System.out.println("ingrese el codigo del jefe");
        empleado.setCodJefe(read.nextLine());
        
        System.out.println("ingrese el id del departamento");
        empleado.setIdDpto(read.nextInt());
        
        read.nextLine();
        empDao.insertarEmp(empleado);

    }

}
