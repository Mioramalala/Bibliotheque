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
    private String codecategorie;
    private String libellecategorie;
    private String dureeempruntcat;
    private String penalitecat;

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

    public String getDureeempruntcat() {
        return dureeempruntcat;
    }

    public void setDureeempruntcat(String dureeempruntcat) {
        this.dureeempruntcat = dureeempruntcat;
    }

    public String getPenalitecat() {
        return penalitecat;
    }

    public void setPenalitecat(String penalitecat) {
        this.penalitecat = penalitecat;
    }
}
