package santafe_servicios.dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import santafe_servicios.vo.ClienteVo;

/**
 *
 * @author lbustacara
 */
public class ClienteDao {

    Connection conexion = null;
    List<ClienteVo> clientes = new ArrayList<>();
    Conexion con;

    public ClienteDao() {
        con = new Conexion();
    }

    public List<ClienteVo> obtenerClientes() {
        try {
            conexion = con.crearConexion();
            String sql = "SELECT c.ID_CLIENTE, c.TIPO_DOCUMENTO, c.NOMBRE, c.TELEFONO, c.CELULAR, c.CORREO, c.DIRECCION  \n" +
                        "FROM ANDRES.CLIENTE c";
            PreparedStatement pstat = conexion.prepareCall(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultado = pstat.executeQuery();
            while (resultado.next() || resultado.isLast()) {
                ClienteVo clienteVo = new ClienteVo();
                clienteVo.setId_cliente(resultado.getString(1));
                clienteVo.setId_tipo_doc(resultado.getString(2));
                clienteVo.setNombre(resultado.getString(3));
                clienteVo.setDireccion(resultado.getString(4));
                clienteVo.setTelefono(resultado.getString(5));
                clienteVo.setCelular(resultado.getString(6));
                clienteVo.setCorreo(resultado.getString(7));
                clientes.add(clienteVo);
            }
            conexion.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conexion.close();
                con.cerrarConexion();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return clientes;
        }
    }
    
    public int agregarCliente(int ID_CLIENTE, String TIPO_DOCUMENTO, String NOMBRE, String TELEFONO, String CELULAR, String CORREO, String DIRECCION){
        int resultado = 0;
        try {
            conexion = con.crearConexion();
            String sql = "INSERT INTO ANDRES.CLIENTE (ID_CLIENTE, TIPO_DOCUMENTO, NOMBRE, TELEFONO, CELULAR, CORREO, DIRECCION) \n" +
            "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstat = conexion.prepareCall(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstat.setInt(1, ID_CLIENTE);
            pstat.setString(2, TIPO_DOCUMENTO);
            pstat.setString(3, NOMBRE);
            pstat.setString(4, TELEFONO);
            pstat.setString(5, CELULAR);
            pstat.setString(6, CORREO);
            pstat.setString(7, DIRECCION);
            resultado = pstat.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return resultado;
        }
    }
}
