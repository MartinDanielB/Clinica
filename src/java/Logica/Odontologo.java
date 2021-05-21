
package Logica;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona{
    
    String especialidad;
    @OneToOne
    Usuario user;
    @OneToMany
    List<Horario> listaHorarios;
    @OneToMany
    List<Turno> listaTurnos;

    public Odontologo() {
        this.listaTurnos = new ArrayList<>();
        this.listaHorarios = new ArrayList<>();
    }

    public Odontologo(String especialidad, Usuario user, String dni, String nombre, String apellido, String direccion, Date fecha_nac, String telefono) {
        super(dni, nombre, apellido, direccion, fecha_nac, telefono);
        this.especialidad = especialidad;
        this.user = user;
        this.listaTurnos = new ArrayList<>();
        this.listaHorarios = new ArrayList<>();
    }

    public Odontologo(String especialidad, Usuario user) {
        this.especialidad = especialidad;
        this.user = user;
        this.listaTurnos = new ArrayList<>();
        this.listaHorarios = new ArrayList<>();
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Horario> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(List<Horario> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    
    
}
