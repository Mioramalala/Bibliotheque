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
public class Personne {
    private String codemembre;
    private String nommembre;
    private String prenommembre;
    private String adressemembre;
    private Date dateNaissanceMembre;
    private int contact;

    public String getCodemembre() {
        return codemembre;
    }

    public void setCodemembre(String codemembre) {
        this.codemembre = codemembre;
    }

    public String getNommembre() {
        return nommembre;
    }

    public void setNommembre(String nommembre) {
        this.nommembre = nommembre;
    }

    public String getPrenommembre() {
        return prenommembre;
    }

    public void setPrenommembre(String prenommembre) {
        this.prenommembre = prenommembre;
    }

    public String getAdressemembre() {
        return adressemembre;
    }

    public void setAdressemembre(String adressemembre) {
        this.adressemembre = adressemembre;
    }

    public Date getDateNaissanceMembre() {
        return dateNaissanceMembre;
    }

    public void setDateNaissanceMembre(Date dateNaissanceMembre) {
        this.dateNaissanceMembre = dateNaissanceMembre;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}