package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Horario implements Serializable {

    @Id
    int id_horario;
    @Temporal(TemporalType.DATE)
    Date horario_entrada;
    @Temporal(TemporalType.DATE)
    Date horario_salida;
    String dia_semana;

    public Horario(int id_horario, Date horario_entrada, Date horario_salida, String dia_semana) {
        this.id_horario = id_horario;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;
        this.dia_semana = dia_semana;
    }

    public Horario() {
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Date getHorario_entrada() {
        return horario_entrada;
    }

    public void setHorario_entrada(Date horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    public Date getHorario_salida() {
        return horario_salida;
    }

    public void setHorario_salida(Date horario_salida) {
        this.horario_salida = horario_salida;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

}
