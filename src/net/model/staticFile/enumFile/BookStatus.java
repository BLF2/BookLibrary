package net.model.staticFile.enumFile;

/**
 * Created by blf2 on 15-12-19.
 */
public enum BookStatus {
    in,out;

    public boolean isIn(){
        if(this == in)
            return true;
        return false;
    }

    public boolean isOut(){
        if(this == out)
            return true;
        return false;
    }
}
