
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    
    
    boolean tiene_os;
    @OneToOne
    ObraSocial os;
    
    @OneToMany
    List<Responsable> listaResponsables;
    @OneToMany
    List<Turno> listaTurnos;

    public Paciente() {
        this.listaTurnos = new ArrayList<>();
        this.listaResponsables = new ArrayList<>();
    }

    public Paciente(boolean tiene_os, ObraSocial os, String dni, String nombre, String apellido, String direccion, Date fecha_nac, String telefono) {
        super(dni, nombre, apellido, direccion, fecha_nac, telefono);
        this.tiene_os = tiene_os;
        this.os = os;
        this.listaTurnos = new ArrayList<>();
        this.listaResponsables = new ArrayList<>();
    }

    public Paciente(boolean tiene_os, ObraSocial os) {
        this.tiene_os = tiene_os;
        this.os = os;
        this.listaTurnos = new ArrayList<>();
        this.listaResponsables = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public Date getFecha_nac() {
        return fecha_nac;
    }

    @Override
    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    
    public boolean isTiene_os() {
        return tiene_os;
    }

    public void setTiene_os(boolean tiene_os) {
        this.tiene_os = tiene_os;
    }

    public ObraSocial getOs() {
        return os;
    }

    public void setOs(ObraSocial os) {
        this.os = os;
    }

    public List<Responsable> getListaResponsables() {
        return listaResponsables;
    }

    public void setListaResponsables(List<Responsable> listaResponsables) {
        this.listaResponsables = listaResponsables;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    

}
