package com.udacity.gradle.builditbigger;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivityFragment extends Fragment {
    @BindView(R.id.indic_prog) @Nullable() ProgressBar indicator_progressbar;
    public MainActivityFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
        ButterKnife.bind(this, view);
        ButterKnife.setDebug(true);
        return view;
    }
}
