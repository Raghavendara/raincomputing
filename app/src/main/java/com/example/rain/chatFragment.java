package com.example.rain;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class chatFragment extends Fragment implements View.OnClickListener {

    public chatFragment() {

        // Required empty public constructor
    }

    ListView listView;
    ListView listView1;

    String[] title = {
            "FirstName LastName",
            "FirstName LastName",
            "FirstName LastName",
            "FirstName LastName",


    };

    String[] description = {
            "Company name",
            "Company name",
            "Company name",
            "Company name",

    };
    String[] description1 = {
            "Group",
            "Group",
            "Group",
            "Group",


    };

    Integer[] imgs = {
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
            R.drawable.avatar,
    };
    FloatingActionButton floatingActionButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_chat, container, false);



        chatlistAdapter adapter = new chatlistAdapter(getActivity(), title, description, description1, imgs);
        listView = view.findViewById(R.id.recent);
        listView.setAdapter(adapter);


        listView1 = view.findViewById(R.id.all);
        listView1.setAdapter(adapter);
        floatingActionButton.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addcontactbutton:
            Intent intent = new Intent(getActivity(),Addcontact.class);
            startActivity(intent);
        }
    }
}