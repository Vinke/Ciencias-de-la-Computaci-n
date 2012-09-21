/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Manage;
import DB.Entities.*;
import com.sun.istack.internal.NotNull;

/**
 *
 * @author Junior
 */

/*
 * aun no existen estos tipos, pero una vez terminado este modulo deberia verse
 * asi:
 */
/*
 * ArchivoData es un tipo de dato que creo para controlar los archivos media
 */
public class MediaManage {

    @NotNull
    AudioFile data;
    
    @NotNull
    String formato;
    
    @NotNull
    int transacciones;

    public void sendAMedia(AudioFile file) {
        /*
         * para cuando en el modulo de Logica de negocion o control soliciten un AudioFile
         */
    }

    public void deleteAMedia(AudioFile file) {
        /*
         * se elimina un ArchivoMedia que ya ha sido enviado o utilizado y no se desea trabajar más con el
         */
    }

    public void cancelEnvio() {
        /*
         * se cancela el envio de un ArchivoMedia cuando este no es el correcto o no es el consultado
         */
    }
}
