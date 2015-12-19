package net.model.staticFile.interfaceFile;

import java.util.Date;

/**
 * Created by blf2 on 15-12-19.
 */
public interface IBookUser {
    Integer getBookUserId();
    Integer getBookId();
    Integer getUserId();
    Date getBorrowDate();
    Date getShoudReturnDate();
    Date getActualReturnDate();
    Boolean getOverOrNot();
    Boolean getReturnOrNot();
}
