package net.model.DAO;

import net.model.bookInfo.BookInfo;
import net.model.bookUser.BookUser;
import net.model.userInfo.UserInfo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by blf2 on 2015-12-19.
 */
public class DbInsert {
    public UserInfo insertUserInfo(UserInfo userInfo){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        session.save(userInfo);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return userInfo;
    }
    public BookUser insetrBookUser(BookUser bookUser){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        session.save(bookUser);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return bookUser;
    }
    public BookInfo insertBookInfo(BookInfo bookInfo){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        session.save(bookInfo);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return bookInfo;
    }
}
