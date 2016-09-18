package geoquiz.android.bignerdranch.com.test.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import geoquiz.android.bignerdranch.com.test.CrimeActivity;
import geoquiz.android.bignerdranch.com.test.R;
import geoquiz.android.bignerdranch.com.test.adapter.CrimeListAdapter;
import geoquiz.android.bignerdranch.com.test.model.Crime;

/**
 * Created by Администратор on 18.09.2016.
 */
public class CrimeListFragment extends Fragment {
    private CrimeActivity activity;
    private ArrayList<Crime> crimeList;
    private ListView listView;
    public CrimeListAdapter adapter;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (CrimeActivity)context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        crimeList = new ArrayList<>();

        for(int i=0; i<100; i++){
            Crime c = new Crime();
            c.setmTitle("Title " + i);
            crimeList.add(c);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list_crime, container, false);
        findUI(v);
        return  v;
    }

    private void findUI(View v){
        listView = (ListView)v.findViewById(R.id.crimeList);

        adapter = new CrimeListAdapter(getActivity(), crimeList);
        listView.setAdapter(adapter);
    }

}
