package com.example.listviewtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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

    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //1.每个条目的返回的内容  写一个条目布局

        //2.创建布局
        //View view=View.inflate(context,R.id.item_list,null);
        //3.优化 ViewHolder=================只管viewHolder和convertView=======================
        ViewHolder viewHolder=null;
        if (convertView==null){
            convertView=View.inflate(context,R.layout.item_list, null);
            viewHolder = new ViewHolder();
            // 把所有的子view 给ViewHolder
            viewHolder.content=(TextView) convertView.findViewById(R.id.content);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }

        //----------------------------只管设置内容-----------------------
        String item=data.get(position);
        viewHolder.content.setText(item);
        return convertView;
    }
    public class ViewHolder{
        public TextView content;
    }
}
