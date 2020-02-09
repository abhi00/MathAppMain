package com.androprex.unitconvertor.geo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;


import com.androprex.unitconvertor.InputDialogBox;
import com.androprex.unitconvertor.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GeoOprActivity extends AppCompatActivity implements View.OnClickListener,InputDialogBox.InputDialogListner {

    Toolbar toolbar;
    Spinner spinner_text;
    LinearLayout first_linear, second_linear, third_linear, fourth_linear, fifth_linear;
    TextView first_text, second_text, third_text, fourth_text, fifth_text, res, text_main;
    ImageView image;
    TextView first_edit, second_edit, third_edit, fourth_edit, fifth_edit;
    String type_opr;
    int spinner_count;
    int count;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_opr);
        toolbar = findViewById(R.id.toolbar_opr_geo);

        type_opr = getIntent().getExtras().getString(getResources().getString(R.string.intent_key));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle(type_opr);

        spinner_text = findViewById(R.id.spinner);

        image = findViewById(R.id.image_geo_opr);

        first_linear = findViewById(R.id.first_linear);
        second_linear = findViewById(R.id.second_linear);
        third_linear = findViewById(R.id.third_linear);
        fourth_linear = findViewById(R.id.fourth_linear);
        fifth_linear = findViewById(R.id.fifth_linear);


        first_text = findViewById(R.id.first_text_label);
        second_text = findViewById(R.id.second_text_label);
        third_text = findViewById(R.id.third_text_label);
        fourth_text = findViewById(R.id.fourth_text_label);
        fifth_text = findViewById(R.id.fifth_text_label);

        text_main = findViewById(R.id.text_lable_main);
        first_edit = findViewById(R.id.first_edit);
        second_edit = findViewById(R.id.second_edit);
        third_edit = findViewById(R.id.third_edit);
        fourth_edit = findViewById(R.id.fourth_edit);
        fifth_edit = findViewById(R.id.fifth_edit);


        res = findViewById(R.id.res_geo_opr);

        setView();

        first_edit.setOnClickListener(this);
        second_edit.setOnClickListener(this);
        third_edit.setOnClickListener(this);
        fourth_edit.setOnClickListener(this);
        fifth_edit.setOnClickListener(this);

        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (type_opr) {
                    case "Isosceles":
                        res.setText(setResultforIsosceles());
                        break;
                    case "Right TriAngle":
                        res.setText(setResultforRightAngle());
                        break;
                    case "Parallelogram":
                        res.setText(setResultforParallelogram());
                        break;
                    case "Circle Sector":
                        res.setText(setResultforCircleSector());
                        break;
                    case "Pyramid":
                        res.setText(setResultforPyramid());
                        break;

                    case "Hemisphere":
                        res.setText(setResultforHemisphere());
                        break;

                    case "Prism":
                        res.setText(setResultforPrism());

                        break;

                    case "Cylinder":
                        res.setText(setResultforCylinder());
                        break;
                    case "Rhombus":
                        res.setText(setResultforRhombus());
                        break;
                    case "Cone":
                        res.setText(setResultforCone());

                        break;

                    case "Regular Polygon":
                     res.setText(setResultforRegular());
                        break;
                    case "Eclipse":
                        res.setText(setResultforEclipse());

                    case"Rectangle":
                        res.setText(setResultforRectangle());
                        break;
                    case "Ellipsoid":
                        res.setText(setResultforEllipsoid());

                }

            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    public void setView() {

        switch (type_opr) {

            case "Isosceles":
                setActivityforIsosceles();
                break;

            case "Right TriAngle":
                setActivityforRightTriangle();
                break;

            case "Equilateral":
                setActivityforEquilateral();
                break;
            case "Decagon":
                setActivityforDecagon();
                break;
            case "Eclipse":
                setActivityforEclipse();
                break;
            case "Heptagon":
                setActivityforHeptagon();
                break;
            case "Hexagon":
                setActivityforHexagon();
                break;
            case "Circle Sector":
                setActivityforCircleSector();
                break;

            case "Distance between points":
                setActivityforDistancebetweenpoints();
                break;
            case "Mid-Point of line":
                setActivityforMidPointofline();
                break;

            case "Slop of line":
                setActivityforSlopOfline();
                break;

            case "Nonagon":
                setActivityforNonagon();
                break;

            case "Octagon":
                setActivityforOctagon();
                break;

            case "Parallelogram":
                setActivityforParallelogram();
                break;
            case "Circle":
                setActivityforCircle();
                break;
            case "Pyramid":
                setActivityforPyramid();
                break;
            case "Hemisphere":
                setActivityforHemisphere();
                break;

            case "TetraHedron":
                setActivityforTetraHedron();
                break;

            case "Sphere":
                setActivityforSphere();
                break;

            case "Prism":
                setActivityforPrism();
                break;

            case "Octahedron":
                setActivityforOctahedron();
                break;

            case "Icosahedron":
                setActivityforIcosahedron();
                break;

            case "Ellipsoid":
                setActivityforEllipsoid();
                break;

            case "Dodecahedron":
                setActivityforDodecahedron();
                break;
            case "Cylinder":
                setActivityforCylinder();
                break;

            case "Cube":
                setActivityforCube();
                break;

            case "Cone":
                setActivityforCone();
                break;

            case "Square":
                setActivityforSquare();
                break;

            case "Rhombus":
                setActivityforRhombus();
                break;

            case "Regular ":
                setActivityforRegular();
                break;

            case "Rectangle":
                setActivityforRectangle();
                break;

            case "Petagon":
                setActivityforPetagon();
                break;


        }


    }


    private void setActivityforMidPointofline() {
    }

    private void setActivityforDistancebetweenpoints() {
    }



    public void setActivityforIsosceles() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        fifth_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.bisosceles);
        third_text.setText(getResources().getString(R.string.sideb));
        fourth_text.setText(getResources().getString(R.string.height));
        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.isosceles_triangle_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                third_text.setText(getResources().getString(R.string.baseb));
                fourth_text.setText(getResources().getString(R.string.height));
                switch (i) {
                    case 0:
                        third_text.setText(getResources().getString(R.string.baseb));
                        fourth_text.setText(getResources().getString(R.string.height));

                        spinner_count = 0;


                        break;
                    case 1:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.baseb));
                        spinner_count = 1;
                        break;
                    case 2:

                        third_text.setText(getResources().getString(R.string.baseb));
                        fourth_text.setText(getResources().getString(R.string.height));
                        spinner_count = 2;

                        break;
                    case 3:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.height));
                        spinner_count = 3;
                        break;
                    case 4:

                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.baseb));
                        spinner_count = 4;
                        break;
                    case 5:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.height));
                        spinner_count = 5;
                        break;
                    case 6:
                        third_text.setText(getResources().getString(R.string.area));
                        fourth_text.setText(getResources().getString(R.string.sidea));
                        spinner_count = 6;
                        break;

                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public String setResultforIsosceles() {
        IsoscelesTriangle triangle = new IsoscelesTriangle();

        String output = null;

        double x = Double.parseDouble(third_edit.getText().toString());

        double y = Double.parseDouble(fourth_edit.getText().toString());

        if (third_edit != null && fourth_edit != null) {

            switch (spinner_count) {
                case 0:


                    output = triangle.getAreaBybh(x, y);

                    break;
                case 1:

                    output = triangle.getPeriByab(x, y);

                    break;
                case 2:

                    output = triangle.getSideBybh(x, y);

                    break;
                case 3:

                    output = triangle.getBaseByah(x, y);

                    break;
                case 4:
                    output = triangle.getHeightByab(x, y);
                    break;
                case 5:
                    output = triangle.getAngleByah(x, y);
                    break;

                case 6:
                    output = triangle.getAngleByara(x, y);
                    break;
            }


        } else {
            output = "Please Enter Value";
        }

        return output;
    }




    /*-------------------------------------------Right Triangle------------------------------------------*/


    public void setActivityforRightTriangle() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        fifth_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.brighttriangle);
        third_text.setText(getResources().getString(R.string.sidea));
        fourth_text.setText(getResources().getString(R.string.sideb));
        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.right_triangle_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 0:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sideb));


                        spinner_count = 0;


                        break;
                    case 1:
                        third_text.setText(getResources().getString(R.string.sideb));
                        fourth_text.setText(getResources().getString(R.string.sidec));

                        spinner_count = 1;
                        break;
                    case 2:


                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sidec));
                        spinner_count = 2;

                        break;
                    case 3:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sideb));
                        spinner_count = 3;
                        break;
                    case 4:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sidec));
                        spinner_count = 4;
                        break;
                    case 5:
                        third_text.setText(getResources().getString(R.string.sideb));
                        fourth_text.setText(getResources().getString(R.string.sidec));
                        spinner_count = 5;
                        break;

                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


    public String setResultforRightAngle() {

        RightTringle triangle = new RightTringle();

        String output = null;

        third_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              InputDialogBox dialogBox = new InputDialogBox();
              dialogBox.show(getSupportFragmentManager(),"check");

            }
        });

        /*double x = Double.parseDouble(third_edit.getText().toString());

        double y = Double.parseDouble(fourth_edit.getText().toString());

        if (third_edit != null && fourth_edit != null) {

            switch (spinner_count) {
                case 0:


                    output = triangle.getArea(x, y);

                    break;
                case 1:

                    output = triangle.getSideA(x, y);

                    break;
                case 2:

                    output = triangle.getSideB(x, y);

                    break;
                case 3:

                    output = triangle.getSideC(x, y);

                    break;
                case 4:
                    output = triangle.getAlpha(x, y);
                    break;
                case 5:
                    output = triangle.getBeta(x, y);
                    break;


            }


        } else {
            output = "Please Enter Value";
        }*/

        return output;
    }


    /*====================================== Equilateral ===========================================*/
    private void setActivityforEquilateral() {

        first_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bequilateral);
        spinner_text.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        text_main.setText(getResources().getString(R.string.one_val));
        second_text.setText(getResources().getString(R.string.area));
        third_text.setText(getResources().getString(R.string.perimeter));
        fourth_text.setText(getResources().getString(R.string.sidea));
        fifth_text.setText(getResources().getString(R.string.height));


    }


    public void setResultforEquilateral() {
        double x;
        String data,output;
        EquilateralTriangl equilateralTriangl=new EquilateralTriangl();
        switch (count)
        {

            case 2:
                data = second_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =equilateralTriangl.getResultByArea(x);
                    res.setText(output);
                    third_edit.setText(""+equilateralTriangl.getPeri());
                    fourth_edit.setText(""+equilateralTriangl.getA());
                    fifth_edit.setText(""+equilateralTriangl.getH());

                }

                break;
            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =equilateralTriangl.getResultByPeri(x);
                    res.setText(output);
                    second_edit.setText(""+equilateralTriangl.getAr());
                    fourth_edit.setText(""+equilateralTriangl.getA());
                    fifth_edit.setText(""+equilateralTriangl.getH());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =equilateralTriangl.getResultBySide(x);
                    res.setText(output);
                    second_edit.setText(""+equilateralTriangl.getAr());
                    third_edit.setText(""+equilateralTriangl.getPeri());
                    fifth_edit.setText(""+equilateralTriangl.getH());

                }
                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =equilateralTriangl.getResultByHeight(x);
                    res.setText(output);
                    second_edit.setText(""+equilateralTriangl.getAr());
                    third_edit.setText(""+equilateralTriangl.getPeri());
                    fourth_edit.setText(""+equilateralTriangl.getA());

                }
                break;

        }

    }





    /*====================================== Parallelogram ===========================================*/

    private void setActivityforParallelogram() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.bparallelogram);
        text_main.setText(getResources().getString(R.string.all_val));
        fourth_text.setText(getResources().getString(R.string.sideb));
        fifth_text.setText(getResources().getString(R.string.height));
        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.parallelogram_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        fourth_text.setText(getResources().getString(R.string.sideb));
                        fifth_text.setText(getResources().getString(R.string.height));


                        spinner_count = 0;


                        break;
                    case 1:
                        fourth_text.setText(getResources().getString(R.string.sidea));
                        fifth_text.setText(getResources().getString(R.string.sideb));
                        spinner_count = 1;
                        break;
                    case 2:

                        fourth_text.setText(getResources().getString(R.string.perimeter));
                        fifth_text.setText(getResources().getString(R.string.sideb));
                        spinner_count = 2;

                        break;
                    case 3:

                        fourth_text.setText(getResources().getString(R.string.area));
                        fifth_text.setText(getResources().getString(R.string.height));
                        spinner_count = 3;
                        break;
                    case 4:

                        fourth_text.setText(getResources().getString(R.string.height));
                        fifth_text.setText(getResources().getString(R.string.sidea));
                        spinner_count = 4;
                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    public String setResultforParallelogram() {
        Parallelogram triangle = new Parallelogram();
        String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        if (fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:


                    output = triangle.getResultBybh(x, y);

                    break;
                case 1:

                    output = triangle.getResultByab(x, y);

                    break;
                case 2:

                    output = triangle.getResultBypb(x, y);

                    break;
                case 3:

                    output = triangle.getResultByha(x, y);

                    break;
                case 4:
                    output = triangle.getResultByarh(x, y);

            }


        } else {
            output = "Please Enter Value";
        }

        return output;
    }





    /*====================================== Octagon ===========================================*/

    private void setActivityforOctagon() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.boctahedron);
        text_main.setText(getResources().getString(R.string.one_val));
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);


    }


    public void setResultforOctagon() {
        double x;
        String data,output;
        Octagon octagon=new Octagon();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =octagon.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+octagon.getPeri());
                    fifth_edit.setText(""+octagon.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =octagon.getResultByPeri(x);
                    res.setText(output);
                    third_edit.setText(""+octagon.getAr());
                    fifth_edit.setText(""+octagon.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =octagon.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+octagon.getAr());
                    fourth_edit.setText(""+octagon.getPeri());

                }
                break;

        }

    }


    /*====================================== Nonagon ===========================================*/


    private void setActivityforNonagon() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.bparallelogram);
        text_main.setText(getResources().getString(R.string.one_val));
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);

    }


    public void setResultforNonagon() {
        double x;
        String data,output;
        Nonagon nonagon=new Nonagon();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =nonagon.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+nonagon.getPeri());
                    fifth_edit.setText(""+nonagon.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =nonagon.getResultByPeri(x);
                    res.setText(output);
                    third_edit.setText(""+nonagon.getAr());
                    fifth_edit.setText(""+nonagon.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =nonagon.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+nonagon.getAr());
                    fourth_edit.setText(""+nonagon.getPeri());

                }
                break;

        }

    }



    /*+++++++++++++++++++++++++++++++++++++++ Heptagon++++++++++++++++++++++++++++++++++++++++++++++++*/

    private void setActivityforHeptagon() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.bheptagon);
        text_main.setText(getResources().getString(R.string.one_val));
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);

    }
    public void setResultforHeptagon() {
        double x;
        String data,output;
        Heptagon heptagon=new Heptagon();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =heptagon.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+heptagon.getPeri());
                    fifth_edit.setText(""+heptagon.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =heptagon.getResultByPeri(x);
                    res.setText(output);
                    third_edit.setText(""+heptagon.getAr());
                    fifth_edit.setText(""+heptagon.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =heptagon.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+heptagon.getAr());
                    fourth_edit.setText(""+heptagon.getPeri());

                }
                break;

        }

    }



    /*====================================== Decagon ===========================================*/
    private void setActivityforDecagon() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.bdecagon);
        text_main.setText(getResources().getString(R.string.one_val));
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);
    }

    public void setResultforDecagon() {
        double x;
        String data,output;
        Decagon decagon=new Decagon();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =decagon.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+decagon.getPeri());
                    fifth_edit.setText(""+decagon.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =decagon.getResultByPeri(x);
                    res.setText(output);
                    third_edit.setText(""+decagon.getAr());
                    fifth_edit.setText(""+decagon.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =decagon.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+decagon.getAr());
                    fourth_edit.setText(""+decagon.getPeri());

                }
                break;

        }

    }



    /*====================================== Hexagon ===========================================*/

    private void setActivityforHexagon() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        image.setImageResource(R.drawable.bhexagon);
        text_main.setText(getResources().getString(R.string.one_val));
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);
    }

    public void setResultforHexagon() {
        double x;
        String data,output;
        Hexagon hexagon=new Hexagon();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =hexagon.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+hexagon.getPeri());
                    fifth_edit.setText(""+hexagon.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =hexagon.getResultByPeri(x);
                    res.setText(output);
                    third_edit.setText(""+hexagon.getAr());
                    fifth_edit.setText(""+hexagon.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =hexagon.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+hexagon.getAr());
                    fourth_edit.setText(""+hexagon.getPeri());

                }
                break;

        }

    }






    /*===================================== Circle Sector ===========================================*/
    private void setActivityforCircleSector() {


        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bcirclesector);
        text_main.setText(getResources().getString(R.string.all_val));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.circle_sector_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fourth_text.setText(getResources().getString(R.string.rad));
                fifth_text.setText(getResources().getString(R.string.angle));
                switch (position) {
                    case 0:

                        spinner_count = 0;
                        break;
                    case 1:

                        spinner_count = 1;
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public String setResultforCircleSector() {

        CircleSector triangle = new CircleSector();
        String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        if (fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:
                    output = triangle.getResultByralpha(x, y);

                    break;
                case 1:
                    output = triangle.getResultByal(x, y);
                    break;


            }


        } else {
            output = "Please Enter Value";
        }

        return output;
    }


    /*====================================== circle ===========================================*/


    private void setActivityforCircle() {

        first_linear.setVisibility(View.GONE);
        spinner_text.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bcircle);
        text_main.setText(getResources().getString(R.string.one_val));

        second_text.setText(getResources().getString(R.string.area));
        third_text.setText(getResources().getString(R.string.circ));
        fourth_text.setText(getResources().getString(R.string.dia));
        fifth_text.setText(getResources().getString(R.string.rad));


    }


    public void setResultforCircle() {
        double x;
        String data,output;
        Circle circle = new Circle();
        switch (count)
        {

            case 2:
                data = second_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =circle.getResultByArea(x);
                    res.setText(output);
                    third_edit.setText(""+circle.getC());
                    fourth_edit.setText(""+circle.getD());
                    fifth_edit.setText(""+circle.getR());

                }

                break;
            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =circle.getResultByCircum(x);
                    res.setText(output);
                    second_edit.setText(""+circle.getA());
                    fourth_edit.setText(""+circle.getD());
                    fifth_edit.setText(""+circle.getR());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =circle.getResultByDia(x);
                    res.setText(output);
                    second_edit.setText(""+circle.getA());
                    third_edit.setText(""+circle.getC());
                    fifth_edit.setText(""+circle.getR());

                }
                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =circle.getResultByRad(x);
                    res.setText(output);
                    second_edit.setText(""+circle.getA());
                    third_edit.setText(""+circle.getC());
                    fourth_edit.setText(""+circle.getD());

                }
                break;

        }

    }

    /*======================================Ellipse ===========================================*/


    private void setActivityforEclipse() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bellipse);
        text_main.setText(getResources().getString(R.string.all_val));

        fourth_text.setText(getResources().getString(R.string.diap));
        fifth_text.setText(getResources().getString(R.string.diaq));
        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.ellipse_spinner)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        fourth_text.setText(getResources().getString(R.string.diap));
                        fifth_text.setText(getResources().getString(R.string.diaq));


                        spinner_count = 0;


                        break;
                    case 1:
                        fourth_text.setText(getResources().getString(R.string.area));
                        fifth_text.setText(getResources().getString(R.string.diaq));
                        spinner_count = 1;
                        break;
                    case 2:

                        fourth_text.setText(getResources().getString(R.string.area));
                        fifth_text.setText(getResources().getString(R.string.diap));
                        spinner_count = 2;

                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    public String setResultforEclipse() {

        Ellipse ellipse=new Ellipse();
        String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        if (fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:


                    output = ellipse.getResultBypq(x, y);

                    break;
                case 1:

                    output = ellipse.getResultByadq(x, y);

                    break;
                case 2:

                    output = ellipse.getResultByadp(x, y);

                    break;
            }


        } else

            {
            output = "Please Enter Value";
        }

        return output;
    }






    /*======================================slop of line  ===========================================*/
    private void setActivityforSlopOfline() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bslopeofline);
        spinner_text.setVisibility(View.GONE);
        text_main.setText(getResources().getString(R.string.point_val));
        fourth_text.setText(getResources().getString(R.string.point1));
        fourth_text.setText(getResources().getString(R.string.point2));
    }






    /*====================================== Pyramid ===========================================*/

    private void setActivityforPyramid() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bpyramid);
        text_main.setText(R.string.all_val);
        third_text.setText(getResources().getString(R.string.length));
        fourth_text.setText(getResources().getString(R.string.height));
        fifth_text.setText(getResources().getString(R.string.width));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.pyramid_Spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {

                    case 0:
                        spinner_count = 0;
                        break;

                    case 1:
                        spinner_count = 1;
                        break;
                    case 2:
                        spinner_count = 2;
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public String setResultforPyramid() {

        Pyramid pyramid = new Pyramid();
        String output = null;
        double x = Double.parseDouble(third_edit.getText().toString());
        double y = Double.parseDouble(fourth_edit.getText().toString());
        double z = Double.parseDouble(fifth_edit.getText().toString());
        if (third_edit != null && fourth_edit != null && fifth_edit != null) {
            switch (spinner_count) {
                case 0:
                    output = pyramid.getArea(x, y, z);
                    break;
                case 1:
                    output = pyramid.getVolume(x, y, z);
                    break;
                case 2:
                    output = pyramid.getLateralArea(x, y, z);
                    break;

            }


        } else {
            output = "please Enter Value";
        }
        return output;


    }
    /*====================================== Cone ===========================================*/

    private void setActivityforCone() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bcone);
        text_main.setText(getResources().getString(R.string.all_val));
        fourth_text.setText(getResources().getString(R.string.rad));
        fifth_text.setText(getResources().getString(R.string.height));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.cone_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        spinner_count = 0;
                        fifth_linear.setVisibility(View.VISIBLE);

                        fourth_text.setText(getResources().getString(R.string.rad));
                        fifth_text.setText(getResources().getString(R.string.height));

                        break;

                    case 1:
                        spinner_count = 1;
                        fourth_text.setText(getResources().getString(R.string.rad));
                        fifth_text.setText(getResources().getString(R.string.height));

                        break;
                    case 2:
                        spinner_count = 2;
                        fifth_linear.setVisibility(View.VISIBLE);

                        fourth_text.setText(getResources().getString(R.string.volume));
                        fifth_text.setText(getResources().getString(R.string.height));

                        break;
                    case 3:
                        spinner_count = 3;

                        fourth_text.setText(getResources().getString(R.string.rad));

                        fifth_linear.setVisibility(View.INVISIBLE);

                        break;
                    case 4:
                        spinner_count = 4;
                        fifth_linear.setVisibility(View.VISIBLE);

                        fourth_text.setText(getResources().getString(R.string.volume));
                        fifth_text.setText(getResources().getString(R.string.rad));


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public String setResultforCone() {

        Cone cone = new Cone();
        String output = null;
        double y = Double.parseDouble(fourth_edit.getText().toString());
        double z = Double.parseDouble(fifth_edit.getText().toString());
        if (fourth_edit != null && fifth_edit != null) {
            switch (spinner_count) {
                case 0:
                    output = cone.getArea(y, z);
                    break;
                case 1:
                    output = cone.getVolume(y, z);
                    break;
                case 2:
                    output = cone.getResultByvh(y, z);
                    break;
                case 3:
                    output = cone.getResultByr(y);
                    break;
                case 4:
                    output = cone.getResultByvr(y, z);
                    break;

            }


        } else {
            output = "please Enter Value";
        }
        return output;
    }


    /*====================================== Cylinder ===========================================*/
    private void setActivityforCylinder() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bcylinder);
        text_main.setText(R.string.input_value);
        fourth_text.setText(getResources().getString(R.string.height));
        fifth_text.setText(getResources().getString(R.string.rad));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.cylinder_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        spinner_count = 0;
                        fifth_linear.setVisibility(View.VISIBLE);

                        fourth_text.setText(getResources().getString(R.string.height));
                        fifth_text.setText(getResources().getString(R.string.rad));

                        break;

                    case 1:
                        spinner_count = 1;
                        fifth_linear.setVisibility(View.VISIBLE);

                        fourth_text.setText(getResources().getString(R.string.height));
                        fifth_text.setText(getResources().getString(R.string.rad));

                        break;
                    case 2:
                        spinner_count = 2;

                        fourth_text.setText(getResources().getString(R.string.dia));
                        fifth_linear.setVisibility(View.INVISIBLE);

                        break;
                    case 3:
                        spinner_count = 3;

                        fourth_text.setText(getResources().getString(R.string.rad));

                        fifth_linear.setVisibility(View.INVISIBLE);

                        break;
                    case 4:
                        spinner_count = 4;
                        fifth_linear.setVisibility(View.VISIBLE);

                        fourth_text.setText(getResources().getString(R.string.volume));
                        fifth_text.setText(getResources().getString(R.string.rad));


                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public String setResultforCylinder() {

        Cylinder cylinder = new Cylinder();
        String output = null;
        double y = Double.parseDouble(fourth_edit.getText().toString());
        double z = Double.parseDouble(fifth_edit.getText().toString());
        if (fourth_edit != null && fifth_edit != null) {
            switch (spinner_count) {
                case 0:
                    output = cylinder.getArea(y, z);
                    break;
                case 1:
                    output = cylinder.getVolume(y, z);
                    break;
                case 2:
                    output = cylinder.getResultByd(y);
                    break;
                case 3:
                    output = cylinder.getResultByr(y);
                    break;
                case 4:
                    output = cylinder.getResultByvr(y, z);
                    break;

            }


        } else {
            output = "please Enter Value";
        }
        return output;

    }

    /*====================================== Prism ===========================================*/
    private void setActivityforPrism() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bprism);
        text_main.setText(R.string.all_val);
        third_text.setText(getResources().getString(R.string.length));
        fourth_text.setText(getResources().getString(R.string.height));
        fifth_text.setText(getResources().getString(R.string.width));
        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.prism_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 0:
                        spinner_count = 0;
                        third_text.setText(getResources().getString(R.string.length));
                        fourth_text.setText(getResources().getString(R.string.width));
                        fifth_text.setText(getResources().getString(R.string.height));
                        break;
                    case 1:
                        spinner_count = 1;
                        third_text.setText(getResources().getString(R.string.length));
                        fourth_text.setText(getResources().getString(R.string.width));
                        fifth_text.setText(getResources().getString(R.string.height));
                        break;


                    case 2:
                        spinner_count = 2;
                        third_text.setText(getResources().getString(R.string.length));
                        fourth_text.setText(getResources().getString(R.string.height));
                        fifth_text.setText(getResources().getString(R.string.volume));
                        break;
                    case 3:
                        spinner_count = 3;
                        third_text.setText(getResources().getString(R.string.width));
                        fourth_text.setText(getResources().getString(R.string.height));
                        fifth_text.setText(getResources().getString(R.string.volume));
                        break;
                    case 4:
                        spinner_count = 4;
                        third_text.setText(getResources().getString(R.string.length));
                        fourth_text.setText(getResources().getString(R.string.width));
                        fifth_text.setText(getResources().getString(R.string.volume));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    public String setResultforPrism() {

        Prism prism = new Prism();
        String output = null;
        double x = Double.parseDouble(third_edit.getText().toString());
        double y = Double.parseDouble(fourth_edit.getText().toString());
        double z = Double.parseDouble(fifth_edit.getText().toString());
        if (third_edit != null && fourth_edit != null && fifth_edit != null) {
            switch (spinner_count) {
                case 0:
                    output = prism.getArea(x, y, z);
                    break;
                case 1:
                    output = prism.getVolume(x, y, z);
                    break;
                case 2:
                    output = prism.getwidth(x, z, y);
                    break;
                case 3:
                    output = prism.getLength(x, z, y);
                    break;
                case 4:
                    output = prism.getHeight(x, y, z);
                    break;

            }


        } else {
            output = "please Enter Value";
        }
        return output;

    }


    /*====================================== Hemisphere ===========================================*/
    private void setActivityforHemisphere() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        fourth_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bhemisphere);
        text_main.setText(R.string.input_value);
        fifth_text.setText(getResources().getString(R.string.rad));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.hemisphere_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        spinner_count = 0;
                        fifth_text.setText(getResources().getString(R.string.rad));

                        break;

                    case 1:
                        spinner_count = 1;
                        fifth_text.setText(getResources().getString(R.string.rad));

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public String setResultforHemisphere() {

        HemiSphere hemiSphere = new HemiSphere();
        String output = null;
        double x = Double.parseDouble(fifth_edit.getText().toString());


        if (fifth_edit != null) {
            switch (spinner_count) {
                case 0:
                    output = hemiSphere.getResultByRadius(x);
                    break;
                case 1:
                    output = hemiSphere.getResultByRadius(x);
                    break;
            }


        } else {
            output = "please Enter Value";
        }
        return output;

    }


    /*======================================Pentagon===========================================*/

    private void setActivityforPetagon() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bpentagon);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);

    }



    public void setResultforPetagon() {
        double x;
        String data,output;
        Pentagon pentagon=new Pentagon();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =pentagon.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+pentagon.getPeri());
                    fifth_edit.setText(""+pentagon.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =pentagon.getResultByPeri(x);
                    res.setText(output);
                    third_edit.setText(""+pentagon.getAr());
                    fifth_edit.setText(""+pentagon.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =pentagon.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+pentagon.getAr());
                    fourth_edit.setText(""+pentagon.getPeri());

                }
                break;

        }

    }

    /*======================================Tetrahedron===========================================*/

    private void setActivityforTetraHedron() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.btetrahedron);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.volume));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);

    }


    public void setResultforTetraHedron() {
        double x;
        String data,output;
       Tetrahedron tetrahedron= new Tetrahedron();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =tetrahedron.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+tetrahedron.getV());
                    fifth_edit.setText(""+tetrahedron.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =tetrahedron.getResultByVolume(x);
                    res.setText(output);
                    third_edit.setText(""+tetrahedron.getAr());
                    fifth_edit.setText(""+tetrahedron.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =tetrahedron.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+tetrahedron.getAr());
                    fourth_edit.setText(""+tetrahedron.getV());

                }
                break;

        }

    }





    /*======================================Sphere===========================================*/


    private void setActivityforSphere() {

        first_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bsphere);
        text_main.setText(R.string.one_val);
        second_text.setText(getResources().getString(R.string.area));
        third_text.setText(getResources().getString(R.string.volume));
        fourth_text.setText(getResources().getString(R.string.rad));
        fifth_text.setText(getResources().getString(R.string.dia));
        spinner_text.setVisibility(View.GONE);

    }

    public void setResultforSphere() {
        double x;
        String data,output;
        Sphere sphere = new Sphere();
        switch (count)
        {

            case 2:
                data = second_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =sphere.getResultByArea(x);
                    res.setText(output);
                    third_edit.setText(""+sphere.getV());
                    fourth_edit.setText(""+sphere.getR());
                    fifth_edit.setText(""+sphere.getD());

                }

                break;
            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =sphere.getResultByVolume(x);
                    res.setText(output);
                    second_edit.setText(""+sphere.getAr());
                    fourth_edit.setText(""+sphere.getR());
                    fifth_edit.setText(""+sphere.getD());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =sphere.getResultByRadius(x);
                    res.setText(output);
                    second_edit.setText(""+sphere.getAr());
                    third_edit.setText(""+sphere.getV());
                    fifth_edit.setText(""+sphere.getD());

                }
                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =sphere.getResultByDiameter(x);
                    res.setText(output);
                    second_edit.setText(""+sphere.getAr());
                    third_edit.setText(""+sphere.getV());
                    fourth_edit.setText(""+sphere.getR());

                }
                break;

        }

    }
    /*======================================Octahedron===========================================*/

    private void setActivityforOctahedron() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.boctahedron);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.volume));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);

    }



    public void setResultforOctahedron() {
        double x;
        String data,output;
        Octahedron octahedron=new Octahedron();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =octahedron.getResultByar(x);
                    res.setText(output);
                    fourth_edit.setText(""+octahedron.getV());
                    fifth_edit.setText(""+octahedron.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =octahedron.getResultByv(x);
                    res.setText(output);
                    third_edit.setText(""+octahedron.getAr());
                    fifth_edit.setText(""+octahedron.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =octahedron.getResultBya(x);
                    res.setText(output);

                    third_edit.setText(""+octahedron.getAr());
                    fourth_edit.setText(""+octahedron.getV());

                }
                break;

        }

    }





    /*======================================Icosahedron===========================================*/

    private void setActivityforIcosahedron() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bicosahedron);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.volume));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);
    }

    public void setResultforIcosahedron() {
        double x;
        String data,output;
        Icosahedron icosahedron = new Icosahedron();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =icosahedron.getResultByar(x);
                    res.setText(output);
                    fourth_edit.setText(""+icosahedron.getV());
                    fifth_edit.setText(""+icosahedron.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =icosahedron.getResultByv(x);
                    res.setText(output);
                    third_edit.setText(""+icosahedron.getAr());
                    fifth_edit.setText(""+icosahedron.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =icosahedron.getResultBya(x);
                    res.setText(output);

                    third_edit.setText(""+icosahedron.getAr());
                    fourth_edit.setText(""+icosahedron.getV());

                }
                break;

        }

    }


    /*======================================Ellipsoid===========================================*/
    private void setActivityforEllipsoid() {
        image.setImageResource(R.drawable.bellipsoid);
        first_text.setText(R.string.all_val);
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_text.setText(getResources().getString(R.string.axis_a));
        fourth_text.setText(getResources().getString(R.string.axis_b));
        fifth_text.setText(getResources().getString(R.string.axis_c));


        image.setImageResource(R.drawable.bellipsoid);
        text_main.setText(getResources().getString(R.string.all_val));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.ellipsoid_spinner)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                third_text.setText(getResources().getString(R.string.axis_a));
                fourth_text.setText(getResources().getString(R.string.axis_b));
                fifth_text.setText(getResources().getString(R.string.axis_c));
                switch (i) {
                    case 0:
                        spinner_count = 0;
                        break;

                    case 1:
                        spinner_count = 1;

                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public String setResultforEllipsoid() {

        Ellipsoid ellipsoid= new Ellipsoid();
        String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        double z = Double.parseDouble(fifth_edit.getText().toString());

        if (third_edit!=null&& fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:
                    output = ellipsoid.getResultForArea(x,y,z);

                    break;
                case 1:
                    output = ellipsoid.getResultForVolume(x,y,z);
                    break;


            }


        } else {
            output = "Please Enter Value";
        }

        return output;
    }







    /*======================================Dodecahedron===========================================*/

    private void setActivityforDodecahedron() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bdodecahedron);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.volume));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);
    }


    public void setResultforDodecahedron() {
        double x;
        String data,output;
        Dodecahedron dodecahedron=new Dodecahedron();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =dodecahedron.getResultByar(x);
                    res.setText(output);
                    fourth_edit.setText(""+dodecahedron.getV());
                    fifth_edit.setText(""+dodecahedron.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =dodecahedron.getResultByv(x);
                    res.setText(output);
                    third_edit.setText(""+dodecahedron.getAr());
                    fifth_edit.setText(""+dodecahedron.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =dodecahedron.getResultBya(x);
                    res.setText(output);

                    third_edit.setText(""+dodecahedron.getAr());
                    fourth_edit.setText(""+dodecahedron.getV());

                }
                break;

        }

    }






    /*======================================Cube===========================================*/

    private void setActivityforCube() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bcube);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.volume));
        fifth_text.setText(getResources().getString(R.string.sidea));

        spinner_text.setVisibility(View.GONE);

    }

    public void setResultforcube() {
        double x;
        String data,output;
        Cube cube =new Cube();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =cube.getResultByar(x);
                    res.setText(output);
                    fourth_edit.setText(""+cube.getV());
                    fifth_edit.setText(""+cube.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =cube.getResultByv(x);
                    res.setText(output);
                    third_edit.setText(""+cube.getAr());
                    fifth_edit.setText(""+cube.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =cube.getResultBya(x);
                    res.setText(output);

                    third_edit.setText(""+cube.getAr());
                    fourth_edit.setText(""+cube.getV());

                }
                break;

        }

    }








    /*======================================Square===========================================*/

    private void setActivityforSquare() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bsquare);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));

        spinner_text.setVisibility(View.GONE);

    }

    public void setResultforSquare() {
        double x;
        String data,output;
        Square square=new Square();
        switch (count)
        {

            case 3:
                data = third_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =square.getResultByArea(x);
                    res.setText(output);
                    fourth_edit.setText(""+square.getPeri());
                    fifth_edit.setText(""+square.getA());

                }

                break;
            case 4:
                data = fourth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =square.getResultByPerimeter(x);
                    res.setText(output);
                    third_edit.setText(""+square.getAr());
                    fifth_edit.setText(""+square.getA());

                }

                break;
            case 5:
                data = fifth_edit.getText().toString();
                if(data!=null) {
                    x = Double.parseDouble(data);
                    output =square.getResultBySide(x);
                    res.setText(output);

                    third_edit.setText(""+square.getAr());
                    fourth_edit.setText(""+square.getPeri());

                }
                break;

        }

    }








    /*======================================Rhombus===========================================*/

    private void setActivityforRhombus() {


        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        first_text.setText(R.string.all_val);
        image.setImageResource(R.drawable.brhombus);
        text_main.setText(getResources().getString(R.string.all_val));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.rhombus_spinner)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    fourth_text.setText(getResources().getString(R.string.diagp));
                    fifth_text.setText(getResources().getString(R.string.diagq));
                    switch (i) {
                    case 0:
                        spinner_count = 0;
                        fourth_text.setText(getResources().getString(R.string.diagp));
                        fifth_text.setText(getResources().getString(R.string.diagq));
                        break;

                    case 1:
                        spinner_count = 1;
                        fourth_text.setText(getResources().getString(R.string.diagp));
                        fifth_text.setText(getResources().getString(R.string.diagq));

                        break;
                    case 2:
                        spinner_count = 2;
                        third_linear.setVisibility(View.VISIBLE);
                        third_text.setText(getResources().getString(R.string.diagp));
                        fourth_text.setText(getResources().getString(R.string.diagq));
                        fifth_text.setText(getResources().getString(R.string.sidea));
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public String setResultforRhombus() {

        Rhombus rhombus= new Rhombus();
        String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        if (fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:
                    output = rhombus.getResultforArea(x, y);

                    break;
                case 1:
                    output = rhombus.getResultforPerim(x, y);
                    break;
                case 2:
                    output = rhombus.getResultforAlpha(x, y);
                    break;

            }


        } else {
            output = "Please Enter Value";
        }

        return output;
    }





    /*======================================Regular polygon===========================================*/
    private void setActivityforRegular() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        first_text.setText(R.string.all_val);
        image.setImageResource(R.drawable.breguler);
        text_main.setText(getResources().getString(R.string.input_value));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.regular_polygon_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                fourth_text.setText(getResources().getString(R.string.sidea));
                fifth_text.setText(getResources().getString(R.string.number_edge));
                switch (i) {
                    case 0:
                        spinner_count = 0;
                        fourth_text.setText(getResources().getString(R.string.sidea));
                        fifth_text.setText(getResources().getString(R.string.number_edge));
                        break;

                    case 1:
                        spinner_count = 1;
                        fourth_text.setText(getResources().getString(R.string.sidea));
                        fifth_text.setText(getResources().getString(R.string.number_edge));

                        break;
                    case 2:
                        spinner_count = 2;
                        fourth_text.setText(getResources().getString(R.string.perimeter));
                        fifth_text.setText(getResources().getString(R.string.sidea));
                        break;

                    case 3:
                        spinner_count = 3;
                        fourth_text.setText(getResources().getString(R.string.perimeter));
                        fifth_text.setText(getResources().getString(R.string.number_edge));
                        break;

                    case 4:
                        spinner_count = 4;
                        fourth_text.setText(getResources().getString(R.string.perimeter));
                        fifth_text.setText(getResources().getString(R.string.sidea));
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public String setResultforRegular() {

        RegularPolygon regular = new RegularPolygon();
        String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        if (fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:
                    output = regular.getAreaByan(x, y);

                    break;
                case 1:
                    output = regular.getAreaByan(x, y);
                    break;
                case 2:
                    output = regular.getAngleBypa(x, y);
                    break;
                case 3:
                    output = regular.getSideBypn(x, y);
                    break;
                case 4:
                    output = regular.getAngleBypa(x, y);
                    break;


            }


        } else {
            output = "Please Enter Value";
        }

        return output;
    }
    /*======================================Rectangle===========================================*/

    private void setActivityforRectangle() {


        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bellipse);
        text_main.setText(getResources().getString(R.string.all_val));

        fourth_text.setText(getResources().getString(R.string.sidea));
        fifth_text.setText(getResources().getString(R.string.sideb));
        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.rectangle_spinner)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:

                        spinner_count = 0;


                        break;
                    case 1:

                        spinner_count = 1;


                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    public String setResultforRectangle() {

        Rectangle rectangle=new Rectangle();
        String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        if (fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:


                    output = rectangle.getResultforArea(x, y);

                    break;

                case 1:


                    output = rectangle.getResultforPerim(x, y);

                    break;



            }


        } else

        {
            output = "Please Enter Value";
        }

        return output;
    }







