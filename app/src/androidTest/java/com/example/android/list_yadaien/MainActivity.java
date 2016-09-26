package com.example.android.list_yadaien;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;




public class MainActivity extends AppCompatActivity {

    ArrayList<Data> data;
   public TextView name , place;
    public ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById( R.id.listt) ;

            name = (TextView) findViewById(R.id.text);
        place = (TextView) findViewById(R.id.text2);
        img = (ImageView) findViewById(R.id.image);

       data = new ArrayList<>();
       Data obj =  new Data("waqas","uni","waqasa");
        data.add(obj);
       Data obj2 = new Data("rao","university","raow");
       data.add(obj2);
       Data obj3 = new Data("group","university_group","group");
       data.add(obj3);
        Data obj4 = new Data("waqasaa","classroom","wwhite");
        data.add(obj4);
        Data obj5 = new Data("raowaqas","party","wred");
      data.add(obj5);


        CustomAdapter adapter = new CustomAdapter(this,R.layout.list_layout,data);
        for (Data obj6:data){
            Toast.makeText(this,obj6.getImageAddress()+"",Toast.LENGTH_SHORT).show();

        }

       list.setAdapter(adapter);

    }
}
