/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mephilog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vlad
 */
public class MephiDB {

    String dbip, login, password;
    Connection conn;

    public MephiDB(String dbip, String login, String password) {
        this.dbip = dbip;
        this.login = login;
        this.password = password;
        conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + this.dbip + "/mephi?"
                    + "user=" + this.login + "&password=" + this.password);
            this.conn = conn;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public ResultSet query(String query) {
        ResultSet res = null;
        Statement stmt;
        try {
            stmt = conn.createStatement();
            res = stmt.executeQuery(query);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
