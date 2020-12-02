package com.example.listviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListDataAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> data;

    public ListDataAdapter(Context context, ArrayList<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {         //返回条目，总共有多少条
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //1.每个条目的返回的内容  写一个条目布局

        //2.创建布局
        View view=View.inflate(context,R.id.item_list,null);

        //3.优化 ViewHolder=================只管viewHolder和convertView=======================

        return view;
    }
    public class ViewHolder{
        public TextView content;
    }
}
