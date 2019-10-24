package com.example.mylistview;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListViewActivity extends Activity {
    private DatabaseHelper myDb;
    private ListView myListView;
    private Button btnSend;
    ArrayList<Person> person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        myDb = new DatabaseHelper(this);

        btnSend = (Button) findViewById(R.id.btn_send);
        person = new ArrayList<>();
            Cursor res = myDb.getAllData();

            if(res.getCount() != 0){

                while (res.moveToNext()){

                    person.add(new Person(res.getInt(1),res.getString(2)));
                }


            }


        myListView = (ListView) findViewById(R.id.lst_person);
        myListView.setAdapter(new CustomListAdapter(ListViewActivity.this,person));

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Person p = new Person(0,"new inseart!");

                Boolean isSave = myDb.insertData(p);
                if (isSave)
                    Toast.makeText(ListViewActivity.this,"Data Inserted.",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ListViewActivity.this,"Data did not save!",Toast.LENGTH_LONG).show();
                person.add(p);


                myListView.setAdapter(new CustomListAdapter(ListViewActivity.this,person));



            }
        });





    }
}
