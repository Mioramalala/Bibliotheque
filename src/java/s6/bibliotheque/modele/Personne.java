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
    private int idpersonne;
    private int idtype;
    private Type type;
    private String codemembre;
    private String nommembre;
    private String prenommembre;
    private String adressemembre;
    private Date dateNaissanceMembre;
    private int contact;
    
    public Personne()
    {
        
    }
    
    public Personne(String nommembre,String prenommembre,String adressemembre,Date dateNaissanceMembre,int contact)
    {
        this.setNommembre(nommembre);
        this.setPrenommembre(prenommembre);
        this.setAdressemembre(adressemembre);
        this.setDateNaissanceMembre(dateNaissanceMembre);
        this.setContact(contact);
    }
    
    public Personne(int idpersonne, Type type, String codemembre,String nommembre,String prenommembre,String adressemembre,Date dateNaissanceMembre,int contact)
    {
        this.setIdpersonne(idpersonne);
        this.setIdtype(type.getIdtype());
        this.setCodemembre(codemembre);
        this.setNommembre(nommembre);
        this.setPrenommembre(prenommembre);
        this.setAdressemembre(adressemembre);
        this.setDateNaissanceMembre(dateNaissanceMembre);
        this.setContact(contact);
    }

    public int getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(int idpersonne) {
        this.idpersonne = idpersonne;
    }

    public int getIdtype() {
        return idtype;
    }

    public void setIdtype(int idtype) {
        this.idtype = idtype;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

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
