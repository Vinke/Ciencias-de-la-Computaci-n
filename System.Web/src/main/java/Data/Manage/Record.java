/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Manage;
import DB.Entities.UserDB;
import DB.Entities.*;
import com.sun.istack.internal.NotNull;

/**
 *
 * @author Luis Alemán
 */
public class Record {
    /*
     * Cada usuario tendra relacionado a el un historial o registro de las
     * descargas que haga y de los regalos que haya hecho
     */
    @NotNull
    private UserDB usser;
    
    @NotNull
    private AudioFile archivo;

    public void insert_archivo(AudioFile arch_) {
        /*Para insertar un archivo en el historial(record) de cada usuario,
         * sea uno descargado o uno que sea regaladoya*/
    }

    public void historial_descargas() {
        /*Muestra todos los archivos descargados por el usuario*/
    }

    public void historial_regalos() {
        /*Muestra todos los archivos que el usuario ha regalado*/
    }
}
