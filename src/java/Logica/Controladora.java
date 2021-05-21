package Logica;

import Persistencia.ControladoraPersistencia;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    private List<Usuario> listaUsuarios;
    private List<Paciente> listaPacientes;

    public void crearTurno(String fecha, Date horario, String motivo) {
        Turno turno = new Turno(validador(fecha),horario,motivo);

        controladoraPersistencia.crearTurno(turno);
    }

    public boolean comprobarIngreso(String usuario, String clave) {
        boolean check = false;

        listaUsuarios = controladoraPersistencia.getUsuarios();
        for (Usuario user : listaUsuarios) {
            if (user.getUser().equals(usuario) && user.getPsw().equals(clave)) {
                check = true;
                return check;
            }
        }
        return check;

    }

    public void crearPaciente(boolean b, ObraSocial os, String dni, String nombre, String apellido, String direccion, String fecha_nac, String telefono) {
        
        Paciente pac = new Paciente( b,  os,  dni,  nombre,  apellido,  direccion,  validador(fecha_nac),  telefono);
        

        controladoraPersistencia.crearPaciente(pac);

    }
    
    public List<Paciente> obtenerPacientes(){
        listaPacientes = controladoraPersistencia.getPacientes();
        return listaPacientes;
        
    }

    public Date validador(String strFecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MM/dd/yyyy");
        
        Date fecha = null;
        try {

            fecha = formatoDelTexto.parse(strFecha);

        } catch (ParseException ex) {

            ex.printStackTrace();

        }
        return fecha;
    }
    
    public Date validador2(String strFecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MM/dd/yyyy");
        
        Date fecha = null;
        try {

            fecha = formatoDelTexto.parse(strFecha);

        } catch (ParseException ex) {

            ex.printStackTrace();

        }
        return fecha;
    }

   
}
