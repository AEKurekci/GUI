package com.example.listviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

public class CustomAdaptorActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adaptor);

        animals.add(new Animal("Bird", R.mipmap.bird));
        animals.add(new Animal("Cat", R.mipmap.cat));
        animals.add(new Animal("Elephant", R.mipmap.elephant));
        animals.add(new Animal("Dog", R.mipmap.dog));

        final ListView listView = (ListView) findViewById(R.id.listView);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}
