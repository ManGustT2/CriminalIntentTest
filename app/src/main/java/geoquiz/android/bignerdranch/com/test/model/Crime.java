package geoquiz.android.bignerdranch.com.test.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime implements Serializable{
    private UUID mId;

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    private Date mDate;

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private boolean mSolved;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    public String getDate(){
        return convert();
    }
    public String convert(){

        SimpleDateFormat formatter = new SimpleDateFormat("EEEE.MMM.yyyy,hh:mm:ss");
        return formatter.format(mDate);
    }
    public UUID getmId() {
        return mId;
    }

}
