package com.androprex.unitconvertor;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

public class ListDialog extends Dialog {




    ListView listView;
    Toolbar toolbar;
    String  title[],m[];
    Context context;
    String value;
     private  static  int count;



    public ListDialog(@NonNull Context context, String[] title, String[] m) {
        super(context);

        this.context = context;
        this.title = title;
        this.m = m;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dialogxml);

        toolbar = findViewById(R.id.toolbar);
        listView = findViewById(R.id.listviewdialog_LV);
        listView.setAdapter(new DialogAdapter(context,title,m));

    }


}
