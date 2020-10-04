/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LAB00
 */
@Entity
@Table(name = "espacioestacionamiento")
public class EspacioEstacionamiento implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero")
    private Short numero;
    @Column(name = "estadisponible")
    private boolean estaDisponible;
    @ManyToOne
    @JoinColumn(name = "pertenecegarage", referencedColumnName = "id")
    private Garage perteneceGarage;
    @OneToMany(mappedBy = "ocupaEspacioEstacionamiento")
    private List<Ticket> tieneTicket;

    public EspacioEstacionamiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public Garage getPerteneceGarage() {
        return perteneceGarage;
    }

    public void setPerteneceGarage(Garage perteneceGarage) {
        this.perteneceGarage = perteneceGarage;
    }

    public List<Ticket> getTieneTicket() {
        if (this.tieneTicket == null) {
            this.tieneTicket = new ArrayList<>();
        }
        return tieneTicket;
    }

    public void setTieneTicket(List<Ticket> tieneTicket) {
        this.tieneTicket = tieneTicket;
    }
    
}
