
package Model;

import java.io.Serializable;
import java.net.URI;

public class EquipoModel implements Serializable{
    
    private String sNombre;
    private String sEstadio;
    private URI uEstadio;
    private URI uEscudo;

    public EquipoModel(String sNombre, String sEstadio, URI uEstadio, URI uEscudo) {
        this.sNombre = sNombre;
        this.sEstadio = sEstadio;
        this.uEstadio = uEstadio;
        this.uEscudo = uEscudo;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setsEstadio(String sEstadio) {
        this.sEstadio = sEstadio;
    }

    public void setuEstadio(URI uEstadio) {
        this.uEstadio = uEstadio;
    }

    public void setuEscudo(URI uEscudo) {
        this.uEscudo = uEscudo;
    }
}
