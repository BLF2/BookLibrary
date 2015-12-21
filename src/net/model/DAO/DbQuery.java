package net.model.DAO;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;
import net.model.bookInfo.BookInfo;
import net.model.bookUser.BookUser;
import net.model.staticFile.interfaceFile.IBookInfo;
import net.model.staticFile.interfaceFile.IBookUser;
import net.model.staticFile.interfaceFile.IUser;
import net.model.userInfo.UserInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by blf2 on 2015-12-19.
 */
public class DbQuery {
    public IUser queryUserInfoById(Integer userId){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from UserInfo userInfo where userInfo.userId=" + userId);
        if(query.list().size() == 0){
            return null;
        }
        UserInfo userInfo = (UserInfo)query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return userInfo;
    }
    public IUser queryUserInfoByCardNum(String userCardNum){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from UserInfo userInfo where  userInfo.userCardNum='"+userCardNum+"'");
        if(query.list().size() == 0){
            return null;
        }
        UserInfo userInfo = (UserInfo)query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return userInfo;
    }
    public IUser queryUserInfoByStuNum(String userStuNum){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from UserInfo userInfo where  userInfo.userStuNum='"+userStuNum+"'");
        if(query.list().size() == 0){
            return null;
        }
        UserInfo userInfo = (UserInfo)query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return userInfo;
    }
    public List<IBookUser> queryUserBorrowBooksAll(Integer userId){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BookUser bookUser where bookUser.userId="+userId);
        if(query.list().size() == 0)
            return null;
        List<IBookUser>list = new LinkedList<IBookUser>();
        list = query.list();
        return list;
    }
    public IBookInfo queryBookInfoById(Integer bookId){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BookInfo bookInfo where  bookInfo.bookId="+bookId);
        if(query.list().size() == 0){
            return null;
        }
        BookInfo bookInfo = (BookInfo)query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return bookInfo;
    }
    /*Hibernate的模糊匹配
    public List<IBookInfo> queryBookInfoByName(String bookName){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BookInfo bookInfo where  bookInfo.bookId="+bookId);
        if(query.list().size() == 0){
            return null;
        }

        transaction.commit();
        HibernateSessionFactory.closeSession();
        return bookInfo;
    }
    */
    public IBookInfo queryBookInfoByNum(String bookNum){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BookInfo bookInfo where bookInfo.bookNum='"+bookNum+"'");
        if(query.list().size() == 0){
            return null;
        }
        BookInfo bookInfo = (BookInfo)query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return bookInfo;
    }
    public IBookUser queryBookUserById(Integer bookUserId){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BookUser bookUser where bookUser.bookUserId="+bookUserId);
        if(query.list().size() == 0){
            return null;
        }
        BookUser bookUser = (BookUser)query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return bookUser;
    }
    public IBookUser queryBookUserByUserIdAndBookId(Integer userId,Integer bookId){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BookUser bookUser where bookUser.bookId="+bookId+" and userId="+userId);
        if(query.list().size() == 0){
            return null;
        }
        BookUser bookUser = (BookUser)query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return bookUser;
    }
}
