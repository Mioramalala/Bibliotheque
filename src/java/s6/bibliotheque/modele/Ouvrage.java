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
public class Ouvrage {
    private String codeouvrage;
    private String titreouvrage;
    private String auteurouvrage;
    private String editeurouvrage;
    private int nombrepage;
    private int nombreouvrage;
    
    public Ouvrage(String codeouvrage,String titreouvrage,String auteurouvrage,String editeurouvrage,int nombrepage,int nombreouvrage)
    {
        this.setCodeouvrage(codeouvrage);
        this.setTitreouvrage(titreouvrage);
        this.setAuteurouvrage(auteurouvrage);
        this.setEditeurouvrage(editeurouvrage);
        this.setNombrepage(nombrepage);
        this.setNombreouvrage(nombreouvrage);
    }

    public String getCodeouvrage() {
        return codeouvrage;
    }

    public void setCodeouvrage(String codeouvrage) {
        this.codeouvrage = codeouvrage;
    }

    public String getTitreouvrage() {
        return titreouvrage;
    }

    public void setTitreouvrage(String titreouvrage) {
        this.titreouvrage = titreouvrage;
    }

    public String getAuteurouvrage() {
        return auteurouvrage;
    }

    public void setAuteurouvrage(String auteurouvrage) {
        this.auteurouvrage = auteurouvrage;
    }

    public String getEditeurouvrage() {
        return editeurouvrage;
    }

    public void setEditeurouvrage(String editeurouvrage) {
        this.editeurouvrage = editeurouvrage;
    }

    public int getNombrepage() {
        return nombrepage;
    }

    public void setNombrepage(int nombrepage) {
        this.nombrepage = nombrepage;
    }

    public int getNombreouvrage() {
        return nombreouvrage;
    }

    public void setNombreouvrage(int nombreouvrage) {
        this.nombreouvrage = nombreouvrage;
    }
}
