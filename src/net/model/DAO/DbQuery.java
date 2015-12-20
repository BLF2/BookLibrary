package net.model.DAO;

import net.model.staticFile.interfaceFile.IUser;
import net.model.userInfo.UserInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
}
