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
import s6.bibliotheque.modele.Categorie;
import s6.bibliotheque.modele.Ouvrage;

/**
 *
 * @author itu
 */
public class OuvrageDao {
    public void saveOuvrage(Ouvrage ouvr) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("insert into OUVRAGE(IDCATEGORIE,CODEOUVRAGE,TITRREOUVRAGE,AUTEUROUVRAGE,EDITEUROUVRAGE,NOMBREPAGE,NOMBREOUVRAGE) values(nextval(?,'seqouvr')||'ouvr',?,?,?,?,?)");
            stat.setInt(1, ouvr.getCat().getIdcategorie());
            stat.setString(2, ouvr.getTitreouvrage());
            stat.setString(3, ouvr.getAuteurouvrage());
            stat.setString(4, ouvr.getEditeurouvrage());
            stat.setInt(5, ouvr.getNombrepage());
            stat.setInt(6, ouvr.getNombreouvrage());
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

    public void deleteOuvrage(Ouvrage ouvr) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("DELETE FROM OUVRAGE where codecategorie=?");
            stat.setString(1, ouvr.getCodeouvrage());
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

    public List<Ouvrage> findAllOuvrage() throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Ouvrage> listCat = new ArrayList<Ouvrage>();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM OUVRAGE";
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                Ouvrage temp = new Ouvrage();
                temp.setCodeouvrage(rs.getString(2));
                temp.setTitreouvrage(rs.getString(3));
                temp.setAuteurouvrage(rs.getString(4));
                temp.setEditeurouvrage(rs.getString(5));
                temp.setNombrepage(rs.getInt(6));
                temp.setNombreouvrage(rs.getInt(7));
                listCat.add(temp);
            }
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
        return listCat;
    }

    public Ouvrage finbyIdOuvrage(int id) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        Ouvrage ouvr = new Ouvrage();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM OUVRAGE where idouvrage="+id;
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                ouvr.setIdouvrage(rs.getInt(1));
                ouvr.setIdcategorie(rs.getInt(2));
                ouvr.setCodeouvrage(rs.getString(3));
                ouvr.setTitreouvrage(rs.getString(4));
                ouvr.setAuteurouvrage(rs.getString(5));
                ouvr.setEditeurouvrage(rs.getString(6));
                ouvr.setNombrepage(rs.getInt(7));
                ouvr.setNombreouvrage(rs.getInt(8));
            }
            return ouvr;
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
