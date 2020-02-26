package mx.unam.dgtic.datos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntradaDeCine implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String sala;
    private String asiento;

    public EntradaDeCine() {
    }

    public EntradaDeCine(String sala, String asiento) {
        this.sala = sala;
        this.asiento = asiento;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "EntradaDeCine{" + "sala=" + sala + ", asiento=" + asiento + '}';
    }
    
}
