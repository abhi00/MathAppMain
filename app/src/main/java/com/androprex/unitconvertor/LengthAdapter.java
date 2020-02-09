package com.androprex.unitconvertor;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LengthAdapter extends ArrayAdapter {

    Context  context;

    String  title[],m[];
    ArrayList<Double> input;

    public LengthAdapter(@NonNull Context context, String title[], String m[], ArrayList<Double> input ) {
        super(context, R.layout.areaxml,title);
         this.context = context;
         this.title=title;
         this.m=m;
         this.input=input;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view = inflater.inflate(R.layout.areaxml,parent,false);

        TextView m_title= view.findViewById(R.id.title);
        TextView m_meter = view.findViewById(R.id.mter_TV);
        TextView m_inputA = view.findViewById(R.id.input_TV);

        m_title.setText(Html.fromHtml(title[position]));
        m_meter.setText(Html.fromHtml(m[position]));
        m_inputA.setText(""+input.get(position));
        return view;
    }
}
