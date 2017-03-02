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

/**
 *
 * @author itu
 */
public class CategorieDao {

    public void saveCategorie(Categorie cat) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("insert into CATEGORIE(CODECATEGORIE,LIBELLECATEGORIE,DUREEEMPRUTNCAT,PENALITECAT) values(nextval('seqcat')||'cat',?,?,?)");
            stat.setString(1, cat.getLibellecategorie());
            stat.setInt(2, cat.getDureeempruntcat());
            stat.setInt(3, cat.getPenalitecat());
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

    public void DeleteCategorie(Categorie cat) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("DELETE FROM CATEGORIE where iddoc=?");
            stat.setInt(1, cat.getIdcategorie());
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

    public List<Categorie> findAllCategorie() throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Categorie> listCat = new ArrayList<Categorie>();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM CATEGORIE";
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery(selectSQL);
            while (rs.next()) {
                Categorie temp = new Categorie();
                temp.setCodecategorie(rs.getString(2));
                temp.setLibellecategorie(rs.getString(3));
                temp.setDureeempruntcat(rs.getInt(4));
                temp.setPenalitecat(rs.getInt(5));
                listCat.add(temp);
            }
            return listCat;
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

    public Categorie finbyIdCategorie(Categorie cat) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        Categorie categori = new Categorie();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM CATEGORIE where idcategorie=?";
            stat.setInt(1, cat.getIdcategorie());
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery(selectSQL);
            while (rs.next()) {
                categori.setIdcategorie(rs.getInt(1));
                categori.setCodecategorie(rs.getString(2));
                categori.setLibellecategorie(rs.getString(3));
                categori.setDureeempruntcat(rs.getInt(4));
                categori.setPenalitecat(rs.getInt(5));
            }
            return categori;
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
