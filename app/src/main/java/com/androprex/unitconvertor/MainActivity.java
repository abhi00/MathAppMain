
package com.androprex.unitconvertor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity implements DiscreteScrollView.OnItemChangedListener{


    Toolbar toolbar;

    DiscreteScrollView scrollView;
    private InfiniteScrollAdapter infiniteAdapter;
    int[] img_background  ={R.drawable.unit_background_pink,R.drawable.unit_background_purpal,R.drawable.unit_background_saffron,R.drawable.unit_background_pink,R.drawable.unit_background_purpal,R.drawable.unit_background_saffron};
    int[] img = {R.drawable.length,R.drawable.area,R.drawable.weight,R.drawable.tempreture,R.drawable.time,R.drawable.volume};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar2);
        scrollView = findViewById(R.id.picker);
        setSupportActionBar(toolbar);


        scrollView.setOrientation(DSVOrientation.HORIZONTAL); //Sets an orientation of the view
        scrollView.addOnItemChangedListener(this);
        infiniteAdapter = InfiniteScrollAdapter.wrap(new MyAdapter(getResources().getStringArray(R.array.unit_converter),this,img_background,img));
        scrollView.setAdapter(infiniteAdapter);
        scrollView.setItemTransitionTimeMillis(500);
        scrollView.setItemTransformer(new ScaleTransformer.Builder()
                .setMinScale(0.8f)
                .build());



        // getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    @Override
    public void onCurrentItemChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i) {



    }
}
