/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Site;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Test {

   public static void save(Site s) {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/demo";
        java.sql.Connection cn = null;
        java.sql.Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);
            st = cn.createStatement();
            String req = "insert into site values(null,'" + s.getNom() + "')";
            st.executeUpdate(req);
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        } catch (ClassNotFoundException ex) {
            System.out.println("Impossible de charger le driver");
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }
    }
   
   public static void load() {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/demo";
        java.sql.Connection cn = null;
        java.sql.Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);
            st = cn.createStatement();
            String req = "select * from site";
            rs = st.executeQuery(req);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Impossible de charger le driver");
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }
    }
 
    public static void main(String[] args) {
        
        save(new Site("MARRAKECH"));
        save(new Site ("EL JADIDA"));
        save(new Site ("SAFI"));
        
        // récupération des données
         load();
    }
    
}
