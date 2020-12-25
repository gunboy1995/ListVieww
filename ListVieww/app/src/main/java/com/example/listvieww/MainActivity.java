package com.example.listvieww;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

          ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.list1);
        String[]  values = {"iPhone 6","Nexus 6","Moto G","HTC One","Galaxy S5","Sony Xperia Z2","Lumia 830","Galaxy Grand 2"};

//         Define a new Adapter


        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,                                  //         First parameter - Context
                        android.R.layout.simple_list_item_1,    //         Second parameter - Layout for the row
                        android.R.id.text1,                     //         Third parameter - ID of the TextView to which the data is written
                        values);                                //         Forth - the Array of data

        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) lv.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
            }
        });
  String  itemValue    = (String) lv.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

    }




}
