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

public class MyGeoMainAdapter extends RecyclerView.Adapter<MyGeoMainAdapter.MyViewViewHolder> {

 String[] title,sub_title;
 Context context;
 int[] img_background,img;


    public MyGeoMainAdapter(String[] title, Context context, int[] img_background, int[] img,String[] sub_title ) {
        this.sub_title = sub_title;
        this.title = title;
        this.context = context;
        this.img_background = img_background;
        this.img = img;

    }

    @NonNull
    @Override
    public MyViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.myxml,parent,false);
        return new MyViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewViewHolder holder, int position) {

        holder.cardView.setBackgroundResource(img_background[position]);
        holder.imageView.setImageResource(img[position]);
        holder.textView.setText(title[position]);
        holder.sub_title.setText(sub_title[position]);

    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    class MyViewViewHolder extends RecyclerView.ViewHolder
    {

        LinearLayout cardView;
        ImageView imageView;
        TextView textView,sub_title;
        public MyViewViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.title);
            sub_title = itemView.findViewById(R.id.sub_heading_geo);
        }
    }
}
