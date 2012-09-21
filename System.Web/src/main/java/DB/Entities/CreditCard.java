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
 * Class CreditCard.java
 *
 * La entidad {@code CreditCard} define la tarjeta de credito del usuario, por
 * la cual se haran las compras deacuerdo al estado de la cuenta del 
 * usuario. 
 */

public class CreditCard {
    
    
    /*
     * Usuario
     */
    @NotNull
    private User user;
    
    /*
     * Saldo en cuenta del usuario, debe ser mayor o igual a 0.00, formato
     * del saldo "0.00"
     */
    @DecimalMin("0.00")
    private float saldo;
    
    /*
     * Mientras no tenga ningun tipo de deuda el estado debe ser "Activa" en 
     * otro caso "Inactiva"
     */
    @AssertTrue
    private boolean estado;
    
    public User getUser() {
        return user;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public boolean getEstado() {
        return estado;
    }
    
    public void setUser(User newUser) {
    }
    
    public void setSaldo(float newSaldo) {
    }
    
    public void setEstado(boolean newEstado) {
    }
}
