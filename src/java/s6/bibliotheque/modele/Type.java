/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.bibliotheque.modele;

/**
 *
 * @author itu
 */
public class Type {
    private String libelletype;
    
    public Type()
    {
        
    }
    
    public Type(String libelletype)
    {
        this.setLibelletype(libelletype);
    }

    public String getLibelletype() {
        return libelletype;
    }

    public void setLibelletype(String libelletype) {
        this.libelletype = libelletype;
    }
}
