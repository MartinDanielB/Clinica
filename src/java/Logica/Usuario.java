
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable {
    @Id
    int id_usuario;
    String user;
    String psw;

    public Usuario() {
    }

    public Usuario(int id_usuario, String user, String psw) {
        this.id_usuario = id_usuario;
        this.user = user;
        this.psw = psw;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    
}
