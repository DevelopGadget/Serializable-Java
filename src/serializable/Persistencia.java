package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Persistencia {

    private File fichero;
    private FileInputStream archivo;
    private ObjectInputStream obj_archivo;
    private FileOutputStream persisten;
    private ObjectOutputStream obj_persiten;

    public Object cargar_datos(String url) {
        fichero = new File(url);
        if (fichero.exists()) {
            try {
                archivo = new FileInputStream(url);
                obj_archivo = new ObjectInputStream(archivo);
                return obj_archivo.readObject();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo");
                return null;
            }
        } else {
            return null;
        }

    }

    public void Escribir(String Url, ArrayList Array) {
        try {
            persisten = new FileOutputStream(Url);
            obj_persiten = new ObjectOutputStream(persisten);
            obj_persiten.writeObject(Array);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error",  "Error", 0);
        }
    }

}
