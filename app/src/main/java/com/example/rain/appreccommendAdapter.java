package com.example.rain;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class appreccommendAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final Integer[] img;
    private final Integer[] down;
    private final Integer[] button;


    public appreccommendAdapter(@NonNull  Activity context1, String[] mainTitle, String[] description, Integer[] img, Integer[] down, Integer[] button) {
        super(context1, R.layout.recommandlayout,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.img = img;
        this.down = down;
        this.button = button;

    }

    public View getView(int position,View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.recommandlayout,null,true);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView titletext1 = rowView.findViewById(R.id.title1);
        ImageView imageView = rowView.findViewById(R.id.icon);
        ImageView imageView1 = rowView.findViewById(R.id.down);
        ImageView imageView2 = rowView.findViewById(R.id.button2);

        titleText.setText(mainTitle[position]);
        titletext1.setText(description[position]);
        imageView.setImageResource(img[position]);
        imageView1.setImageResource(down[position]);
        imageView2.setImageResource(button[position]);

        return rowView;
    }
}
