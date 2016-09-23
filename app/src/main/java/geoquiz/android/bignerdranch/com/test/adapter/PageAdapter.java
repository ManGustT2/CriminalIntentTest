package geoquiz.android.bignerdranch.com.test.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import geoquiz.android.bignerdranch.com.test.model.Crime;
import geoquiz.android.bignerdranch.com.test.pager.ViewPagerFragment;

/**
 * Created by Администратор on 23.09.2016.
 */
public class PageAdapter extends FragmentPagerAdapter {

    static final int PAGE_COUNT = 10;

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ViewPagerFragment.newInstance(position);
    }

    @Override
    public int getCount () {
        return PAGE_COUNT;
    }
}
