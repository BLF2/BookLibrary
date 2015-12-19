package net.model.staticFile.enumFile;

/**
 * Created by blf2 on 15-12-19.
 */
public enum UserSex {
    men,women;

    public boolean isMen(){
        if(this == men)
            return true;
        return false;
    }

    public  boolean isWomen(){
        if(this == women)
            return true;
        return false;
    }
}
