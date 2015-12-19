package net.model.userInfo;

import net.model.staticFile.enumFile.UserRule;
import net.model.staticFile.enumFile.UserSex;
import net.model.staticFile.interfaceFile.IUser;

/**
 * Created by blf2 on 15-12-19.
 */
public class UserInfo implements IUser{
    private Integer userId;//用户id
    private String userCardNum;//用户卡号
    private String userName;//用户名
    private UserSex userSex;//性别
    private String userStuNum;//学号
    private UserRule userRule;//角色 管理员和普通用户

    public UserInfo(){}
    public UserInfo(String userCardNum, String userName, UserSex userSex, String userStuNum, UserRule userRule) {
        this.userCardNum = userCardNum;
        this.userName = userName;
        this.userSex = userSex;
        this.userStuNum = userStuNum;
        this.userRule = userRule;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCardNum() {
        return userCardNum;
    }

    public void setUserCardNum(String userCardNum) {
        this.userCardNum = userCardNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserSex getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSex userSex) {
        this.userSex = userSex;
    }

    public String getUserStuNum() {
        return userStuNum;
    }

    public void setUserStuNum(String userStuNum) {
        this.userStuNum = userStuNum;
    }

    public UserRule getUserRule() {
        return userRule;
    }

    public void setUserRule(UserRule userRule) {
        this.userRule = userRule;
    }

    public boolean isAdmin(){
        return this.userRule.isAdmin();
    }
    public boolean isUser(){
        return this.userRule.isUser();
    }

    public boolean isMen(){
        return this.userSex.isMen();
    }
    public boolean isWomen(){
        return this.userSex.isWomen();
    }

    public UserInfo saveUserInfo(){
        //数据库持久化
        return null;
    }
}
