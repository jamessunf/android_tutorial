package com.example.mylistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListViewActivity extends Activity {

    private ListView myListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("James","Test 1"));
        person.add(new Person("Tracy","Test 2"));
        person.add(new Person("William","Test 3"));
        person.add(new Person("Vera","Test 4"));
        person.add(new Person("Mark","Test 5"));

        myListView = (ListView) findViewById(R.id.lst_person);
        myListView.setAdapter(new CustomListAdapter(ListViewActivity.this,person));
    }
}