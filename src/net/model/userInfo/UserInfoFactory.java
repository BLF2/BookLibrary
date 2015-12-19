package net.model.userInfo;

import net.model.staticFile.enumFile.UserRule;
import net.model.staticFile.enumFile.UserSex;
import net.model.staticFile.interfaceFile.IUser;

/**
 * Created by blf2 on 15-12-19.
 * 本类给定需要添加或更新的数据，得到一个UserInfo类的接口，当然，如果数据不合法，只能得到空
 * 数据检查: userCardNum：小于16位，全部为数字
 *          userName：小于15个汉字
 *          userStuNum：小于16位，全部为数字
 */
public class UserInfoFactory {
    private String userCardNum;//用户卡号
    private String userName;//用户名
    private UserSex userSex;//性别
    private String userStuNum;//学号
    private UserRule userRule;//角色 管理员和普通用户

    public UserInfoFactory(){}
    public UserInfoFactory(String userCardNum, String userName, UserSex userSex, String userStuNum, UserRule userRule) {
        this.setUserCardNum(userCardNum);
        this.setUserName(userName);
        this.setUserSex(userSex);
        this.setUserStuNum(userStuNum);
        this.setUserRule(userRule);
    }

    private boolean checkUserNum(String userNum){
        for(int i = 0;i < userNum.length();i++){
            if(!Character.isDigit(userNum.charAt(i)))
                return false;
        }
        return true;
    }

    private void setUserCardNum(String userCardNum){
        if(userCardNum.length() <= 16 && checkUserNum(userCardNum))
            this.userCardNum = userCardNum;
        else
            this.userCardNum = null;
    }

    private void setUserName(String userName){
        if(userName.length() <= 30)
            this.userName = userName;
        else
            this.userName = null;
    }

    private void setUserSex(UserSex userSex){
        this.userSex = userSex;
    }

    private  void setUserStuNum(String userStuNum){
        if(userStuNum.length() < 16 && checkUserNum(userStuNum))
            this.userStuNum = userStuNum;
        else
            this.userStuNum = null;
    }

    private void setUserRule(UserRule userRule){
        this.userRule = userRule;
    }

    public String getUserCardNum() {
        return userCardNum;
    }

    public String getUserName() {
        return userName;
    }

    public UserSex getUserSex() {
        return userSex;
    }

    public String getUserStuNum() {
        return userStuNum;
    }

    public UserRule getUserRule() {
        return userRule;
    }

    public IUser getUserInfo(){
        if(this.userCardNum == null || this.userName == null || this.userStuNum == null)
            return null;
        return new UserInfo(this.userCardNum,this.userName,this.userSex,this.userStuNum,this.userRule);
    }

    public boolean updateUserInfo(){
        if(this.userCardNum == null || this.userName == null || this.userStuNum == null)
            return false;
        //数据库持久化
        return true;
    }
}
