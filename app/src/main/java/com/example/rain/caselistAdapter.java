package com.example.rain;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class caselistAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final String[] description1;


    public caselistAdapter(@NonNull  Activity context1, String[] mainTitle, String[] description, String[] description1) {
        super(context1, R.layout.caselist,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.description1 = description1;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.caselist,null,true);

        TextView titleText = rowView.findViewById(R.id.tit);
        TextView titletext1 = rowView.findViewById(R.id.tit1);
        TextView titletext2 = rowView.findViewById(R.id.tit2);


        titleText.setText(mainTitle[position]);
        titletext1.setText(description[position]);
        titletext2.setText(description1[position]);

        return rowView;
    }
}
