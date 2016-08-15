/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santafe_servicios.dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import santafe_servicios.vo.EmpleadoVo;

/**
 *
 * @author lbustacara
 */
public class EmpleadoDao {
    Connection conexion = null;
    List<EmpleadoVo> empleados = new ArrayList <>();
    Conexion con ;
    
    public EmpleadoDao(){
        con = new Conexion();
    }
    
    public List<EmpleadoVo> obtenerEmpleados(){
        try{
            conexion = con.crearConexion();
            String sql = "SELECT a.ID_EMPLEADO,a.NOMBRE_EMP,a.CARGOS";
            PreparedStatement pstat = conexion.prepareCall(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultado = pstat.executeQuery();
            while (resultado.next() || resultado.isLast()){
                EmpleadoVo empleado = new EmpleadoVo();
                empleado.setCc_empleado(resultado.getString("CC_EMPLEADO"));
                empleado.setNombre(resultado.getString("NOMBRE_EMP"));
                empleado.setCargo(resultado.getString("CARGO"));
                empleados.add(empleado);
            }
            conexion.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                conexion.close();
                con.cerrarConexion();
            } catch(Exception e){
                e.printStackTrace();
            }
            return empleados;
        }
    }

}
