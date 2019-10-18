package com.example.listviewactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {
    static  final String[] ANIMALS = new String[] {"Ant", "Bear", "Bird", "Cat", "Dog", "Donkey", "Elephant", "Graffe", "Goat", "Monkey", "Pig", "Rat", "Snake", "Spider"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adaptor);
        ArrayAdapter arrayAdep = new ArrayAdapter<String>(this,R.layout.activity_array_adaptor, ANIMALS);
        setListAdapter(arrayAdep);
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
