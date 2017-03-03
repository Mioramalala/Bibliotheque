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

    private int idtype;
    private String libelletype;

    public Type() {

    }

    public Type(String libelletype) {
        this.setLibelletype(libelletype);
    }
    
    public Type(int idtype, String libelletype) {
        this.setIdtype(idtype);
        this.setLibelletype(libelletype);
    }

    public int getIdtype() {
        return idtype;
    }

    public void setIdtype(int idtype) {
        this.idtype = idtype;
    }

    public String getLibelletype() {
        return libelletype;
    }

    public void setLibelletype(String libelletype) {
        this.libelletype = libelletype;
    }
}
