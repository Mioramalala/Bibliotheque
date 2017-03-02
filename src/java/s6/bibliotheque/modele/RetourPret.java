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
    private Date dateretour;
    
    public RetourPret()
    {
        
    }
    
    public RetourPret(Date dateretour)
    {
        this.setDateretour(dateretour);
    }

    public Date getDateretour() {
        return dateretour;
    }

    public void setDateretour(Date dateretour) {
        this.dateretour = dateretour;
    }
}
