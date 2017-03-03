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
import s6.bibliotheque.modele.RetourPret;

/**
 *
 * @author itu
 */
public class RetourPretDao {

    public void saveRetourPret(RetourPret retPret) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("insert into RETOURPRET(IDPRET,DATERETOUR) values(?,?)");
            stat.setInt(1, retPret.getIdpret());
            stat.setDate(2, (java.sql.Date) retPret.getDateretour());
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

    public void deleteRetourPret(RetourPret retPret) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("DELETE FROM RETOURPRET where idretour=?");
            stat.setInt(1, retPret.getIdretour());
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

    public List<RetourPret> findAllRetourPret() throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<RetourPret> retPret = new ArrayList<RetourPret>();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM RETOURPRET";
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                RetourPret temp = new RetourPret();
                temp.setIdretour(rs.getInt(1));
                temp.setIdpret(rs.getInt(2));
                temp.setDateretour(rs.getDate(3));
                retPret.add(temp);
            }
            return retPret;
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

    public RetourPret finbyIdRetourPret(int id) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        RetourPret retPret = new RetourPret();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM RETOURPRET where idretour=" + id;
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                retPret.setIdretour(rs.getInt(1));
                retPret.setIdpret(rs.getInt(2));
                retPret.setDateretour(rs.getDate(3));
            }
            return retPret;
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
