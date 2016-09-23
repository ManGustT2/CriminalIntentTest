package geoquiz.android.bignerdranch.com.test.pager;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import geoquiz.android.bignerdranch.com.test.CrimeActivity;
import geoquiz.android.bignerdranch.com.test.R;
import geoquiz.android.bignerdranch.com.test.adapter.PageAdapter;
import geoquiz.android.bignerdranch.com.test.manager.CrimeLab;
import geoquiz.android.bignerdranch.com.test.model.Crime;
import geoquiz.android.bignerdranch.com.test.view.CrimeFragment;

/**
 * Created by Администратор on 22.09.2016.
 */
public class ViewPagerFragment extends Fragment {

    private ViewPager mViewPager;
    private CrimeActivity activity;
    public ArrayList mCrimes;
    private PageAdapter adapter;

    static final String Argument_CRIME_POSITION = "arg_page_number";


    public static ViewPagerFragment newInstance(int position){
        ViewPagerFragment viewPagerFragment = new ViewPagerFragment();
        Bundle arguments = new Bundle();
        arguments.putSerializable(Argument_CRIME_POSITION, position);
        viewPagerFragment.setArguments(arguments);
        return viewPagerFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //activity = (CrimeActivity)context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CrimeLab sCrimeLab = CrimeLab.get(getActivity());
        mCrimes = sCrimeLab.getCrimes();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.pager_fragment, container, false);




        Fragment fragment = new CrimeFragment();
        adapter.getItemPosition(mCrimes);

        return v;
    }
}
