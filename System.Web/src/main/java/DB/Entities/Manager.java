/*
 * Created by Group 2 on 16/09/12.
 * 
 * Copyright (c) 2012 Group 2. All rights reserved
 * 
 * This software is confidential and property of Group 2 UCSP Computer Science.
 * 
 */
package DB.Entities;

import javax.validation.constraints.*;

/*
 * @version 1.1
 *
 * Class Manager.java
 *
 * La entidad {@code Manager} define la cuenta personal del administrador con
 * sus datos respectivos.
 * 
 */
public class Manager {

    /*
     * Nombre completo del administrador.
     */
    @NotNull
    @Size(min = 3, max = 20)
    private String name;
    
    /*
     * Apellido del administrador.
     */
    @NotNull
    @Size(min = 1, max = 50)
    private String lastName;
    
    /*
     * Edad del administrador.
     */
    @NotNull
    @Min(18)
    private int age;
    
    /*
     * Dirección del administrador.
     */
    @NotNull
    @Size(min = 1, max = 100)
    private String address;
    
    /*
     * Teléfono fijo del administrador.
     */
    @NotNull
    @Size(min = 4, max = 15)
    private String phone;
    
    /*
     * Teléfono Celular del administrador
     */
    @NotNull
    @Size(min = 4, max = 15)
    private String cellPhone;
    
    /*
     * DNI del administrador.
     */
    @NotNull
    @Size(min = 4, max = 8)
    private String dni;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String newLastName){
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(String newAge){
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String newPhone){
    }
    
    public String getCellPhone(){
        return cellPhone;
    }
    public void setCellPhone(String newCellPhone){
    }
    
    public String getDni(){
        return dni;
    }
    public void setDni(String newDni){
    }
}
