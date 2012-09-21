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
 * Class AudioFile.java
 *
 * La entidad {@code AudioFile} define el formato de audio de un MediaFile, el 
 * cual sera puesto en venta en el sistema web junto a otros formatos de MediaFile.
 */
public class AudioFile {
    /*
     * Nombre del archivo de audio.
     */
    @NotNull
    @Size(min = 1, max = 50)
    private String fileName;
    
    /*
     * El formato comprende el tipo de archivo unicamente para los de tipo audio.
     * Ejemplo: .mp3, .wav.
     */
    @NotNull
    @Size(min = 1, max = 10)
    private String fileFormat;
    
    /*
     * La duración del archivo.
     */
    @NotNull
    @DecimalMin("0.00")
    private float fileDuration;
    
    /*
     * El autor debera tener unicamente el nombre de grupo, cantante con el que es
     * conocido. Ejemplo: Bon Jovi
     */
    @NotNull
    @Size(min = 1, max = 50)
    private String fileAuthor;
    
    /*
     * El precio del producto, 
     * el cual se vera afectado unicamente cuando exitan promociones.
     */
    @NotNull
    @DecimalMin("1.00")
    private float filePrice;
            
    /*
     * La valoracion del producto se verá afectada por la apreciacion del usuario
     * y por la cantidad de veces descargada. Un archivo puede que no sea votada ni
     * descargada en tal caso por defecto será 0.
     */
    @Min(0)
    @Max(10)
    private int fileRate;
    
    /*
     * La promoción pdora afectar a un unico tipo archivo o a varios tipos de archivos
     */
    private boolean isInPromotion;
    
    public String getAuthor(){
        return fileAuthor;
    }
    
    public void setAuthor(String newAuthor){
    }
    
    public float getDuration(){
        return fileDuration;
    }
    
    public void setDuration(float newDuration){
    }
    
    public String getFormat(){
        return fileFormat;
    }
    
    public void setFormat(String newFormat){
    }
    
    public String getName(){
        return fileName;
    }
    
    public void setName(String newName){
    }
    
    public float getPrice(){
        return filePrice;
    }
    
    public void setAuthor(float newPrice){
    }
    
    public int getRate(){
        return fileRate;
    }
    
    public void setRate(int newRate){
    }
    
    public boolean getPromotion(){
        return isInPromotion;
    }
    
    public void setPromotion(int newPromotion){
    }
    
}
