package com.example.openm.fragmentspractice.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.openm.fragmentspractice.R;
import com.example.openm.fragmentspractice.ui.core.Bioinfo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Fragment1a extends Fragment {

    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.email)
    TextView email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment1a, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        Bundle b = getArguments();
        Bioinfo bioinfo = (Bioinfo) b.getSerializable("data");

        name.setText(bioinfo.getName());
        email.setText(bioinfo.getEmail());

    }
}

