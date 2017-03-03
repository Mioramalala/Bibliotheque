/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.bibliotheque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import s6.bibliotheque.modele.Personne;
import s6.bibliotheque.modele.Type;

/**
 *
 * @author itu
 */
public class PersonneDao {
    public void savePersonne(Personne pers) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("insert into PERSONNE(IDTYPE,CODEMEMBRE,NOMMEMBRE,PRENOMMEMBRE,ADRESSEMEMBRE,CONTACT) values(?,nextval('seqpers')||pers,?,?,?,?)");
            stat.setInt(1, pers.getIdtype());
            stat.setString(2, pers.getNommembre());
            stat.setString(3, pers.getPrenommembre());
            stat.setString(4, pers.getAdressemembre());
            stat.setInt(5, pers.getContact());
            stat.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        } finally {
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void deletePersonne(Personne pers) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("DELETE FROM PERSONNE where codemembre=?");
            stat.setInt(1, pers.getIdtype());
            stat.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public List<Personne> findAllPersonne() throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Personne> pers = new ArrayList<Personne>();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM PERSONNE";
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                Personne temp = new Personne();
                temp.setIdpersonne(rs.getInt(1));
                temp.setIdtype(rs.getInt(2));
                temp.setCodemembre(rs.getString(3));
                temp.setNommembre(rs.getString(4));
                temp.setPrenommembre(rs.getString(5));
                temp.setAdressemembre(rs.getString(6));
                temp.setContact(rs.getInt(6));
                pers.add(temp);
            }
            return pers;
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public Personne finbyIdPersonne(int id) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        Personne pers = new Personne();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM PERSONNE where idpersonne=" + id;
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                pers.setIdpersonne(rs.getInt(1));
                pers.setIdtype(rs.getInt(2));
                pers.setCodemembre(rs.getString(3));
                pers.setNommembre(rs.getString(4));
                pers.setPrenommembre(rs.getString(5));
                pers.setAdressemembre(rs.getString(6));
                pers.setContact(rs.getInt(6));
            }
            return pers;
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
