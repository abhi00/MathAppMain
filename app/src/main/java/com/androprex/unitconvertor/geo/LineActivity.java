package com.androprex.unitconvertor.geo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import com.androprex.unitconvertor.R;

public class LineActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView first_label,second_label,first_text,second_text,third_text,four_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        toolbar = findViewById(R.id.toolbar_opr_geo_line);
        first_label = findViewById(R.id.first_text_label_line);
        second_label = findViewById(R.id.first_text_label_line);
        first_text = findViewById(R.id.first_edit_line);
        second_text = findViewById(R.id.second_edit_line);
        third_text = findViewById(R.id.third_edit_line);
        four_text = findViewById(R.id.four_edit_line);
    }
}
