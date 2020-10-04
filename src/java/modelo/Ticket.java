/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author LAB00
 */
@Entity
@Table(name = "ticket")
public class Ticket implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Transient
    private LocalDateTime horaIngreso;
    @ManyToOne
    @JoinColumn(name = "ocupaespacioestacionamiento", referencedColumnName = "id")
    private EspacioEstacionamiento ocupaEspacioEstacionamiento;
    @ManyToOne
    @JoinColumn(name = "pertenecevehiculo", referencedColumnName = "id")
    private Vehiculo perteneceVehiculo;

    public Ticket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public EspacioEstacionamiento getOcupaEspacioEstacionamiento() {
        return ocupaEspacioEstacionamiento;
    }

    public void setOcupaEspacioEstacionamiento(EspacioEstacionamiento ocupaEspacioEstacionamiento) {
        this.ocupaEspacioEstacionamiento = ocupaEspacioEstacionamiento;
    }

    public Vehiculo getPerteneceVehiculo() {
        return perteneceVehiculo;
    }

    public void setPerteneceVehiculo(Vehiculo perteneceVehiculo) {
        this.perteneceVehiculo = perteneceVehiculo;
    }
    
}
