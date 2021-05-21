
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Responsable extends Persona implements Serializable {
    
    String tipo_resp;

    public Responsable() {
    }

    public Responsable(String tipo_resp, String nombre, String apellido, String dni, String direccion, Date fecha_nac, String telefono) {
        super(nombre, apellido, dni, direccion, fecha_nac, telefono);
        this.tipo_resp = tipo_resp;
    }

    public Responsable(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }

    public String getTipo_resp() {
        return tipo_resp;
    }

    public void setTipo_resp(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }

    
    
}
