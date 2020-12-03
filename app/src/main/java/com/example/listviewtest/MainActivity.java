package com.example.listviewtest;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //1.变量的申明
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }
        //2.findViewById
        mListView=findViewById(R.id.list_view);

        //2.1封装数据
        ArrayList<String> data=new ArrayList<String>();
        for (int i=0;i<1200;i++){
            data.add(i+" ");
        }
        //3.设置适配器
        mListView.setAdapter(new ListDataAdapter(this,data));

        //适配器
    }
}