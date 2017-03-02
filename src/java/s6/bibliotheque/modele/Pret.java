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
    private String codepret;
    private Date dateemprunt;

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
