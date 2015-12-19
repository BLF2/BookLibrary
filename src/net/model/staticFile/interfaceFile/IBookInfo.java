package net.model.staticFile.interfaceFile;

import net.model.staticFile.enumFile.BookStatus;

import java.util.Date;

/**
 * Created by blf2 on 15-12-19.
 */
public interface IBookInfo {
    Integer getBookId();
    String getBookNum();
    String getBookName();
    Double getBookPrice();
    Date getBookAddDate();
    String getBookShelfNum();
    BookStatus getBookStatus();
    boolean isIn();
    boolean isOut();
}
