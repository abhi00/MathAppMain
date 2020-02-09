package com.androprex.unitconvertor.geo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.androprex.unitconvertor.MyAdapter;
import com.androprex.unitconvertor.R;
import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

public class GeometryActivity extends AppCompatActivity implements DiscreteScrollView.OnItemChangedListener {

    Toolbar toolbar;
    RecyclerView recyclerView;

    DiscreteScrollView scrollView;
    //private InfiniteScrollAdapter infiniteAdapter;
    int[] img_background  ={R.drawable.unit_background_saffron,R.drawable.unit_background_green,R.drawable.unit_background_pink,R.drawable.unit_background_saffron,R.drawable.unit_background_green,R.drawable.unit_background_pink};
    int[] img = {R.drawable.twod,R.drawable.threed,R.drawable.threed,R.drawable.twod,R.drawable.threed,R.drawable.threed};
    int[] img_triangle_shape ={R.drawable.isosceles,R.drawable.regular,R.drawable.equilateral,R.drawable.cone};
    int[] img_polygon ={R.drawable.decagon,R.drawable.pentagon,R.drawable.heptagon,R.drawable.hexagon,R.drawable.nonagon,R.drawable.octagon,R.drawable.regular};
    int[] img_quard ={R.drawable.regular,R.drawable.square,R.drawable.parallelogram,R.drawable.rhombus};
    int[] img_poly ={R.drawable.dodecahedron,R.drawable.cube,R.drawable.icosahedron,R.drawable.octahedron,R.drawable.tetrahedron,R.drawable.prism,R.drawable.pyramid};
    int[] img_round ={R.drawable.circle,R.drawable.circlesector,R.drawable.ellipse,R.drawable.sphere,R.drawable.cylinder,R.drawable.hemisphere,R.drawable.ellipsoid};
    int[] img_line ={R.drawable.midpoint,R.drawable.slopeofline,R.drawable.distance};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);

        toolbar = findViewById(R.id.toolbar_geo);
        scrollView = findViewById(R.id.picker_geo);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.geo_recy);

        scrollView.setOrientation(DSVOrientation.HORIZONTAL); //Sets an orientation of the view
        scrollView.addOnItemChangedListener(this);
      //  infiniteAdapter = InfiniteScrollAdapter.wrap(new MyAdapter(getResources().getStringArray(R.array.geo_heading),this,img_background,img));
       // scrollView.setAdapter(infiniteAdapter);
        scrollView.setAdapter(new MyGeoMainAdapter(getResources().getStringArray(R.array.geo_heading),this,img_background,img,getResources().getStringArray(R.array.geo_sub_heading)));
        scrollView.setItemTransitionTimeMillis(500);
        scrollView.setItemTransformer(new ScaleTransformer.Builder()
                .setMinScale(0.8f)
                .build());
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(3, 30, true));



        // getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onCurrentItemChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
        switch (i)
        {
            case 0:
                recyclerViewClickEventAttribute(getResources().getStringArray(R.array.triangle_shape_attribute),img_triangle_shape,"triangle");
                break;

            case 1:
                recyclerViewClickEventAttribute(getResources().getStringArray(R.array.polygon_shape_attribute),img_polygon,"polygon");
                break;

            case 2:
                recyclerViewClickEventAttribute(getResources().getStringArray(R.array.quadrilatral_shape_attribute),img_quard,"quadrilateral");

                break;
            case 3:
                recyclerViewClickEventAttribute(getResources().getStringArray(R.array.poly_shape_attribute),img_poly,"polyhedron");
                break;
            case 4:
                recyclerViewClickEventAttribute(getResources().getStringArray(R.array.line_geo_attribute),img_line,"line");
                break;
            case 5:
                recyclerViewClickEventAttribute(getResources().getStringArray(R.array.round_shape_attribute),img_round,"round");
                break;


        }


        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }


    public void recyclerViewClickEventAttribute(String[] title ,int[] img_arr,final String type)
    {

        recyclerView.setAdapter(new GeoAdapter(title,this,img_arr));

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
               TextView textView= view.findViewById(R.id.text_geo);
                Intent intent = new Intent(GeometryActivity.this,GeoOprActivity.class);
                intent.putExtra(getResources().getString(R.string.intent_key),textView.getText().toString());

                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));


    }
}
