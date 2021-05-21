
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ObraSocial implements Serializable{
    @Id
    int id_obraSocial;
    String nombre_os;
    String coberturaOS;

    public ObraSocial() {
    }

    public ObraSocial(int id_obraSocial, String nombre_os, String coberturaOS) {
        this.id_obraSocial = id_obraSocial;
        this.nombre_os = nombre_os;
        this.coberturaOS = coberturaOS;
    }

    

    public int getId_obraSocial() {
        return id_obraSocial;
    }

    public void setId_obraSocial(int id_obraSocial) {
        this.id_obraSocial = id_obraSocial;
    }

    public String getNombre_os() {
        return nombre_os;
    }

    public void setNombre_os(String nombre_os) {
        this.nombre_os = nombre_os;
    }

    public String getCoberturaOS() {
        return coberturaOS;
    }

    public void setCoberturaOS(String coberturaOS) {
        this.coberturaOS = coberturaOS;
    }

    

    
    
}
