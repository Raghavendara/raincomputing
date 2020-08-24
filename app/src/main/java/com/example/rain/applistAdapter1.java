package com.example.rain;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class applistAdapter1 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final Integer[] imgss;


    public applistAdapter1(@NonNull  Activity context1, String[] mainTitle, String[] description, Integer[] imgss) {
        super(context1, R.layout.appall,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.imgss = imgss;
    }

    public View getView(int position,View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.appall,null,true);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView titletext1 = rowView.findViewById(R.id.title1);


        ImageView imageView = rowView.findViewById(R.id.icon);

        titleText.setText(mainTitle[position]);
        titletext1.setText(description[position]);
        imageView.setImageResource(imgss[position]);

        return rowView;
    }
}
