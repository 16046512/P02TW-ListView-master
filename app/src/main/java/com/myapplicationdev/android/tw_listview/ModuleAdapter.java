package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module>{

    private ArrayList<Module>module;
    private Context context;
    private TextView tvYear;
    private ImageView noprog;

    public ModuleAdapter(Context context,int resource,ArrayList<Module>object){
        super(context,resource,object);
        module = object;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.courserow, parent, false);

        // Get the TextView object
        tvYear = (TextView) rowView.findViewById(R.id.tvYear);
        // Get the ImageView object
        noprog = (ImageView) rowView.findViewById(R.id.imgviewprog);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentModule = module.get(position);
        // Set the TextView to show the food

        tvYear.setText(currentModule.getYear());
        // Set the image to star or nostar accordingly
        if(currentModule.isprog()) {
            noprog.setImageResource(R.drawable.prog);
        }
        else {
            noprog.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}





