/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB.Entities;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Osmar
 */
public class Promotion {
    
    /*nombre de la promoción*/
    @Size(min = 5, max = 20)
    @NotNull
    private String name;
    
    /*fecha de inicio de la promoción*/
    @Size(min = 10, max = 20)
    @NotNull
    private String date_start;
    
    /*fecha de caducidad de la promoción*/
    @Size(min = 10, max = 20)
    @NotNull
    private String date_finish;
    
    /*número de archivos promocionados*/
    @NotNull
    private int stock;
    
    /*imágen que se promociona*/
    private ImageFile imgfile;
    
    /*archivo de música que se promociona*/
    private AudioFile mediafile;
    
    /*archivo de video que se promociona*/
    private Videofile videofile;
    
    /*precio del producto(s) promocionado(s)*/
    @NotNull
    float price;
    
    public String get_name(){
        return name;
    }
    
    public String getD_Start(){
        return date_start;
    }
    
    public String getD_Finish(){
        return date_finish;
    }
    
    public int get_Stock(){
        return stock;
    }
    
    public ImageFile get_ImageFile(){
        return imgfile;
    }
    
    public AudioFile get_MediaFile(){
        return mediafile;
    }
    
    public Videofile get_VideoFile(){
        return videofile;
    }
    
    public float get_Price(){
        return price;
    }
    
    public void set_name(String n){
        name = n;
    }
    
    public void setD_Start(String DS){
        date_start = DS;
    }
    
    public void setD_Finish(String DF){
        date_finish = DF;
    }
    
    public void set_Stock(int s){
        stock = s;
    }
    
    public void set_ImageFile(ImageFile Img){
        imgfile =Img;
    }
    
    public void set_MediaFile(AudioFile AF){
        mediafile = AF;
    }
    
    public void set_VideoFile(Videofile VF){
        videofile = VF;
    }
    
    public void set_Price(float p){
        price = p;
    }
}
