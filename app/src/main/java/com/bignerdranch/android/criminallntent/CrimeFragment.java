package com.bignerdranch.android.criminallntent;

import android.os.Bundle;
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

/**
 * Created by g__agee on 2017/5/21.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        mCrime=new Crime();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){
        View v=inflater.inflate(R.layout.fragment_crime,container,false);

        mTitleField=(EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(
                    CharSequence s,int start,int count,int after){
                //this space intentionally left blank
            }
            @Override
            public void onTextChanged(
                    CharSequence s,int start,int before,int count){
                mCrime.setTitle(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s){
                //This one too
            }
        });
        mDateButton=(Button)v.findViewById(R.id.crime_date);
        mDateButton.setText(mCrime.getDate().toString());
        mDateButton.setEnabled(false);

        mSolvedCheckBox=(CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){
                //set the crime's solved property
                mCrime.setSolved(isChecked);
            }
        });
        return v;
    }

}