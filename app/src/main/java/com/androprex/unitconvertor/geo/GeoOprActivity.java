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


import com.androprex.unitconvertor.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GeoOprActivity extends AppCompatActivity {

    Toolbar toolbar;
    Spinner spinner_text;
    LinearLayout first_linear,second_linear,third_linear,fourth_linear,fifth_linear;
    TextView first_text,second_text,third_text,fourth_text,fifth_text ,res,text_main;
    ImageView image;
    EditText first_edit,second_edit,third_edit,fourth_edit,fifth_edit;
    String type_opr;
    int spinner_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_opr);
        toolbar = findViewById(R.id.toolbar_opr_geo);

        setSupportActionBar(toolbar);

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

       type_opr = getIntent().getExtras().getString(getResources().getString(R.string.intent_key));
        setView();
        FloatingActionButton fab = findViewById(R.id.fab);

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
                  case"Parallelogram":
                      res.setText(setResultforParallelogram());
                      break;
                  case"Circle Sector":
                      res.setText(setResultforCircleSector());
                      break;
              }

            }
        });


    }


    public void setView()
    {

        switch(type_opr)
        {

            case "Isosceles":
                setActivityforIsosceles();
                break;

            case "Right TriAngle":
                setActivityforRightTriangle();
                break;

            case "Equilateral":
                setActivityforEquilateralTriangle();
                break;
            case"Decagon":
                setActivityforDecagon();
                break;
            case"Eclipse":
                setActivityforEclipse();
                break;
            case"Heptagon":
                setActivityforHeptagon();
                break;
            case"Hexagon":
                setActivityforHexagon();
                break;
            case"Circle Sector":
                setActivityforCircleSector();
            break;

            case"Distance between points":
                setActivityforDistancebetweenpoints();
                break;
            case"Mid-Point of line":
                setActivityforMidPointofline();
                break;

            case"Slop of line":
                setActivityforSlopOfline();
                break;

            case"Nonagon":
                setActivityforNonagon();
                break;

            case"Octagon":
                setActivityforOctagon();
                break;

            case"Parallelogram":
                setActivityforParallelogram();
                break;
            case"Circle":
                setActivityforCircle();
                break;

        }




    }



    private void setActivityforMidPointofline() {
    }

    private void setActivityforDistancebetweenpoints() {
    }











    public void setActivityforIsosceles()
    {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        fifth_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.isosceles);
        third_text.setText(getResources().getString(R.string.sideb));
        fourth_text.setText(getResources().getString(R.string.height));
        spinner_text.setAdapter(new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.isosceles_triangle_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                third_text.setText(getResources().getString(R.string.baseb));
                fourth_text.setText(getResources().getString(R.string.height));
                switch (i)
                {
                    case 0:
                        third_text.setText(getResources().getString(R.string.baseb));
                        fourth_text.setText(getResources().getString(R.string.height));

                        spinner_count =0;


                        break;
                    case 1:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.baseb));
                        spinner_count =1;
                        break;
                    case 2:

                        third_text.setText(getResources().getString(R.string.baseb));
                        fourth_text.setText(getResources().getString(R.string.height));
                        spinner_count =2;

                        break;
                    case 3:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.height));
                        spinner_count =3;
                        break;
                    case 4:

                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.baseb));
                        spinner_count =4;
                        break;
                    case 5:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.height));
                        spinner_count =5;
                        break;
                    case 6:
                        third_text.setText(getResources().getString(R.string.area));
                        fourth_text.setText(getResources().getString(R.string.sidea));
                        spinner_count =6;
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

                    output = triangle.getBaseByah(x,y);

                    break;
                case 4:
                    output = triangle.getHeightByab(x,y);
                    break;
                case 5:
                    output = triangle.getAngleByah(x,y);
                    break;

                case 6:
                    output = triangle.getAngleByara(x,y);
                    break;
            }


        }
        else
        {
         output = "Please Enter Value";
        }

        return output;
    }




    /*-------------------------------------------Right Triangle------------------------------------------*/




    public void setActivityforRightTriangle() {
        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        fifth_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.isosceles);
        third_text.setText(getResources().getString(R.string.sidea));
        fourth_text.setText(getResources().getString(R.string.sideb));
        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.right_triangle_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sideb));


                        spinner_count =0;


                        break;
                    case 1:
                        third_text.setText(getResources().getString(R.string.sideb));
                        fourth_text.setText(getResources().getString(R.string.sidec));

                        spinner_count =1;
                        break;
                    case 2:


                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sidec));
                        spinner_count =2;

                        break;
                    case 3:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sideb));
                        spinner_count =3;
                        break;
                    case 4:
                        third_text.setText(getResources().getString(R.string.sidea));
                        fourth_text.setText(getResources().getString(R.string.sidec));
                        spinner_count =4;
                        break;
                    case 5:
                        third_text.setText(getResources().getString(R.string.sideb));
                        fourth_text.setText(getResources().getString(R.string.sidec));
                        spinner_count =5;
                        break;

                }

            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }



    public String setResultforRightAngle() {

        RightTringle triangle  = new RightTringle();

        String output = null;

        double x = Double.parseDouble(third_edit.getText().toString());

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

                    output = triangle.getSideC(x,y);

                    break;
                case 4:
                    output = triangle.getAlpha(x,y);
                    break;
                case 5:
                    output = triangle.getBeta(x,y);
                    break;


            }


        }
        else
        {
            output = "Please Enter Value";
        }

        return output;
    }




