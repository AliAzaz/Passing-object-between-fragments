package com.example.openm.fragmentspractice.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.openm.fragmentspractice.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

    public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnFirst)
    void onBtnFirstClick() {
        //TODO implement

        startActivity(new Intent(getApplicationContext(),Main2Activity.class).putExtra("pos",1));
    }

    @OnClick(R.id.btnSecond)
    void onBtnSecondClick() {
        //TODO implement

        startActivity(new Intent(getApplicationContext(),Main2Activity.class).putExtra("pos",2));
    }
}
