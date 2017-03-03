/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.bibliotheque.modele;

import java.util.Date;

/**
 *
 * @author itu
 */
public class Pret {
    private int idpret;
    private int idmembre;
    private int idouvrage;
    private String codepret;
    private Date dateemprunt;
    
    public Pret()
    {
        
    }
    
    public Pret(Date dateemprunt)
    {
        this.setDateemprunt(dateemprunt);
    }
    
    public Pret(int idpret, String codepret,Date dateemprunt)
    {
        this.setIdpret(idpret);
        this.setCodepret(codepret);
        this.setDateemprunt(dateemprunt);
    }

    public int getIdpret() {
        return idpret;
    }

    public void setIdpret(int idpret) {
        this.idpret = idpret;
    }

    public int getIdmembre() {
        return idmembre;
    }

    public void setIdmembre(int idmembre) {
        this.idmembre = idmembre;
    }

    public int getIdouvrage() {
        return idouvrage;
    }

    public void setIdouvrage(int idouvrage) {
        this.idouvrage = idouvrage;
    }

    public String getCodepret() {
        return codepret;
    }

    public void setCodepret(String codepret) {
        this.codepret = codepret;
    }

    public Date getDateemprunt() {
        return dateemprunt;
    }

    public void setDateemprunt(Date dateemprunt) {
        this.dateemprunt = dateemprunt;
    }
}
