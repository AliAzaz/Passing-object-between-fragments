package com.example.openm.fragmentspractice.ui.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.openm.fragmentspractice.ui.fragments.Fragment1;
import com.example.openm.fragmentspractice.ui.fragments.Fragment2;
import com.example.openm.fragmentspractice.R;

import butterknife.ButterKnife;

public class Main2Activity extends FragmentActivity {

    Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        int fragmentPos = getIntent().getIntExtra("pos", 0);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        fragment = fragmentPos == 1 ? new Fragment1() : new Fragment2();
        transaction.addToBackStack(fragmentPos == 1 ? "1" : null);
        transaction.replace(R.id.fragmentLayout, fragment);
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }
    }
}
