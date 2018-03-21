
package Controller;

import Model.EquipoModel;
import java.util.ArrayList;

public class EquipoController {
    
    private ArrayList Equipos = new ArrayList<EquipoModel>();

    public EquipoController() {
    }

    public void Post(EquipoModel Equipo){
        Equipos.add(Equipo);
    }
    
    public void Get(String Filter){
        
    }
    
    public void Put(int Index, EquipoModel Equipo){
        Equipos.set(Index, Equipo);
    }
    
    public void Delete(int Index){
        Equipos.remove(Index);
    }
    
    public ArrayList getEquipos() {
        return Equipos;
    }
    
    
    
}
