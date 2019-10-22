package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView theList = (ListView) findViewById(R.id.the_list);

        ArrayList<String> name = new ArrayList<>();
        name.add("James");
        name.add("Tracy");
        name.add("William");
        name.add("Vera");
        name.add("Mark");
        name.add("Lucas");
        name.add("Anne");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,name);
        theList.setAdapter(adapter);

    }
}
