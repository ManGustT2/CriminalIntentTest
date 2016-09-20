package geoquiz.android.bignerdranch.com.test.manager;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

import geoquiz.android.bignerdranch.com.test.model.Crime;

/**
 * Created by Администратор on 18.09.2016.
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes;
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        for(int i=0; i<100; i++){
            Crime c = new Crime();
            c.setmTitle("Title " + i);
            c.setmSolved(i % 2 ==0);
            mCrimes.add(c);
        }
    }

    /*
    Метод который используем для определения контекста при загрузке ListFragmenta
    если CrimeLab не загружен задаем ему данные контекста обьекта Crime;
     */
    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    /*
    создаю гетер который возвращает массив с обьектами crime
     */
    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getmId().equals(id))
                return c;
        }
        return null;
    }
}
