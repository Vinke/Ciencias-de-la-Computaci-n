/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Manage;

import DB.Entities.UserDB;
import com.sun.istack.internal.NotNull;

public class ConectionDB {
    
    @NotNull
    UserDB user;

    void get_connection(String ussername, String password){
        /*
         * los datos ussername y password estan en UserDB;
         *  ussername = user.get_ussername();
         *  password = user.get_password();
         */
    }
    public void disconnect(){
        /*
         * hace que se desconecte de la BD 
         */
    
    }
}
