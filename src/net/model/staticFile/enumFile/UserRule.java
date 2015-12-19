package net.model.staticFile.enumFile;

/**
 * Created by blf2 on 15-12-19.
 */
public enum UserRule {
    admin,user;

    public boolean isAdmin(){
        if(this == admin)
            return true;
        return false;
    }

    public boolean isUser(){
        if(this == user)
            return true;
        return false;
    }
}
