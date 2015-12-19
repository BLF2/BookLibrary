package net.model.bookInfo;

import net.model.staticFile.enumFile.BookStatus;
import net.model.staticFile.interfaceFile.IBookInfo;

import java.util.Date;

/**
 * Created by blf2 on 15-12-19.
 */
public class BookInfo implements IBookInfo{
    private Integer bookId;//书的id，由数据库生成，作为书的唯一标识
    private String bookNum;//图书编号
    private String bookName;//图书名称
    private Double bookPrice;//图书价格
    private Date bookAddDate;//入馆时间
    private String bookShelfNum;//书架编号
    private BookStatus bookStatus;//图书状态   在图书馆或不在图书馆

    public BookInfo(){}
    public BookInfo(String bookNum, String bookName, Double bookPrice, Date bookAddDate, String bookShelfNum, BookStatus bookStatus) {
        this.bookNum = bookNum;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAddDate = bookAddDate;
        this.bookShelfNum = bookShelfNum;
        this.bookStatus = bookStatus;
    }
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Date getBookAddDate() {
        return bookAddDate;
    }

    public void setBookAddDate(Date bookAddDate) {
        this.bookAddDate = bookAddDate;
    }

    public String getBookShelfNum() {
        return bookShelfNum;
    }

    public void setBookShelfNum(String bookShelfNum) {
        this.bookShelfNum = bookShelfNum;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public boolean isIn(){
        return this.bookStatus.isIn();
    }
    public boolean isOut(){
        return this.bookStatus.isOut();
    }

    public BookInfo saveBookInfo(){
        //数据库持久化
        return null;
    }
}
