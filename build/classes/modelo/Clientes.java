package modelo;
// Generated 10-mar-2021 16:13:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer idCliente;
     private String nombre;
     private String dni;
     private Integer telefono;
     private String direccion;
     private String ciudad;
     private Integer codPostal;
     private byte[] imagen;
     private Set productoses = new HashSet(0);

    public Clientes() {
    }

    public Clientes(String nombre, String dni, Integer telefono, String direccion, String ciudad, Integer codPostal, byte[] imagen, Set productoses) {
       this.nombre = nombre;
       this.dni = dni;
       this.telefono = telefono;
       this.direccion = direccion;
       this.ciudad = ciudad;
       this.codPostal = codPostal;
       this.imagen = imagen;
       this.productoses = productoses;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Integer getCodPostal() {
        return this.codPostal;
    }
    
    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }
    public byte[] getImagen() {
        return this.imagen;
    }
    
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    public Set getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set productoses) {
        this.productoses = productoses;
    }




}


