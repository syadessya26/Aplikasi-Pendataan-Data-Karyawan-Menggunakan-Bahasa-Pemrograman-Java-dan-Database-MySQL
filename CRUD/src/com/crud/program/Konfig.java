/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Konfig {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
           String url = "jdbc:mysql://localhost:3306/cruduas" ;
           String user = "root";
           String pass = "";
           
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           MySQLConfig = DriverManager.getConnection(url,user,pass);
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
}