/*====================================== Equilateral ===========================================*/
public void setActivityforEquilateralTriangle() {

    fifth_linear.setVisibility(View.GONE);
    image.setImageResource(R.drawable.equilateral);
    spinner_text.setVisibility(View.GONE);
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
        image.setImageResource(R.drawable.parallelogram);
        text_main.setText(getResources().getString(R.string.all_val));
        fourth_text.setText(getResources().getString(R.string.sideb));
        fifth_text.setText(getResources().getString(R.string.height));
        spinner_text.setAdapter(new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.parallelogram_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        fourth_text.setText(getResources().getString(R.string.sideb));
                        fifth_text.setText(getResources().getString(R.string.height));


                        spinner_count =0;


                        break;
                    case 1:
                        fourth_text.setText(getResources().getString(R.string.sidea));
                        fifth_text.setText(getResources().getString(R.string.sideb));
                        spinner_count =1;
                        break;
                    case 2:

                        fourth_text.setText(getResources().getString(R.string.perimeter));
                        fifth_text.setText(getResources().getString(R.string.sideb));
                        spinner_count =2;

                        break;
                    case 3:

                        fourth_text.setText(getResources().getString(R.string.area));
                        fifth_text.setText(getResources().getString(R.string.height));
                        spinner_count =3;
                        break;
                    case 4:

                        fourth_text.setText(getResources().getString(R.string.height));
                        fifth_text.setText(getResources().getString(R.string.sidea));
                        spinner_count =4;
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


                    output = triangle.getResultBybh(x,y);

                    break;
                case 1:

                    output = triangle.getResultByab(x, y);

                    break;
                case 2:

                    output = triangle.getResultBypb(x, y);

                    break;
                case 3:

                    output = triangle.getResultByha(x,y);

                    break;
                case 4:
                    output = triangle.getResultByarh(x,y);

            }


        }
        else
        {
            output = "Please Enter Value";
        }

        return output;
    }





    /*====================================== Octagon ===========================================*/

    private void setActivityforOctagon() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);

        image.setImageResource(R.drawable.parallelogram);
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

        image.setImageResource(R.drawable.parallelogram);
        text_main.setText(getResources().getString(R.string.one_val));
        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.perimeter));
        fifth_text.setText(getResources().getString(R.string.sidea));
        spinner_text.setVisibility(View.GONE);

    }


    private void setActivityforHeptagon() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);

        image.setImageResource(R.drawable.parallelogram);
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

        image.setImageResource(R.drawable.parallelogram);
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

        image.setImageResource(R.drawable.parallelogram);
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
        image.setImageResource(R.drawable.circlesector);
        text_main.setText(getResources().getString(R.string.all_val));

        spinner_text.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.circle_sector_spinner_text)));
        spinner_text.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fourth_text.setText(getResources().getString(R.string.rad));
                fifth_text.setText(getResources().getString(R.string.angle));
                switch (position)
                {
                    case 0:

                        spinner_count =0;
                        break;
                    case 1:

                        spinner_count =1;
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public String setResultforCircleSector() {

        CircleSector triangle= new CircleSector();
                String output = null;

        double x = Double.parseDouble(fourth_edit.getText().toString());

        double y = Double.parseDouble(fifth_edit.getText().toString());

        if (fourth_edit != null && fifth_edit != null) {

            switch (spinner_count) {
                case 0:
                    output = triangle.getResultByralpha(x,y);

                    break;
                case 1:
                    output = triangle.getResultByal(x, y);
                    break;


            }


        }
        else
        {
            output = "Please Enter Value";
        }

        return output;
    }


    /*====================================== circle ===========================================*/


    private void setActivityforCircle() {

        first_linear.setVisibility(View.GONE);
        spinner_text.setVisibility(View.GONE);
        image.setImageResource(R.drawable.circle);
        text_main.setText(getResources().getString(R.string.one_val));

        second_text.setText(getResources().getString(R.string.area));
        third_text.setText(getResources().getString(R.string.circ));
        fourth_text.setText(getResources().getString(R.string.dia));
        fifth_text.setText(getResources().getString(R.string.rad));


    }
    public void setResultforCircle() {

        second_text.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                

                return false;
            }
        });

    }




    /*======================================Ellipse ===========================================*/



    private void setActivityforEclipse() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        spinner_text.setVisibility(View.GONE);
        image.setImageResource(R.drawable.circle);
        text_main.setText(getResources().getString(R.string.two_val));

        third_text.setText(getResources().getString(R.string.area));
        fourth_text.setText(getResources().getString(R.string.diap));
        fifth_text.setText(getResources().getString(R.string.diaq));
    }


    /*======================================slop of line  ===========================================*/
    private void setActivityforSlopOfline() {

        first_linear.setVisibility(View.GONE);
        second_linear.setVisibility(View.GONE);
        third_linear.setVisibility(View.GONE);
        image.setImageResource(R.drawable.equilateral);
        spinner_text.setVisibility(View.GONE);
        text_main.setText(getResources().getString(R.string.point_val));
        fourth_text.setText(getResources().getString(R.string.point1));
        fourth_text.setText(getResources().getString(R.string.point2));
    }






}


