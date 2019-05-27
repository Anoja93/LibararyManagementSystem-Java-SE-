/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect {
    
    Connection conn;
    
public static Connection ConnectDb(){

     try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\Java\\SE Projects\\LibraryManagementSystem\\LibraryNew.db");
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}  
    
}
