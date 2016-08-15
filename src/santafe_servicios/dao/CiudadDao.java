package santafe_servicios.dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import santafe_servicios.vo.CiudadVo;

public class CiudadDao {

    Connection conexion = null;
    List<CiudadVo> ciudades = new ArrayList<>();
    Conexion con;
    
    public CiudadDao() {
        con = new Conexion();
    }
    
    public List<CiudadVo> obtenerCiudades(){
        try {
            conexion = con.crearConexion();
            String sql = "SELECT ID_CIUDAD, NOMBRE_CIUDAD FROM CIUDAD";
            PreparedStatement pstat = conexion.prepareCall(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultado = pstat.executeQuery();
            while(resultado.next() || resultado.isLast()){
                CiudadVo ciudadVo = new CiudadVo();
                ciudadVo.setId_ciudad(resultado.getInt(1));
                ciudadVo.setCiudad(resultado.getString(2));
                ciudades.add(ciudadVo);
            }
            conexion.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                conexion.close();
                con.cerrarConexion();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ciudades;
        }
    }
    
    public int agregarCiudad(int id_ciudad, String nombreCiudad){
        int resultado = 0;
        try {
            conexion = con.crearConexion();
            String sql = "INSERT INTO ciudad(id_ciudad, nombre_ciudad) VALUES(?,?)";
            PreparedStatement pstat = conexion.prepareCall(sql);
            pstat.setInt(1, id_ciudad);
            pstat.setString(2, nombreCiudad);
            resultado = pstat.executeUpdate();
            conexion.commit();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return resultado;
        }
    }
    
    public int eliminarCiudad(int idCiudad){
        int resultado = 0;
        try {
            conexion = con.crearConexion();
            String sql = "DELETE FROM CIUDAD WHERE ID_CIUDAD=?";
            PreparedStatement pstat = conexion.prepareCall(sql);
            pstat.setInt(1, idCiudad);
            resultado = pstat.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return resultado;
        }
    }
    
    public int modificarCiudad(int id_ciudad, String nombreCiudad){
        int resultado = 0;
        try {
            conexion = con.crearConexion();
            String sql = "UPDATE ciudad SET nombre_ciudad=? WHERE id_ciudad=?";
            PreparedStatement pstat = conexion.prepareCall(sql);
            pstat.setString(1, nombreCiudad);
            pstat.setInt(2, id_ciudad);
            resultado = pstat.executeUpdate();
            conexion.commit();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return resultado;
        }
    }
    
    public List<CiudadVo> busquedaPorCiudad(String nombre){
        try {
            conexion = con.crearConexion();
            String sql = "SELECT ID_CIUDAD, NOMBRE_CIUDAD FROM CIUDADES WHERE NOMBRE_CIUDAD LIKE ?";
            PreparedStatement pstat = conexion.prepareCall(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstat.setString(1, "%"+nombre+"%");
            ResultSet resultado = pstat.executeQuery();
            while(resultado.next() || resultado.isLast()){
                CiudadVo ciudadVo = new CiudadVo();
                ciudadVo.setId_ciudad(resultado.getInt(1));
                ciudadVo.setCiudad(resultado.getString(2));
                ciudades.add(ciudadVo);
            }
            conexion.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                conexion.close();
                con.cerrarConexion();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ciudades;
        }
    }
}
