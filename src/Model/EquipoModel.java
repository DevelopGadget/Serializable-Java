
package Model;

import java.io.Serializable;
import java.net.URL;

public class EquipoModel implements Serializable{
    
    private String sNombre;
    private String sEstadio;
    private URL uEstadio;
    private URL uEscudo;

    public EquipoModel(String sNombre, String sEstadio, URL uEstadio, URL uEscudo) {
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

    public URL getuEstadio() {
        return uEstadio;
    }

    public URL getuEscudo() {
        return uEscudo;
    }
    
    public String[] Tabla(){
     return new String[] {getsNombre(), getsEstadio(), getuEscudo().toString(), getuEstadio().toString()};
    }
}
