/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB.Entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Osmar
 */
public class User {
    
    @NotNull
    @Size(min = 3, max = 20)
    private String name;
    
    @NotNull
    @Size(50)
    private String lastName;
    
    @NotNull
    private int age;
    
    @NotNull
    @size(100)
    private String address;
    
    private String phone;
    
    private String cellPhone;
    
    @NotNull
    private boolean type;
    
    String get_name(){
        return null;
    }
    void set_lastName(String lname_){
    }
    
    String get_LastName(){
        return null;
    }
    void set_LastName(String lname_){
    }
    
    String get_age(){
        return null;
    }
    void set_age(String age_){
    }
    
    String get_address(){
        return null;
    }
    void get_address(String address_){
    }
    
    String get_phone(){
        return null;
    }
    void get_phone(String phone_){
    }
    
    String get_cellPhone(){
        return null;
    }
    void get_cellPhone(String cellPhone_){
    }
    
    String get_type(){
        return null;
    }
    void get_type(String type_){
    }
    
    
}
