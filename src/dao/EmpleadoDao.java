
package dao;

import JDBC.entities.Empleado;
import dao.Dao;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;




public class EmpleadoDao  extends Dao{
    
  
   
    public List<Empleado> listAll (){
        
        String query = "select * from empleados";
        consultarDb(query);
        
        List<Empleado> empleados = new ArrayList<>();
        Empleado empleado;
        
        
        try {
            while (resultado.next()) {
                empleado = new Empleado();
                empleado.setIdEmp(resultado.getInt("id_emp"));
                empleado.setNombre(resultado.getNString("nombre"));
                empleado.setSexo(resultado.getNString("sex_emp"));                                
                empleado.setFechaNac(resultado.getDate("fec_nac"));
                empleado.setFechaInc(resultado.getDate("fec_incorporacion"));
                empleado.setSalario(resultado.getFloat("sal_emp"));
                empleado.setComision(resultado.getFloat("comision_emp"));
                empleado.setCargo(resultado.getNString("cargo_emp"));
                empleado.setCodJefe(resultado.getNString("cod_jefe"));
                empleado.setIdDpto(resultado.getInt("id_depto"));
                
                
                empleados.add(empleado);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("ocurrio un error al buscar en la base: "+ ex.getMessage());
        }finally {
            desconectarDb();
        }
        
        
        return empleados;
    }
    
    public void insertarEmp(Empleado empleado){
        
  
        
        String query = "insert into empleados values(default, '"+ empleado.getNombre()+"', '"+ empleado.getSexo()+"', '"+ empleado.getFechaNac() +"', '"+ empleado.getFechaInc() +"', '"
                + empleado.getSalario()+"', '"+ empleado.getComision()+"', '"+ empleado.getCargo()+"', '"+ empleado.getCodJefe()+"', '"+ empleado.getIdDpto()+"')";
        insertarActualizarEliminar(query);
        
    }
    
    

}
