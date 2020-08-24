package com.example.rain;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;


public class chatlistAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final String[] description1;
    private final Integer[] imgss;


    public chatlistAdapter(@NonNull Activity context1, String[] mainTitle, String[] description, String[] description1, Integer[] imgss) {
        super(context1, R.layout.recent,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.description1 = description1;
        this.imgss = imgss;
    }



    public View getView(int position,View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.recent,null,false);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView titletext1 = rowView.findViewById(R.id.title1);
        TextView titletext2 = rowView.findViewById(R.id.title2);

        ImageView imageView = rowView.findViewById(R.id.icon);

        titleText.setText(mainTitle[position]);
        titletext1.setText(description[position]);
        titletext2.setText(description1[position]);
        imageView.setImageResource(imgss[position]);

        return rowView;
    }
}
