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

        setSupportActionBar(toolbar);
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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        res = findViewById(R.id.res_geo_opr);

        type_opr = getIntent().getExtras().getString(getResources().getString(R.string.intent_key));
        setView();

        first_edit.setOnClickListener(this);
        second_edit.setOnClickListener(this);
        third_edit.setOnClickListener(this);
        fourth_edit.setOnClickListener(this);
        fifth_edit.setOnClickListener(this);
        setResultforCircle();
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

                    case "Tetrahedron":

                        break;

                    case "Sphere":

                        break;

                    case "Prism":
                        res.setText(setResultforPrism());

                        break;

                    case "Octahedron":

                        break;

                    case "Icosahedron":

                        break;

                    case "Ellipsoid":

                        break;

                    case "Dodecahedron":

                        break;
                    case "Cylinder":
                        res.setText(setResultforCylinder());
                        break;

                    case "Cube":

                        break;

                    case "Cone":
                        res.setText(setResultforCone());

                        break;

                    case "Square":

                        break;

                    case "Rhombus":

                        break;

                    case "Regular Polygon":
                     res.setText(setResultforRegular());
                        break;

                    case "Rectangle":

                        break;

                    case "Pentagon":

                        break;



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
                setActivityforEquilateralTriangle();
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

            case "Tetrahedron":
                setActivityfortetrahedron();
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

            case "Pentagon":
                setActivityforPentagon();
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
    public void setActivityforEquilateralTriangle() {

        fifth_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bequilateral);
        spinner_text.setVisibility(View.GONE);
        getSupportActionBar().setTitle(type_opr);
        text_main.setText(getResources().getString(R.string.one_val));
        first_text.setText(getResources().getString(R.string.area));
        second_text.setText(getResources().getString(R.string.perimeter));
        third_text.setText(getResources().getString(R.string.sidea));
        fourth_text.setText(getResources().getString(R.string.height));


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
        spinner_text.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bellipse);
        text_main.setText(getResources().getString(R.string.two_val));

        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.diap));
        fifth_text.setText(getResources().getString(R.string.diaq));
    }

    private void setResultForEclipse()
    {
        if(count==3)
        {

        }

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

    private void setActivityforPentagon() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.bpentagon);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
    }
    /*======================================Tetrahedron===========================================*/

    private void setActivityfortetrahedron() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.btetrahedron);
        text_main.setText(R.string.one_val);
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.volume));
        fifth_text.setText(getResources().getString(R.string.sidea));
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
    }

    /*======================================Ellipsoid===========================================*/
    private void setActivityforEllipsoid() {
        image.setImageResource(R.drawable.bellipsoid);
        text_main.setText(R.string.three_val);
        first_text.setText(getResources().getString(R.string.area));
        second_text.setText(getResources().getString(R.string.volume));
        third_text.setText(getResources().getString(R.string.axis_a));
        fourth_text.setText(getResources().getString(R.string.axis_b));
        fifth_text.setText(getResources().getString(R.string.axis_c));
    }

    private void setResultforEllipsoid()
    {



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
    }
    /*======================================Rhombus===========================================*/

    private void setActivityforRhombus() {

    }

    /*======================================Regular polygon===========================================*/
    private void setActivityforRegular() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        first_text.setText(R.string.one_val);
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

    }

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
        }
    }
}








