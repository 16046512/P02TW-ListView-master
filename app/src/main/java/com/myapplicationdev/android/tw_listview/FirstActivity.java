package com.myapplicationdev.android.tw_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Module> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)this.findViewById(R.id.lvYear);


        al = new ArrayList<Module>();
        al.add(new Module("Year 1"));
        al.add(new Module("Year 2"));
        al.add(new Module("Year 3"));






       // aa.notifyDataSetChanged();
        
        lv.setAdapter(aa);








    }
}
