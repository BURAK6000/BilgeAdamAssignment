/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.burak.cardealer.utility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DbConnection {

    private Connection connection;
    
    private static DbConnection instance;
    
    

    public  Connection getConnection() {
        
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
    
    
    
    

    public static DbConnection getInstance() throws ClassNotFoundException, SQLException {
        if (instance==null) {
            
            instance =new DbConnection();
            
        }else try {
            if(instance.getConnection().isClosed()){
                
                 instance=new DbConnection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return  instance;
    }

    public static void setInstance(DbConnection instance) {
        DbConnection.instance = instance;
    }
    
    
    private  DbConnection() throws SQLException, ClassNotFoundException{
        createConnection();
        
        
    }
    public  Connection createConnection() throws SQLException, ClassNotFoundException {
        
        Driver.class.forName("org.postgresql.Driver");
	connection = DriverManager.getConnection(Constant.DBURL, Constant.USERNAME, Constant.PASSWORD);
        return connection;
	}
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        DbConnection dbConnection = new DbConnection();
        dbConnection.createConnection();
        
        
        
        
    }
    
    
}
