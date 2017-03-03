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
public class RetourPret {
    private int idretour;
    private int idpret;
    private Date dateretour;
    
    public RetourPret()
    {
        
    }
    
    public RetourPret(Date dateretour)
    {
        this.setDateretour(dateretour);
    }
    
    public RetourPret(int idretour, Pret pret, Date dateretour)
    {
        this.setIdretour(idretour);
        this.setIdpret(pret.getIdpret());
        this.setDateretour(dateretour);
    }

    public int getIdretour() {
        return idretour;
    }

    public void setIdretour(int idretour) {
        this.idretour = idretour;
    }

    public int getIdpret() {
        return idpret;
    }

    public void setIdpret(int idpret) {
        this.idpret = idpret;
    }

    public Date getDateretour() {
        return dateretour;
    }

    public void setDateretour(Date dateretour) {
        this.dateretour = dateretour;
    }
}
