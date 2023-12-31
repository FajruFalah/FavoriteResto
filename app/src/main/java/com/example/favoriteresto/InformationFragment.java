package com.example.favoriteresto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class InformationFragment extends Fragment {

    private TextView tvTitle, tvAbout;

    public InformationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_information, container, false);
        initializeViews(rootView);
        setAppInfoData();
        return rootView;
    }

    private void initializeViews(View rootView) {
        tvTitle = rootView.findViewById(R.id.titleTextView);
        tvAbout = rootView.findViewById(R.id.aboutTextView);
    }

    private void setAppInfoData() {
        tvTitle.setText(R.string.app_name);
        tvAbout.setText(R.string.app_desc);
    }
}

/**
 * 10120054
 * Fajru Falah
 * IF-2
 */

