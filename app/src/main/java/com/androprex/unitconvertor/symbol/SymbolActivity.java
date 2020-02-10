package com.androprex.unitconvertor.symbol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.androprex.unitconvertor.MainActivity;
import com.androprex.unitconvertor.R;
import com.androprex.unitconvertor.geo.GeoOprActivity;
import com.androprex.unitconvertor.geo.GeometryActivity;
import com.androprex.unitconvertor.geo.RecyclerItemClickListener;
import com.github.barteksc.pdfviewer.PDFView;

public class SymbolActivity extends AppCompatActivity {

    String []symbolheading;
    RecyclerView m_reclyersymbol;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol);
        symbolheading = getResources().getStringArray(R.array.symbol_heading);
        m_reclyersymbol=findViewById(R.id.recycle_mathsymbol);

        MathAdapter mathAdapter=new MathAdapter(SymbolActivity.this,symbolheading);
        m_reclyersymbol.setLayoutManager(new LinearLayoutManager(SymbolActivity.this));
        m_reclyersymbol.setAdapter(mathAdapter);
        m_reclyersymbol.addOnItemTouchListener(new RecyclerItemClickListener(this, m_reclyersymbol, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                         intent = new Intent(SymbolActivity.this, DisplayFileActivity.class);
                         intent.putExtra("data",position);
                         startActivity(intent);
                }


            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }
}
