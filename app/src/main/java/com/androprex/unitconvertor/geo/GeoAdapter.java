package com.androprex.unitconvertor.geo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androprex.unitconvertor.R;

public class GeoAdapter extends RecyclerView.Adapter<GeoAdapter.MyViewViewHolder> {
    String[] title;
    Context context;
    int[] img;

    public GeoAdapter(String[] title, Context context, int[] img) {
        this.title = title;
        this.context = context;
        this.img = img;
    }

    @NonNull
    @Override
    public GeoAdapter.MyViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.myxml_geo,parent,false);
        return new GeoAdapter.MyViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GeoAdapter.MyViewViewHolder holder, int position) {
    holder.imageView.setImageResource(img[position]);
        holder.textView.setText(title[position]);

    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    class MyViewViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView textView;
        public MyViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_geo);
            textView = itemView.findViewById(R.id.text_geo);
        }
    }
}
