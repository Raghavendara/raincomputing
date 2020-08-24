package com.example.rain;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


public class appchatFragment extends Fragment {



    public appchatFragment() {
        // Required empty public constructor
    }
    ListView listView;

    String[] title={
            "App Name",
            "App Name",
            "App Name",
            "App Name",



    };

    String[] description={
            "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",


    };

    Integer[] imgs = {
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,

    };
    ListView listView1;

    String[] tit={
            "App Name",
            "App Name",
            "App Name",
            "App Name",
            "App Name",
            "App Name",
            "App Name",
            "App Name",


    };

    String[] des={
            "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",

    };


    Integer[] img = {
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_appchat, container, false);

        applistAdapter adapter = new applistAdapter(getActivity(),title,description,imgs);

        listView = view.findViewById(R.id.apprecent);
        listView.setAdapter(adapter);

        listView1 = view.findViewById(R.id.appall);
        listView1.setAdapter(adapter);

        return view;
    }
}