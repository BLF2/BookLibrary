package net.model.bookUser;

import net.model.staticFile.interfaceFile.IBookUser;

import java.util.Date;

/**
 * Created by blf2 on 15-12-19.
 * 图书借阅的工厂模式，本类没有需要过滤的不合法数据，但不代表将来没有，于是留下接口，方便维护
 */
public class BookUserFactory {
    private Integer bookId;
    private Integer userId;
    private Date borrowDate;
    private Date shoudReturnDate;
    private Date actualReturnDate;
    private Boolean overOrNot;
    private Boolean returnOrNot;

    public BookUserFactory(){}

    public BookUserFactory(Integer bookId, Integer userId, Date borrowDate, Date shoudReturnDate,
                           Date actualReturnDate, Boolean overOrNot, Boolean returnOrNot) {
        this.bookId = bookId;
        this.userId = userId;
        this.borrowDate = borrowDate;
        this.shoudReturnDate = shoudReturnDate;
        this.actualReturnDate = actualReturnDate;
        this.overOrNot = overOrNot;
        this.returnOrNot = returnOrNot;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getShoudReturnDate() {
        return shoudReturnDate;
    }

    public void setShoudReturnDate(Date shoudReturnDate) {
        this.shoudReturnDate = shoudReturnDate;
    }

    public Date getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public Boolean getOverOrNot() {
        return overOrNot;
    }

    public void setOverOrNot(Boolean overOrNot) {
        this.overOrNot = overOrNot;
    }

    public Boolean getReturnOrNot() {
        return returnOrNot;
    }

    public void setReturnOrNot(Boolean returnOrNot) {
        this.returnOrNot = returnOrNot;
    }

    public IBookUser getBookUser(){//给出借书信息，封装出借书接口
        //数据库持久化
        return new BookUser(this.bookId,this.userId,this.borrowDate,this.shoudReturnDate,this.actualReturnDate,this.overOrNot,this.returnOrNot).saveBookUser();
    }
}
