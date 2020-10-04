/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlBDLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import modelo.Garage;

/**
 *
 * @author LAB00
 */
@WebService(serviceName = "wsGarage")
public class wsGarage {

    @EJB
    private ControlBDLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "crearGarage")
    @Oneway
    public void crearGarage(@WebParam(name = "direccion") String direccion, @WebParam(name = "precio") String precio, @WebParam(name = "telefono") String telefono) {
        ejbRef.crearGarage(direccion, precio, telefono);
    }

    @WebMethod(operationName = "ListarGarage")
    public List<Garage> ListarGarage() {
        return ejbRef.ListarGarage();
    }
    
}
