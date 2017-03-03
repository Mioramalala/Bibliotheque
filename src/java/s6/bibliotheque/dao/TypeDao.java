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
import s6.bibliotheque.modele.Type;

/**
 *
 * @author itu
 */
public class TypeDao {
    public void saveType(Type type) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("insert into TYPE(LIBELLETYPE) values(?)");
            stat.setString(1, type.getLibelletype());
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

    public void deleteType(Type type) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        try {
            conn = Connect.getCon();
            stat = conn.prepareStatement("DELETE FROM TYPE where idtype=?");
            stat.setInt(1, type.getIdtype());
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

    public List<Type> findAllType() throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Type> type = new ArrayList<Type>();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM TYPE";
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                Type temp = new Type();
                temp.setIdtype(rs.getInt(1));
                temp.setLibelletype(rs.getString(2));
                type.add(temp);
            }
            return type;
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

    public Type finbyIdType(int id) throws Exception {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        Type type = new Type();
        try {
            conn = Connect.getCon();
            String selectSQL = "SELECT * FROM TYPE where idtype=" + id;
            stat = conn.prepareStatement(selectSQL);
            rs = stat.executeQuery();
            while (rs.next()) {
                type.setIdtype(rs.getInt(1));
                type.setLibelletype(rs.getString(2));
            }
            return type;
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
