/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santafe_servicios.vo;

/**
 *
 * @author Familia
 */
public class EmpleadoVo {
    private String cc_empleado;
    private String nombre;
    private String cargo;

    /**
     * @return the cc_empleado
     */
    public String getCc_empleado() {
        return cc_empleado;
    }

    /**
     * @param cc_empleado the cc_empleado to set
     */
    public void setCc_empleado(String cc_empleado) {
        this.cc_empleado = cc_empleado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
