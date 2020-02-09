package com.androprex.unitconvertor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewViewHolder> {

 String[] title;
 Context context;
 int[] img_background  ={R.drawable.unit_background_pink, R.drawable.unit_background_purpal, R.drawable.unit_background_saffron, R.drawable.unit_background_pink, R.drawable.unit_background_purpal, R.drawable.unit_background_saffron};
   int[] img = {R.drawable.length, R.drawable.area, R.drawable.weight, R.drawable.tempreture, R.drawable.time, R.drawable.volume};

    public MyAdapter(String[] title, Context context) {
        this.title = title;
        this.context = context;
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
        holder.textView2.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {

        return img.length;
    }

    class MyViewViewHolder extends RecyclerView.ViewHolder
    {

        LinearLayout cardView;
        ImageView imageView;
        TextView textView,textView2;
        public MyViewViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.title);
            textView2 = itemView.findViewById(R.id.sub_heading_geo);
        }
    }
}
