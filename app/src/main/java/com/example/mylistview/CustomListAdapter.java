package com.example.mylistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {

    private Context myContext;
    private LayoutInflater myLayoutInflater;
    private ArrayList<Person> person;


    public CustomListAdapter(ListViewActivity context, ArrayList<Person> p) {
        this.myContext = context;
        this.myLayoutInflater = LayoutInflater.from(context);
        this.person = p;
    }

    @Override
    public int getCount() {
        return person.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{

        public ImageView imgView;
        public TextView txtTitle, txtContant;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         ViewHolder holder = null;
         if(convertView == null){
             convertView = myLayoutInflater.inflate(R.layout.custom_list_item,null);
             holder = new ViewHolder();
             holder.imgView = (ImageView) convertView.findViewById(R.id.img_item);
             holder.txtTitle = (TextView) convertView.findViewById(R.id.txt_title);
             holder.txtContant = (TextView) convertView.findViewById(R.id.txt_contant);
             convertView.setTag(holder);

         }else{

             holder = (ViewHolder) convertView.getTag();

         }

         holder.imgView.setImageResource(R.drawable.row_send);
         holder.txtTitle.setText(person.get(position).getName());
         holder.txtContant.setText(person.get(position).getMassage());

        return convertView;
    }
}
