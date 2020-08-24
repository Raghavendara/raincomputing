package com.example.rain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class appupdatesFragment extends Fragment {


    public appupdatesFragment() {
        // Required empty public constructor
    }

    ListView listView;

    String[] title={
            "App Name",
            "App Name",
            "App Name",
            "App Name",
    };


    String[] description ={
            "Information",
            "Information",
            "Information",
            "Information",
    };

    Integer[] img = {
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay
    };

    Integer[] down = {
            R.drawable.arrow,
            R.drawable.arrow,
            R.drawable.arrow,
            R.drawable.arrow
    };

    Integer[] button = {
            R.drawable.button,
            R.drawable.button,
            R.drawable.button,
            R.drawable.button
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_appupdates, container, false);
        // Inflate the layout for this fragment

        appupdateAdapter adapter = new appupdateAdapter(getActivity(),title,description,img,down,button);

        listView = view.findViewById(R.id.updateapplist);
        listView.setAdapter(adapter);




        return view;
    }
}