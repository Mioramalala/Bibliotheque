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

    private int idouvrage;
    private Categorie cat;
    private int idcategorie;
    private String codeouvrage;
    private String titreouvrage;
    private String auteurouvrage;
    private String editeurouvrage;
    private int nombrepage;
    private int nombreouvrage;

    public Ouvrage() {

    }

    public Ouvrage(Categorie cat, String titreouvrage, String auteurouvrage, String editeurouvrage, int nombrepage, int nombreouvrage) {
        this.setIdcategorie(cat.getIdcategorie());
        this.setTitreouvrage(titreouvrage);
        this.setAuteurouvrage(auteurouvrage);
        this.setEditeurouvrage(editeurouvrage);
        this.setNombrepage(nombrepage);
        this.setNombreouvrage(nombreouvrage);
    }

    public Ouvrage(int idouvrage, Categorie cat, String codeouvrage, String titreouvrage, String auteurouvrage, String editeurouvrage, int nombrepage, int nombreouvrage) {
        this.setIdouvrage(idouvrage);
        this.setIdcategorie(cat.getIdcategorie());
        this.setCodeouvrage(codeouvrage);
        this.setTitreouvrage(titreouvrage);
        this.setAuteurouvrage(auteurouvrage);
        this.setEditeurouvrage(editeurouvrage);
        this.setNombrepage(nombrepage);
        this.setNombreouvrage(nombreouvrage);
    }

    public int getIdouvrage() {
        return idouvrage;
    }

    public void setIdouvrage(int idouvrage) {
        this.idouvrage = idouvrage;
    }

    public Categorie getCat() {
        return cat;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
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
