package com.bignerdranch.android.criminallntent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {//原来是AppCompatActivity

    //public static final String EXTRA_CRIME_ID=
         //   "com.bignerd.android.criminalintent.crime_id";
    private static final String EXTRA_CRIME_ID=
            "com.bignerd.android.criminalintent.crime_id";

    public static Intent newIent(Context packageContext,UUID crimeId){
        Intent intent=new Intent(packageContext,CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID,crimeId);
        return intent;
    }
    @Override
    protected Fragment createFragment(){
       // return new CrimeFragment();
        UUID crimeId=(UUID)getIntent()
                .getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }


}
