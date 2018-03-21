
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

    public String getsNombre() {
        return sNombre;
    }

    public String getsEstadio() {
        return sEstadio;
    }

    public URI getuEstadio() {
        return uEstadio;
    }

    public URI getuEscudo() {
        return uEscudo;
    }
    
    public String[] Tabla(){
     return new String[] {getsNombre(), getsEstadio(), getuEscudo().getPath(), getuEstadio().getPath()};
    }
}
