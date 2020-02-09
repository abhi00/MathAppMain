package com.androprex.unitconvertor;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DialogAdapter extends ArrayAdapter {

    Context context;

    String  title[],m[];


    public DialogAdapter(@NonNull Context context, String title[], String m[] ) {
        super(context, R.layout.spinerxml, R.id.title_cs,title);
        this.context = context;
        this.title=title;
        this.m=m;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.spinerxml,parent,false);

        TextView m_title= view.findViewById(R.id.title_cs);
        TextView m_meter = view.findViewById(R.id.mter_cs);
        LinearLayout m_linear=view.findViewById(R.id.linear);

        m_title.setText(title[position]);
        m_meter.setText(m[position]);

        if(position%2==0)
        {
            m_linear.setBackgroundColor(Color.WHITE);

        }
        else {
            m_linear.setBackgroundColor(Color.GRAY);
        }
        return view;
    }
}

