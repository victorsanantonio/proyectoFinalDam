package modelo;
// Generated 10-mar-2021 16:13:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Compras generated by hbm2java
 */
public class Compras  implements java.io.Serializable {


     private Integer idCompra;
     private Empleados empleados;
     private Productos productos;
     private Date fechaCompra;
     private String nombreProveedor;
     private Integer codPostal;
     private Integer ciudad;
     private Float total;
     private Float totalIva;

    public Compras() {
    }

    public Compras(Empleados empleados, Productos productos, Date fechaCompra, String nombreProveedor, Integer codPostal, Integer ciudad, Float total, Float totalIva) {
       this.empleados = empleados;
       this.productos = productos;
       this.fechaCompra = fechaCompra;
       this.nombreProveedor = nombreProveedor;
       this.codPostal = codPostal;
       this.ciudad = ciudad;
       this.total = total;
       this.totalIva = totalIva;
    }
   
    public Integer getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    public Empleados getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }
    public Productos getProductos() {
        return this.productos;
    }
    
    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    public Date getFechaCompra() {
        return this.fechaCompra;
    }
    
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public String getNombreProveedor() {
        return this.nombreProveedor;
    }
    
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public Integer getCodPostal() {
        return this.codPostal;
    }
    
    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }
    public Integer getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }
    public Float getTotal() {
        return this.total;
    }
    
    public void setTotal(Float total) {
        this.total = total;
    }
    public Float getTotalIva() {
        return this.totalIva;
    }
    
    public void setTotalIva(Float totalIva) {
        this.totalIva = totalIva;
    }




}


