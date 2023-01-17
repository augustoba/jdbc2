
package JDBC.entities;


import java.sql.Date;


public class Empleado {
    
    private Integer idEmp;
    private String nombre;
    private String sexo;
    private Date fechaNac;
    private Date fechaInc;
    private Float salario;
    private Float comision;
    private String cargo;
    private String codJefe;
    private Integer idDpto;

    public Empleado() {
    }

    public Empleado(Integer idEmp, String nombre, String sexo, Date fechaNac, Date fechaInc, Float salario, Float comision, String cargo, String codJefe, Integer idDpto) {
        this.idEmp = idEmp;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.fechaInc = fechaInc;
        this.salario = salario;
        this.comision = comision;
        this.cargo = cargo;
        this.codJefe = codJefe;
        this.idDpto = idDpto;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFechaInc() {
        return fechaInc;
    }

    public void setFechaInc(Date fechaInc) {
        this.fechaInc = fechaInc;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodJefe() {
        return codJefe;
    }

    public void setCodJefe(String codJefe) {
        this.codJefe = codJefe;
    }

    public Integer getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(Integer idDpto) {
        this.idDpto = idDpto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmp=" + idEmp + ", nombre=" + nombre + ", sexo=" + sexo + ", fechaNac=" + fechaNac + ", fechaInc=" + fechaInc + ", salario=" + salario + ", comision=" + comision + ", cargo=" + cargo + ", codJefe=" + codJefe + ", idDpto=" + idDpto + '}';
    }
    

}
