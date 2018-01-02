package com.example.openm.fragmentspractice.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.openm.fragmentspractice.R;
import com.example.openm.fragmentspractice.ui.core.Bioinfo;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Fragment1 extends Fragment {

    @BindView(R.id.fragmentContainer1)
    LinearLayout fragmentContainer1;
    @BindView(R.id.txtName)
    EditText txtName;
    @BindView(R.id.txtEmail)
    EditText txtEmail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment1, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @OnClick(R.id.btn_submit)
    void onBtnSubmitClick() {
        //TODO implement

        Bundle bundle = new Bundle();
        bundle.putSerializable("data", new Bioinfo(txtName.getText().toString(),txtEmail.getText().toString()));

        Fragment f = new Fragment1a();
        f.setArguments(bundle);
        getFragmentManager().beginTransaction().replace(R.id.fragmentLayout,f)
                .addToBackStack("2")
                .commit();

    }
}
