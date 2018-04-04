package com.example.sharma.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ListView listView = findViewById(R.id.list);

        final ArrayList <String> mylist =new ArrayList();
        mylist.add("facebook");
        mylist.add("twitter");
        mylist.add("gallery");
        mylist.add("camera");
        mylist.add("app");
        mylist.add("gk");
        mylist.add("sony liv");
        mylist.add("play store");

        ArrayAdapter <String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mylist);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    Intent intent = new Intent(getApplicationContext(),activity_3.class);
                    startActivity(intent);
                }
                else{
                Toast.makeText(getApplicationContext(),mylist.get(position),Toast.LENGTH_SHORT).show();}
            }
        });
    }
}
