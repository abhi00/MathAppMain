package com.androprex.unitconvertor.symbol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.androprex.unitconvertor.R;

import java.util.List;

public class MathAdapter extends RecyclerView.Adapter<MathAdapter.ViewHolder> {


    Context context;
    String symbol[];
    public MathAdapter(@NonNull Context context,String symbol[])
    {
        this.context=context;
        this.symbol=symbol;
    }

    @NonNull
    @Override
    public MathAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.mathsymblolxml, parent, false);
        RecyclerView.ViewHolder viewHolder = new ViewHolder(view);
        return (ViewHolder)viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MathAdapter.ViewHolder holder, int position) {


        //holder.m_textView.setText(.get(position).getName());
        holder.m_textsymbol.setText(symbol[position]);
    }

    @Override
    public int getItemCount() {
        return symbol.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView m_textsymbol;

        public ViewHolder(View itemView) {
            super(itemView);
            m_textsymbol = (TextView) itemView.findViewById(R.id.text_symbol_TV);
        }
    }
}