package net.model.DAO;

import net.model.bookInfo.BookInfo;
import net.model.bookUser.BookUser;
import net.model.userInfo.UserInfo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by blf2 on 2015-12-19.
 */
public class DbUpdate {
    public boolean updateUserInfo(UserInfo userInfo){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        session.update(userInfo);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return true;
    }
    public boolean updateBookUser(BookUser bookUser){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        session.update(bookUser);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return true;
    }
    public boolean updateBookInfo(BookInfo bookInfo){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        session.update(bookInfo);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return true;
    }
}
