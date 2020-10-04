/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LAB00
 */
@Entity
@Table(name = "garage")
@NamedQueries({
    @NamedQuery(name="Garage.listar",query="select g.id, g.telefono from Garage g")
    
})

public class Garage implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "direccion", length = 150)
    private String direccion;
    @Column(name = "telefono", length = 10)
    private String telefono;
    @Column(name = "precio", precision = 5, scale = 2)
    private BigDecimal precio;
    @OneToMany(mappedBy = "perteneceGarage")//usa la relacion existente q apunta al atributo
    private List<EspacioEstacionamiento> tieneEspacioEstacionamiento;

    public Garage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public List<EspacioEstacionamiento> getTieneEspacioEstacionamiento() {
        if (this.tieneEspacioEstacionamiento == null) {
            this.tieneEspacioEstacionamiento = new ArrayList<>();
        }
        return tieneEspacioEstacionamiento;
    }

    public void setTieneEspacioEstacionamiento(List<EspacioEstacionamiento> tieneEspacioEstacionamiento) {
        this.tieneEspacioEstacionamiento = tieneEspacioEstacionamiento;
    }

}
