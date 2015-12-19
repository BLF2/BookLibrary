package net.model.bookUser;

import net.model.staticFile.interfaceFile.IBookUser;

import java.util.Date;

/**
 * Created by blf2 on 15-12-19.
 */
public class BookUser implements IBookUser{
    private Integer bookUserId;//没有实际意义，完全是为了Hibernate的主键要求
    private Integer bookId;//图书Id
    private Integer userId;//用户Id
    private Date borrowDate;//借阅时间
    private Date shoudReturnDate;//应该归还时间
    private Date actualReturnDate;//实际归还时间
    private Boolean overOrNot;//是否超期
    private Boolean returnOrNot;//是否归还

    public BookUser(){}
    public BookUser(Integer bookUserId, Integer bookId, Integer userId, Date borrowDate, Date shoudReturnDate,
                    Date actualReturnDate, Boolean overOrNot, Boolean returnOrNot) {
        this.bookUserId = bookUserId;
        this.bookId = bookId;
        this.userId = userId;
        this.borrowDate = borrowDate;
        this.shoudReturnDate = shoudReturnDate;
        this.actualReturnDate = actualReturnDate;
        this.overOrNot = overOrNot;
        this.returnOrNot = returnOrNot;
    }

    public Integer getBookUserId() {
        return bookUserId;
    }

    public void setBookUserId(Integer bookUserId) {
        this.bookUserId = bookUserId;
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

    public BookUser saveBookUser(){
        //数据库持久化
        return null;
    }
}
