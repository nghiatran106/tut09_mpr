package com.example.tut09_mpr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class WebviewFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.fragment_webview, container, false);


        //get passed url

        Bundle data = getArguments();
        String url = data.getString("url");

        //load url & display
        Web
    }
}
