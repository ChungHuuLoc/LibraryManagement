/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.connect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author huulo
 */
public class book_controller {
    public void addBook(model.book book) {
          try {
            Connection con = connect.ConnectSQLServer();
           
            
            if (con != null) {
                System.out.println("Connection is successful.");
            } else {
                System.out.println("Connection is failed. Please try again.");
            }                
            
            //4. Tao va thuc hien cau lenh SQL:
            Statement stm =  con.createStatement();           
            
            String sql = "insert into Book(BookName,Category,BookAuthor,BookPub,BookYearReleash,BookQuantity) values('"+book.getName()+"','"+book.getCategory()+"','"+book.getAuthor()+"','"+book.getPublisher()+"','"+book.getYearPublish()+"','"+book.getQuantity()+"')";
            stm.executeUpdate(sql);
                
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
}
