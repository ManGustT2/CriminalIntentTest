package geoquiz.android.bignerdranch.com.test.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import geoquiz.android.bignerdranch.com.test.R;
import geoquiz.android.bignerdranch.com.test.model.Crime;

/**
 * Created by Администратор on 18.09.2016.
 */
public class CrimeListAdapter extends BaseAdapter {
    private ArrayList<Crime> crimeList;
    private Context context;

    public CrimeListAdapter(Context context, ArrayList<Crime> crimeList){
        this.context = context;
        this.crimeList = crimeList;
    }

    @Override
    public int getCount() {
        return crimeList.size();
    }

    @Override
    public Object getItem(int position) {
        return crimeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_crime, parent, false);
        CheckBox mCheckBox = (CheckBox)v.findViewById(R.id.crime_list_item_solvedCheckBox);
        TextView mDate = (TextView)v.findViewById(R.id.crime_list_item_dateTextView);
        TextView mTitle = (TextView)v.findViewById(R.id.crime_list_item_titleTextView);

        Crime c = crimeList.get(position);
      //  mCheckBox.setChecked(c.);
        mTitle.setText(c.getmTitle());
        return v;
    }
}
