/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.Local;
import modelo.Garage;

/**
 *
 * @author LAB00
 */
@Local
public interface ControlBDLocal {

    public void crearGarage(String direccion, String precio, String telefono);

    public List<Garage> ListarGarage();
    
}
