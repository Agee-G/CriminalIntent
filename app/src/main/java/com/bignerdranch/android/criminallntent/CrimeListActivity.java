package com.bignerdranch.android.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by g__agee on 2017/5/21.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
