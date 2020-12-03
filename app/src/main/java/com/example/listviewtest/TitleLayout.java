package com.example.listviewtest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

class TitleLayout extends LinearLayout implements View.OnClickListener{
    Button titleBack,titleEdit;
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        titleBack=findViewById(R.id.title_back);
        titleEdit=findViewById(R.id.title_edit);
        titleBack.setOnClickListener(this);
        titleEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.title_back:
                ((Activity)getContext()).finish();
            case R.id.title_edit:
                Toast.makeText(getContext(),"U click edit",Toast.LENGTH_LONG).show();
        }
    }
}
