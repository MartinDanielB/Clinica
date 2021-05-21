/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Paciente;
import Logica.Turno;
import Logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martin
 */
public class ControladoraPersistencia {
    
    
    HorarioJpaController horariojpa;
    PacienteJpaController pacjpa;
    TurnoJpaController turnojpa;
    UsuarioJpaController userjpa;
    
    public ControladoraPersistencia() {
        this.horariojpa = new HorarioJpaController(Conexion.getEmf());
        this.pacjpa = new PacienteJpaController(Conexion.getEmf());
        this.turnojpa = new TurnoJpaController(Conexion.getEmf());
        this.userjpa = new UsuarioJpaController(Conexion.getEmf());
    }   
    

    public void crearTurno(Turno turno) {
        try {
            this.turnojpa.create(turno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> getUsuarios() {
        
       return this.userjpa.findUsuarioEntities();
       
    }

    public void crearPaciente(Paciente pac) {
        this.pacjpa.create(pac);
        
    }
    
    public List<Paciente> getPacientes() {
        
       return this.pacjpa.findPacienteEntities();
       
    }

    
    
}
