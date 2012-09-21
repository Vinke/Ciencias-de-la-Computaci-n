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
 * Class ImageFile.java
 *
 * La entidad {@code ImageFile} define toda la informacion acerca de los
 * archivos de tipo imagen del proyecto.
 */

public class ImageFile {
    
    /*
     * Nombre del archivo imagen
     */
    @NotNull
    @Size(min = 10)
    private String nameImg;
    
    /*
     * Resolucion del archivo imagen (en pixeles)
     */
    @NotNull
    private String resolution;
    
    /*
     * Tipo de imagen (jpg, jpeg, etc).
     */
    @NotNull
    private String type;
    
    /*
     * Precio del archivo imagen (en dolares).
     */
    @NotNull
    private String price;
    
    /*
     * Muestra si el archivo imagen es una promocion o no.
     */
    @AssertTrue
    private boolean promotion;
    
    /*
     * La valoracion que los usuarios le dieron al archivo imagen.
     */
    @NotNull
    @Max(10)
    @Min(0)
    private int valuation;
    
    public String getNameImg() {
        return nameImg;
    }
    
    public void setNameImg(String newNameImg) {
    }
    
    public String getResolution() {
        return resolution;
    }
    
    public void setResolution(String newResolution) {
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String newType) {
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String newPrice) {
    }
    
    public boolean getPromotion() {
        return promotion;
    }
    
    public void setPromotion(boolean newPromotion) {
    }
    
    public int getValuation() {
        return valuation;
    }
    
    public void setValuation(int newValuation) {
    }
}
