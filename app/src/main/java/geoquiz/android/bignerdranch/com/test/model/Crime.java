package geoquiz.android.bignerdranch.com.test.model;

import java.util.UUID;

/**
 * Created by Администратор on 18.09.2016.
 */
public class Crime {
    private UUID mId;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }
}
