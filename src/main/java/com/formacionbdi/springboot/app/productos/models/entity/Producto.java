package com.formacionbdi.springboot.app.productos.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="productos")
public class Producto implements Serializable {  //para convertir en bits, sirve para guardar en sesion, en archivo de texto, es funcional

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //autoincremental, identity identidad autoincrementada
    private Long id;

    private String nombre;
    private Double precio;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)  //tipo de tiempo (date, fecha año mes dia)
    private Date createAt;

    @Transient
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
