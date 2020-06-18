/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;



/**
 *
 * @author huulo
 */
public class borrow {
    int userId;
    int bookId;
    Date DateBorrow;
    Date DateReturn;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getDateBorrow() {
        return DateBorrow;
    }

    public void setDateBorrow(Date DateBorrow) {
        this.DateBorrow = DateBorrow;
    }

    public Date getDateReturn() {
        return DateReturn;
    }

    public void setDateReturn(Date DateReturn) {
        this.DateReturn = DateReturn;
    }
    
    
}
