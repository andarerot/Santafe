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
public class ServicioVo {
private int id_servicio;
private String fecha_solicitud;/*date*/
private String hora_solicitud; /*time*/
private String tipo_servicio;
private String fecha_servicio; /*date*/
private String hora_servicio; /*time*/
private String cliente; /*varchar(27)*/
private int ciudad_origen; 
private int ciudad_destino;
private String nombre_recibe;
private String tel_recibe;
private String observaciones;
private String id_conductor;
private String id_cotizo;
private int valor_bodega;
private int valor_seguro;
private int valor_total;
private String forma_pago;
private int abono;
private int saldo;

    /**
     * @return the id_servicio
     */
    public int getId_servicio() {
        return id_servicio;
    }

    /**
     * @param id_servicio the id_servicio to set
     */
    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    /**
     * @return the fecha_solicitud
     */
    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    /**
     * @param fecha_solicitud the fecha_solicitud to set
     */
    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    /**
     * @return the hora_solicitud
     */
    public String getHora_solicitud() {
        return hora_solicitud;
    }

    /**
     * @param hora_solicitud the hora_solicitud to set
     */
    public void setHora_solicitud(String hora_solicitud) {
        this.hora_solicitud = hora_solicitud;
    }

    /**
     * @return the tipo_servicio
     */
    public String getTipo_servicio() {
        return tipo_servicio;
    }

    /**
     * @param tipo_servicio the tipo_servicio to set
     */
    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    /**
     * @return the fecha_servicio
     */
    public String getFecha_servicio() {
        return fecha_servicio;
    }

    /**
     * @param fecha_servicio the fecha_servicio to set
     */
    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    /**
     * @return the hora_servicio
     */
    public String getHora_servicio() {
        return hora_servicio;
    }

    /**
     * @param hora_servicio the hora_servicio to set
     */
    public void setHora_servicio(String hora_servicio) {
        this.hora_servicio = hora_servicio;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the ciudad_origen
     */
    public int getCiudad_origen() {
        return ciudad_origen;
    }

    /**
     * @param ciudad_origen the ciudad_origen to set
     */
    public void setCiudad_origen(int ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    /**
     * @return the ciudad_destino
     */
    public int getCiudad_destino() {
        return ciudad_destino;
    }

    /**
     * @param ciudad_destino the ciudad_destino to set
     */
    public void setCiudad_destino(int ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    /**
     * @return the nombre_recibe
     */
    public String getNombre_recibe() {
        return nombre_recibe;
    }

    /**
     * @param nombre_recibe the nombre_recibe to set
     */
    public void setNombre_recibe(String nombre_recibe) {
        this.nombre_recibe = nombre_recibe;
    }

    /**
     * @return the tel_recibe
     */
    public String getTel_recibe() {
        return tel_recibe;
    }

    /**
     * @param tel_recibe the tel_recibe to set
     */
    public void setTel_recibe(String tel_recibe) {
        this.tel_recibe = tel_recibe;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the id_conductor
     */
    public String getId_conductor() {
        return id_conductor;
    }

    /**
     * @param id_conductor the id_conductor to set
     */
    public void setId_conductor(String id_conductor) {
        this.id_conductor = id_conductor;
    }

    /**
     * @return the id_cotizo
     */
    public String getId_cotizo() {
        return id_cotizo;
    }

    /**
     * @param id_cotizo the id_cotizo to set
     */
    public void setId_cotizo(String id_cotizo) {
        this.id_cotizo = id_cotizo;
    }

    /**
     * @return the valor_bodega
     */
    public int getValor_bodega() {
        return valor_bodega;
    }

    /**
     * @param valor_bodega the valor_bodega to set
     */
    public void setValor_bodega(int valor_bodega) {
        this.valor_bodega = valor_bodega;
    }

    /**
     * @return the valor_seguro
     */
    public int getValor_seguro() {
        return valor_seguro;
    }

    /**
     * @param valor_seguro the valor_seguro to set
     */
    public void setValor_seguro(int valor_seguro) {
        this.valor_seguro = valor_seguro;
    }

    /**
     * @return the valor_total
     */
    public int getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    /**
     * @return the forma_pago
     */
    public String getForma_pago() {
        return forma_pago;
    }

    /**
     * @param forma_pago the forma_pago to set
     */
    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    /**
     * @return the abono
     */
    public int getAbono() {
        return abono;
    }

    /**
     * @param abono the abono to set
     */
    public void setAbono(int abono) {
        this.abono = abono;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
