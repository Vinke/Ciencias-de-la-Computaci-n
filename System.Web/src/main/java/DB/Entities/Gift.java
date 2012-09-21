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
 * Class Gift.java
 *
 * La entidad {@code Gift} define un regalo (imagen, video, cancion) que se da
 * de un usuario a otro.
 */

public class Gift {
    
    /*
     * Usuario destino.
     */
    @NotNull
    private User destination;
    
    /*
     * Usuario emisor.
     */
    @NotNull
    private User emitter;
    
    /*
     * Imagefile es un archivo imagen que sera enviado como regalo por el
     * usuario emisor al usuario destino.
     */
    private ImageFile imgfile;
    
    /*
     * Imagefile es un archivo media que sera enviado como regalo por el
     * usuario emisor al usuario destino.
     */
    private AudioFile audiofile;
    
    /*
     * Imagefile es un archivo video que sera enviado como regalo por el
     * usuario emisor al usuario destino.
     */
    private Videofile videofile;
    
    public User getDestination() {
        return destination;
    }
    
    public void setDestination(User newDestination) {
    }
    
    public User getEmitter() {
        return emitter;
    }
    
    public void setEmitter(User newEmitter) {
    }
    
    public ImageFile getImgfile() {
        return imgfile;
    }
    
    public void setImgfile(ImageFile newImgfile) {
    }
    
    public AudioFile getMediafile() {
        return audiofile;
    }
    
    public void setMediafile(AudioFile newMediafile) {
    }
       
    public Videofile getVideofile() {
        return videofile;
    }
    
    public void setVideofile(Videofile newVideofile) {
    }
}
