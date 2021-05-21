/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Martin
 */
@Entity
public class Secretaria extends Persona implements Serializable{
    
   
    String sector;
    @OneToOne
    Usuario user;

    public Secretaria() {
    }

    public Secretaria(String sector, Usuario user, String nombre, String apellido, String dni, String direccion, Date fecha_nac, String telefono) {
        super(nombre, apellido, dni, direccion, fecha_nac, telefono);
        this.sector = sector;
        this.user = user;
    }

    public Secretaria(String sector, Usuario user) {
        this.sector = sector;
        this.user = user;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
  

}