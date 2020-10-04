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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LAB00
 */
@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "placa", length = 10)
    private String placa;
    @OneToMany(mappedBy = "perteneceVehiculo")
    private List<Ticket> recibeTicket;

    public Vehiculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Ticket> getRecibeTicket() {
        if (this.recibeTicket ==  null) {
            this.recibeTicket = new ArrayList<>();
        }
        return recibeTicket;
    }

    public void setRecibeTicket(List<Ticket> recibeTicket) {
        this.recibeTicket = recibeTicket;
    }
    
}
