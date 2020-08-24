package com.example.rain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;


public class casesFragment extends Fragment {



    public casesFragment() {
        // Required empty public constructor
    }

    ListView listView;

    String[] title={
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",
            "1234 -5678",



    };

    String[] description={
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",
            "The name of the case",


    };
    String[] description1={
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",
            "Practice area",

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cases, container, false);
        caselistAdapter adapter = new caselistAdapter(getActivity(),title,description,description1);
        listView = view.findViewById(R.id.caselist);
        listView.setAdapter(adapter);

        return view;
    }
}