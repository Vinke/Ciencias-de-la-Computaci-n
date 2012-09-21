/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB.Entities;

import com.sun.istack.internal.NotNull;

/**
 *
 * @author group 
 */
public class UserAccount {
    
    @NotNull
    @DecimalMax(4)
    private float balance;  /* el saldo con el que cuenta el usuario */
    
    @NotNull
    private String beginDate;
    
    @NotNull
    private boolean state;
    
    float get_balance(){
        return 0;
    }
    
    void set_balance(float balance_){
    }
    
    String get_beginDate(){
        return null;
    }
    
    void set_beginDate(String beginDate_){
    }
    
    boolean get_state(){
        return false;
    }
    
    void set_state(){
    }
    
    
}
