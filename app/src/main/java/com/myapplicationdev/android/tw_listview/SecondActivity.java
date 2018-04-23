package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> modules;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

// Create a few food objects in Food array
        modules = new ArrayList<Module>();
        Log.i("ttt",year);
        if(year.equals("Year 1")){
            modules.add(new Module("Year1","G101", false));
            modules.add(new Module("Year1","B102", false));
            modules.add(new Module("Year1","C105", true));
        }else if (year.equals("Year 2")){
            modules.add(new Module("Year2","C208", false));
            modules.add(new Module("Year2","C200", true));
            modules.add(new Module("Year2","C346", true));
        }else{

            modules.add(new Module("Year3","C347", true));
        }


        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new ModuleAdapter(this, R.layout.courserow, modules);
        lv.setAdapter(aa);


    }



}
