/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



/**
 *
 * @author mannu
 */
public class ConnectionPool {
    private static ConnectionPool pool=null;
    private static DataSource dataSource=null;
    
    private ConnectionPool(){
        try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) (javax.sql.DataSource) ic.lookup("java:/comp/env/jdbc/letsride");
        } catch (NamingException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ConnectionPool getInstance(){
        if(pool==null){
            pool = new ConnectionPool();
        }
        return pool;
    }
    
    public Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void freeConnection(Connection c){
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
