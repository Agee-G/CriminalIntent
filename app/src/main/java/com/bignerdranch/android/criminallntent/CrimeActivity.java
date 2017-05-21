package com.bignerdranch.android.criminallntent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {//原来是AppCompatActivity
    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }


}
