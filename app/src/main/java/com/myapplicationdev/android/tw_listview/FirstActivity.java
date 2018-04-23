package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)this.findViewById(R.id.lvYear);



        String year[]=new String[]{"Year 1","Year 2","Year 3"};

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,year);

        lv.setAdapter(adapter);
//test
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValues=(String)lv.getItemAtPosition(position);
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                intent.putExtra("position",itemValues);
                startActivity(intent);
            }
        });





    }
}
