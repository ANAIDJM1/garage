/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelo.Garage;

/**
 *
 * @author LAB00
 */
@Stateless //o statefull, convierte la clase control en un EJB

//JEE HACE LAS INSTANCIAS
public class ControlBD implements ControlBDLocal{ //interfaz controlBDlocal debe tener @local dentro del servidor
    @PersistenceContext(unitName = "GaragePU")
    private EntityManager em; //interfaz , glassfish se encarga por persistance al relacional la apk con la BD jdbc
    
    @Override
    public void crearGarage(String direccion, String precio, String telefono){
        Garage garage = new Garage();
        garage.setDireccion(direccion);
        garage.setTelefono(telefono);
        garage.setPrecio(new BigDecimal(precio));
        em.persist(garage);//persiste garage y recien tiene id
    }
    @Override
    public List<Garage>ListarGarage()
    {
        Query consulta=em.createNamedQuery("Garage.listar");
        return consulta.getResultList();
    }
           
}
