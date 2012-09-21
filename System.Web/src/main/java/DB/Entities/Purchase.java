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
public class Purchase {
    /*el precio que cuesta comprar el archivo*/
    @Size(min = 2, max = 10)
    @NotNull
    private float buy_price;
    
    /*usuario*/
    @Size(min = 10, max = 20)
    @NotNull
    private String usser;
    
    /*nombre del archivo comprado*/
    @Size(min = 5, max = 30)
    @NotNull
    private String file_name;
    
    /*valor de si está en promoción o no*/
    @NotNull
    private boolean promotion;
    
    /*comentario(s)*/
    @Size(min = 2, max = 30)
    @NotNull
    private String comment;
    
    public float get_BPrice(){
        return buy_price;
    }
    
    public String get_Usser(){
        return usser;
    }
    
    public String get_Fname(){
        return file_name;
    }
    
    public boolean get_Promotion(){
        return promotion;
    }
    
    public String get_Comment(){
        return comment;
    }
    
    public void get_BPrice(float bp){
        buy_price = bp;
    }
    
    public void get_Usser(String us){
        usser = us;
    }
    
    public void get_Fname(String fn){
        file_name = fn;
    }
    
    public void get_Promotion(boolean p){
        promotion = p;
    }
    
    public void get_Comment(String c){
        comment = c;
    }
}
