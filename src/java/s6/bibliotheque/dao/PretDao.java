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
import s6.bibliotheque.modele.Pret;
import s6.bibliotheque.modele.Type;

/**
 *
 * @author itu
 */
public class PretDao {

    public void savePret(Pret pret) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("insert into PRET(IDMEMBRE,IDOUVRAGE,CODEPRET,DATEEMPRUNT) values(?,?,nextval('seqpret')||pret,?)");
            stat.setInt(1, pret.getIdmembre());
            stat.setInt(2, pret.getIdouvrage());
            stat.setDate(3, (java.sql.Date) (pret.getDateemprunt()));
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

    public void deletePret(Pret pret) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("DELETE FROM PRET where idpret=?");
            stat.setInt(1, pret.getIdpret());
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

    public List<Pret> findAllPret() throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Pret> pret = new ArrayList<Pret>();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM PRET";
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                Pret temp = new Pret();
                temp.setIdpret(rs.getInt(1));
                temp.setIdmembre(rs.getInt(2));
                temp.setIdouvrage(rs.getInt(3));
                temp.setCodepret(rs.getString(4));
                temp.setDateemprunt(rs.getDate(5));
                pret.add(temp);
            }
            return pret;
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

    public Pret finbyIdPret(int id) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        Pret pret = new Pret();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM PRET where idpret=" + id;
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                pret.setIdpret(rs.getInt(1));
                pret.setIdmembre(rs.getInt(2));
                pret.setIdouvrage(rs.getInt(3));
                pret.setCodepret(rs.getString(4));
                pret.setDateemprunt(rs.getDate(5));
            }
            return pret;
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
