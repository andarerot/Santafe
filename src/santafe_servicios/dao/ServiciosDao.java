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
import santafe_servicios.vo.ServicioVo;

/**
 *
 * @author Familia
 */
public class ServiciosDao {
    Connection conexion = null;
    List<ServicioVo> servicios = new ArrayList<>();
    Conexion con;
    
    public ServiciosDao(){
        con = new Conexion();
    }
    public List<ServicioVo> ObtenerServicios(){
        try{
            conexion = con.crearConexion();
            String sql = "SELECT a.id_servicio, a.fecha_solicitud,a.hora_solicitud, a.tipo_servicio"
                    + ", a.fecha_servicio, a.hora_servicio, b.nombre, c.NOMBRE_CIUDAD, d.CIUDAD_DESTINO,"
                    + "a.nombre_recibe,a.tel_recibe, a.observaciones,e.NOMBRE_EMP,f.NOMBRE_EMP,a.valor_bodega,"
                    + "a.valor_seguro,a.valor_total,a.forma_pago,a.abono,a.saldo"
                    + "FROM SERVICIOS a LEFT JOIN CLIENTES b ON a.CLIENTE = b.ID_CLIENTE"
                    + "LEFT JOIN CIUDADES c ON c.ID_CIUDAD = a.CIUDAD_ORIGEN"
                    + "LEFT JOIN CIUDADES ON d.ID_CIUDAD = a.CIUDAD_DESTINO"
                    + "LEFT JOIN EMPLEADOS e ON e.ID_EMPLEADO = a.ID_CONDUCTOR AND e.CARGO = 'CONDUCTOR'"
                    + "LEFT JOIN EMPLEADOS f ON f.ID_EMPLEADO = a.ID_COTIZO AND e.CARGO = 'VENDEDOR'";
            PreparedStatement pstat = conexion.prepareCall(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultado = pstat.executeQuery();
            while (resultado.next() || resultado.isLast()){
                ServicioVo ser = new ServicioVo();
                ser.setId_servicio(resultado.getInt("id_servicio"));
                ser.setFecha_solicitud(resultado.getString("fecha_solicitud"));
                ser.setHora_solicitud(resultado.getString("hora_solicitud"));
                ser.setTipo_servicio(resultado.getString("tipo_servicio"));
                ser.setFecha_servicio(resultado.getString("fecha_servicio"));
                ser.setHora_servicio(resultado.getString("hora_servicio"));
                ser.setCliente(resultado.getString("cliente"));
                ser.setCiudad_origen(resultado.getInt("ciudad_origen"));
                ser.setCiudad_destino(resultado.getInt("ciudad_destino"));
                ser.setNombre_recibe(resultado.getString("nombre_recibe"));
                ser.setTel_recibe(resultado.getString("tel_recibe"));
                ser.setObservaciones(resultado.getString("observaciones"));
                ser.setId_conductor(resultado.getString("id_conductor"));
                ser.setId_cotizo(resultado.getString("id_cotizo"));
                ser.setValor_bodega(resultado.getInt("valor_bodega"));
                ser.setValor_bodega(resultado.getInt("valor_seguro"));
                ser.setValor_bodega(resultado.getInt("valor_total"));
                ser.setForma_pago(resultado.getString("forma_pago"));
                ser.setAbono(resultado.getInt("abono"));
                ser.setSaldo(resultado.getInt("saldo"));
                servicios.add(ser);
            }conexion.commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                conexion.close();
                con.crearConexion();
            }catch(Exception e){
                e.printStackTrace();
            }
            return servicios;
        }
    }
}
