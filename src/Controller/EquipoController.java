package Controller;

import Model.EquipoModel;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class EquipoController {

    private ArrayList<EquipoModel> Equipos = new ArrayList<EquipoModel>();

    public EquipoController() {
    }

    public void Post(EquipoModel Equipo) {
        Equipos.add(Equipo);
    }

    public void Get(String Filter) {

    }

    public void Put(int Index, EquipoModel Equipo) {
        Equipos.set(Index, Equipo);
    }

    public void Delete(int Index) {
        Equipos.remove(Index);
    }

    public boolean ValUrl(String Url) {
        try {
            ImageIO.read(new URL(Url));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public ArrayList<EquipoModel> getEquipos() {
        return Equipos;
    }

}
