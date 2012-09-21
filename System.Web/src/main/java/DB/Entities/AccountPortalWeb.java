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
 * Class AccountPortalWeb.java
 *
 * La entidad {@code AccountPortalWeb} define la cuenta del adminsitrador de la
 * pagina web, donde posteriormente se pondrán todas las ganancias. Esta cuenta
 * es unicamente modificada y usada por el administrador de la página web.
 */
public class AccountPortalWeb {

    /*
     * Indica la fecha de creación de la cuenta a ser usada por el
     * administrador.
     */
    
    /*
     * Fecha de apertura de la Cuenta Admin Formato de la fecha "dd/mm/yyyy"
     */
    @NotNull
    @Size(min = 10)
    private String openingDate;
    
    /*
     * Saldo en cuenta del usuario Admin Debe ser mayor o igual a 0.00 Formato
     * del saldo "0.00"
     */
    @DecimalMin("0.00")
    private float balance;
    
    /*
     * La cuenta Admin siempre debe estar activa para recibir los pagos de los
     * otros usuarios, si la cuenta no esta activa la página debe cambiar a
     * inactiva.
     */
    @AssertTrue
    private boolean isActive;
    
    /*
     * Usuario Admin
     */
    @NotNull
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User newUser) {
    }

    public boolean getAccountState() {
        return isActive;
    }

    public void setAccountState(boolean newState) {
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float newBalance) {
    }
    
    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(float newDate) {
    }
}
