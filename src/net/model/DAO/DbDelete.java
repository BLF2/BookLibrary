package net.model.DAO;

import net.model.bookInfo.BookInfo;
import net.model.bookUser.BookUser;
import net.model.staticFile.interfaceFile.IBookUser;
import net.model.userInfo.UserInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by blf2 on 2015-12-19.
 */
public class DbDelete {
    public boolean deleteUserInfoById(Integer userId){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query  query= session.createQuery("from UserInfo userInfo whereh userId=" + userId);
        if(query.list().size() == 0)
            return false;
        UserInfo userInfo = (UserInfo)query.list().get(0);
        query = session.createQuery("from BookUser bookUser where bookUser.userId=" + userId);//删除这个人的借书记录
        List<BookUser> list = null;
        if(query.list().size() != 0) {
            list = query.list();
            Iterator<BookUser>iter = list.iterator();
            BookUser bookUser = null;
            while(iter.hasNext()){
                bookUser = iter.next();
                session.delete(bookUser);
            }
        }
        session.delete(userInfo);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return true;
    }
    public boolean deleteBookInfoById(Integer bookId){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BookInfo bookInfo where bookInfo.bookId="+bookId);
        if(query.list().size() == 0)
            return false;
        BookInfo bookInfo = (BookInfo)query.list().get(0);
        session.delete(bookInfo);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return true;
    }
}