/*++++++++++++++++++++++++++++++++++++++End+++++++++++++++++++=================================*/
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.first_edit:
               setInputFromDialog(1);


                break;
            case R.id.second_edit:
                setInputFromDialog(2);

                break;
            case R.id.third_edit:
                setInputFromDialog(3);
                break;
            case R.id.fourth_edit:
                setInputFromDialog(4);
                break;
            case R.id.fifth_edit:
                setInputFromDialog(5);
                break;



        }

    }

    public void setInputFromDialog(int count)
    {
        InputDialogBox dialogBox = new InputDialogBox();
        dialogBox.show(getSupportFragmentManager(),"");
        this.count =count;
    }

    @Override
    public void outText(String out) {

        switch (count)
        {
            case 1:
                first_edit.setText(out);
                break;
            case 2:
                second_edit.setText(out);
                break;
            case 3:
                third_edit.setText(out);
                break;
            case 4:
                fourth_edit.setText(out);
                break;
            case 5:
                fifth_edit.setText(out);
                break;
        }

        setAutoSetResult();

    }


    public void setAutoSetResult()
    {
        switch (type_opr)
        {
            case "Circle":
                setResultforCircle();
                break;
            case "Decagon":
                setResultforDecagon();
                break;
            case "Hexagon":
                setResultforHexagon();
                break;
            case "Heptagon":
                setResultforHeptagon();
                break;
            case "Octagon":
                setResultforOctagon();
                break;
            case "Petagon":
                setResultforPetagon();
                break;
            case "Nonagon":
                setResultforNonagon();
                break;
            case "Equilateral":
                setResultforEquilateral();
                break;
            case "Square":
                setResultforSquare();
                break;
            case"Cube":
                setResultforcube();
                break;
            case "Dodecahedron":
                setResultforDodecahedron();
                break;
            case"Icosahedron":
                setResultforIcosahedron();
                break;

            case"Octahedron":
                setResultforOctahedron();
                break;
            case"Sphere":
                setResultforSphere();
                break;
            case"TetraHedron":
                setResultforTetraHedron();
                break;

        }
    }
}








