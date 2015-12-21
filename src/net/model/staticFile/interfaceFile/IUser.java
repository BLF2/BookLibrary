package net.model.staticFile.interfaceFile;

import net.model.staticFile.enumFile.UserRule;
import net.model.staticFile.enumFile.UserSex;

/**
 * Created by blf2 on 15-12-19.
 */
public interface IUser {
    Integer getUserId();
    String getUserCardNum();
    String getUserName();
    String getUserPswd();
    UserSex getUserSex();
    String getUserStuNum();
    UserRule getUserRule();
    boolean isAdmin();
    boolean isUser();
    boolean isMen();
    boolean isWomen();
}
