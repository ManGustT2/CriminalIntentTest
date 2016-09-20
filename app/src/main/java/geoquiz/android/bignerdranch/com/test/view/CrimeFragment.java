package geoquiz.android.bignerdranch.com.test.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import geoquiz.android.bignerdranch.com.test.CrimeActivity;
import geoquiz.android.bignerdranch.com.test.R;
import geoquiz.android.bignerdranch.com.test.model.Crime;


public class CrimeFragment extends Fragment {
    private CrimeActivity activity;
    private Crime mCrime;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    private EditText mTitleField;
    public static final String CRIME_KEY = "crimeKey";


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (CrimeActivity)context;
        mCrime = (Crime)getArguments().getSerializable(CRIME_KEY);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container, false);

        mDateButton = (Button) v.findViewById(R.id.crime_date);
        mDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getActivity()
//                        .getSupportFragmentManager();
//                DatePickerFragment dialog = DatePickerFragment
//                        .newInstance(mCrime.getmDate());
//                dialog.setTargetFragment(CrimeFragment.this, REQUEST_DATE);
//                dialog.show(fm, DIALOG_DATE);

            }
        });


//         mDateButton.setText(mCrime.getData());
        updateDate();

        mTitleField = (EditText) v.findViewById(R.id.crime_title);

        if (mCrime != null && mCrime.getmTitle() != null)
        mTitleField.setText(mCrime.getmTitle());
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Пусто
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Записываем в mCrime то что вводится с клавиатуры.
                mCrime.setmTitle(s.toString()); // s+"";
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Пусто
            }
        });
        mSolvedCheckBox = (CheckBox) v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setChecked(mCrime.ismSolved());
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setmSolved(isChecked);
            }
        });
        return v;
    }
    /*
    метод сетит время для mDateButton
     */

    private void updateDate(){
        mDateButton.setText(mCrime.getmDate().toString());
    }
}
