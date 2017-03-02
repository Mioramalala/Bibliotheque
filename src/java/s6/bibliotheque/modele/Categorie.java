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
public class Categorie {
    private int idcategorie;
    private String codecategorie;
    private String libellecategorie;
    private int dureeempruntcat;
    private int penalitecat;
    
    public Categorie()
    {
        
    }
    
    public Categorie(String libellecategorie,int dureeempruntcat,int penalitecat)
    {
        this.setLibellecategorie(libellecategorie);
        this.setDureeempruntcat(dureeempruntcat);
        this.setPenalitecat(penalitecat);
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }
    
    public String getCodecategorie() {
        return codecategorie;
    }

    public void setCodecategorie(String codecategorie) {
        this.codecategorie = codecategorie;
    }

    public String getLibellecategorie() {
        return libellecategorie;
    }

    public void setLibellecategorie(String libellecategorie) {
        this.libellecategorie = libellecategorie;
    }

    public int getDureeempruntcat() {
        return dureeempruntcat;
    }

    public void setDureeempruntcat(int dureeempruntcat) {
        this.dureeempruntcat = dureeempruntcat;
    }

    public int getPenalitecat() {
        return penalitecat;
    }

    public void setPenalitecat(int penalitecat) {
        this.penalitecat = penalitecat;
    }
}
