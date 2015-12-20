package net.model.bookInfo;

import net.model.staticFile.enumFile.BookStatus;
import net.model.staticFile.interfaceFile.IBookInfo;

import java.util.Date;

/**
 * Created by blf2 on 15-12-19.
 */
public class BookInfoFactory {
    private String bookNum;
    private String bookName;
    private Double bookPrice;
    private Date bookAddDate;
    private String bookShelfNum;
    private BookStatus bookStatus;

    public BookInfoFactory(){}
    public BookInfoFactory(String bookNum, String bookName, Double bookPrice, Date bookAddDate, String bookShelfNum, BookStatus bookStatus) {

    }

    public  void setBookNum(String bookNum){
        if(bookNum.length() < 16){
            boolean flag = true;
            for(int i = 0;i < bookNum.length();i++){
                if(!Character.isDigit(bookNum.charAt(i))){
                    flag = false;
                    break;
                }
            }
            if(flag)
                this.bookNum = bookNum;
            else
                this.bookNum = null;
        }else{
            this.bookNum = bookNum;
        }
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setBookPrice(Double bookPrice){
        this.bookPrice = bookPrice;
    }
    public void setBookAddDate(Date bookAddDate){
        this.bookAddDate = bookAddDate;
    }
    public void setBookShelfNum(String bookShelfNum){
        this.bookShelfNum = bookShelfNum;
    }
    public void setBookStatus(BookStatus bookStatus){
        this.bookStatus = bookStatus;
    }

    public String getBookNum() {
        return bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public Date getBookAddDate() {
        return bookAddDate;
    }

    public String getBookShelfNum() {
        return bookShelfNum;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public IBookInfo getBookInfo(){//给出图书信息，封装出图书接口
        if(this.bookNum == null)
            return null;
        //数据库持久化
        return new BookInfo(this.bookNum,this.bookName,this.bookPrice,this.bookAddDate,this.bookShelfNum,this.bookStatus).saveBookInfo();
    }

}
