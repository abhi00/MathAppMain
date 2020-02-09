
package com.androprex.unitconvertor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements DiscreteScrollView.OnItemChangedListener {

    Toolbar toolbar;
    TextView m_textdialog1;
   TextView m_textdialog2;
    TextView m_dialog1, m_dialog2;

    DiscreteScrollView scrollView;
    private InfiniteScrollAdapter infiniteAdapter;
    LengthAdapter lengthAdapter;

    ListView m_listview;
    InputDialogBox inputDialog;
    int position;

    String[] unitLength, DescLength;
    String[] unitArea, DescArea;
    String[] unitWeight, DescWeight;
    String[] unitTempreture, DescTempreture;
    String[] unitTime, DescTime;
    String[] unitVolume, DescVolume;

    ListDialog listDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_listview = findViewById(R.id.listview_LV);
        m_dialog1 = findViewById(R.id.dialog1_TV);
        m_dialog2 = findViewById(R.id.dialog2_TV);

        m_textdialog1 = findViewById(R.id.text_dialog1_TV);
        m_textdialog2 = findViewById(R.id.text_dilog2_TV);

        toolbar = findViewById(R.id.toolbar2);
        scrollView = findViewById(R.id.picker);
        setSupportActionBar(toolbar);
        unitLength = getResources().getStringArray(R.array.mm_L);
        DescLength = getResources().getStringArray(R.array.cm_L);
        unitArea = getResources().getStringArray(R.array.mm_A);
        DescArea = getResources().getStringArray(R.array.cm_A);
        unitWeight = getResources().getStringArray(R.array.mm_w);
        DescWeight = getResources().getStringArray(R.array.cm_w);
        unitTempreture = getResources().getStringArray(R.array.mm_Tp);
        DescTempreture = getResources().getStringArray(R.array.cm_Tp);
        unitTime = getResources().getStringArray(R.array.mm_T);
        DescTime = getResources().getStringArray(R.array.cm_T);
        unitVolume = getResources().getStringArray(R.array.mm_Vl);
        DescVolume = getResources().getStringArray(R.array.cm_Vl);

        scrollView.setOrientation(DSVOrientation.HORIZONTAL); //Sets an orientation of the view
        scrollView.addOnItemChangedListener(this);
        infiniteAdapter = InfiniteScrollAdapter.wrap(new MyAdapter(getResources().getStringArray(R.array.unit_converter), this));
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
       position = infiniteAdapter.getRealPosition(i);




        }






    public ArrayList<Double> geLenght(int position,double input) {
        ArrayList<Double> arrayList = new ArrayList<>();
        double meter = 0;
        double kilometer = 0;
        double centimeter = 0;
        double milimter = 0;
        double micrometer = 0;
        double hectometer = 0;
        double nanometer = 0;
        double mile = 0;
        double inch = 0;
        double centiinch = 0;
        double microinch = 0;
        double feet=0;


        switch (position) {

            case 0:
                meter= input;
                kilometer = input *0.001;
                centimeter = input * 100;
                milimter = input * 1000;
                micrometer = input * 1000000;
                hectometer = input * 0.01;
                nanometer=input*1000000000;
                mile=input*0.000621371192;
                inch=input*39.3700787;
                centiinch=input*3937.007874;
                microinch=input*39370078.74;
                feet=input*3.2808399;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 1:
                meter= input*1000;
                kilometer = input;
                centimeter = input * 100000;
                milimter = input * 1000000;
                micrometer = input * 1000000000;
                hectometer = input * 10;
                nanometer=input*10000000.00000;
                mile=input*0.621371192;
                inch=input*39370.0787;
                centiinch=input*3937007.8740158;
                microinch=input*39370078740.157;
                feet=input*3280.8399;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;


            case 2:
                meter= input*0.01;
                kilometer = 0.00001;
                centimeter = input ;
                milimter = input * 10;
                micrometer = input * 10000;
                hectometer = input * 0.001;
                nanometer=input*10000000;
                mile=input*0.0000062137;
                inch=input*0.393700787;
                centiinch=input*39.37007874;
                microinch=input*393700.7874;
                feet=input*0.032808399;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 3:
                meter= input*0.001;
                kilometer = inch*0.000001;
                centimeter = input* 0.1 ;
                milimter = input;
                micrometer = input * 1000;
                hectometer = input * 0.00001;
                nanometer=input*1000000;
                mile=input*0.9999999999;
                inch=input*0.0393700787;
                centiinch=input*3.937007874;
                microinch=input*39370.07874;
                feet=input*0.0032808399;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 4:

                meter= input*0.000001;
                kilometer = inch* 0.000000001;
                centimeter = input* 0.0001 ;
                milimter = input*0.001;
                micrometer = input ;
                hectometer = input * 0.00000001;
                nanometer=input*1000;
                mile=input* 0.0000000006213711922;
                inch=input*0.0000393701;
                centiinch=input*0.0039370079;
                microinch=input*39.37007874;
                feet=input*0.0000032808;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;
            case 5:
                meter= input*100;
                kilometer = inch*0.1 ;
                centimeter = input*1000;
                milimter = input*100000;
                micrometer = input*100000000 ;
                hectometer = input;
                nanometer=input*10000000.0000;
                mile=input*0.0621371192 ;
                inch=input*3937.00787;
                centiinch=input*393700.7874;
                microinch=input*3937007874.0157;
                feet=input*328.08399;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 6:
                meter= input*0.0000000010;
                kilometer = inch* 0.000000000001;
                centimeter = input* 0.0000001;
                milimter = input*0.000001;
                micrometer = input*0.001 ;
                hectometer = input* 0.00000000001;
                nanometer=input;
                mile=input* 0.0000000000006213711922;
                inch=input* 0.00000003937007874;
                centiinch=input*0.000003937;
                microinch=input*0.0393700787;
                feet=input*6076.11549;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;


            case 7:
                meter= input*1609.344;
                kilometer = inch*1.609344;
                centimeter = input*160934.4;
                milimter = input*1609344;
                micrometer = input*1609344000;
                hectometer = input*16.09344 ;
                nanometer=input *1609344000;
                mile=input;
                inch=input * 63360;
                centiinch=input*6336000;
                microinch=input*633600000;
                feet=input*5280;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 8:
                meter= input*0.0254;
                kilometer = inch*0.0000254 ;
                centimeter = input*2.54;
                milimter = input*25.4;
                micrometer = input*25400;
                hectometer = input*0.000254;
                nanometer=input*25400000;
                mile=input *0.0000157828;
                inch=input;
                centiinch=input*100;
                microinch=input*1000000;
                feet=input*0.0833333333;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 9:
                meter= input*0.000254;
                kilometer = inch* 0.0000002539999999;
                centimeter = input*0.0254;
                milimter = input*0.254;
                micrometer = input*254 ;
                hectometer = input*0.00000254 ;
                nanometer=input * 254000;
                mile=input* 0.0000001578282828;
                inch=input *0.01 ;
                centiinch=input;
                microinch=input*393700.7874;
                feet=input*0.0008333333;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 10:
                meter= input* 0.0000000254;
                kilometer = inch* 0.0000000000254;
                centimeter = input*0.00000254 ;
                milimter = input*0.0000254;
                micrometer = input*0.0254 ;
                hectometer = input* 0.000000000254;
                nanometer=input *25.4 ;
                mile=input* 0.00000000001578282828;
                inch=input *0.000001 ;
                centiinch=input*0.0001;
                microinch=input;
                feet=input* 0.00000008333333333;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;

            case 11:
                meter= input*0.3048;
                kilometer = inch*0.0003048 ;
                centimeter = input*30.48;
                milimter = input*304.8;
                micrometer = input*304800 ;
                hectometer = input*0.003048 ;
                nanometer=input*304800000 ;
                mile=input* 0.000189393939;
                inch=input *12;
                centiinch=input*1200;
                microinch=input*12000000;
                feet=input;
                arrayList.add(meter);
                arrayList.add(kilometer);
                arrayList.add(centimeter);
                arrayList.add(milimter);
                arrayList.add(micrometer);
                arrayList.add(hectometer);
                arrayList.add(nanometer);
                arrayList.add(mile);
                arrayList.add(inch);
                arrayList.add(centiinch);
                arrayList.add(microinch);
                arrayList.add(feet);
                break;
        }
        return arrayList;
    }



    public ArrayList<Double> getArea(int pos, double input) {
        ArrayList<Double> arrayList = new ArrayList<>();
        double squaremilimeter = 0;
        double squarecentimter = 0;
        double squareinch = 0;
        double squarefeet = 0;
        double  squareyard= 0;
        double squaremeters = 0;
        double acres= 0;
        double  hectores= 0;
        double squarekilometer = 0;

        switch (pos) {

            case 0:
                squaremilimeter = input;
                squarecentimter = input *0.01;
                squareinch = input *0.0016 ;
                squarefeet = input *0.0 ;
                squareyard = input *0.0 ;
                squaremeters =input *0.0 ;
                acres =input*0.0;
                hectores  =input*0.0;
                squarekilometer =input*0.0;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 1:
                squaremilimeter = input *100;
                squarecentimter = input;
                squareinch = input * 0.155;
                squarefeet = input * 0.001076;
                squareyard = input *0.0011 ;
                squaremeters =input *0.0001 ;
                acres =input*2.47105e-8;
                hectores  =input*1e-0;
                squarekilometer =input*1e-10;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 2:
                squaremilimeter = input*645.16;
                squarecentimter = input *6.4516;
                squareinch = input;
                squarefeet = input *0.0069 ;
                squareyard = input * 0.0007;
                squaremeters =input *0.00064 ;
                acres =input*1.5942e-7;
                hectores  =input*6.4516e-8;
                squarekilometer =input*6.4516e-108;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 3:
                squaremilimeter = input * 92903;
                squarecentimter = input *929.0304;
                squareinch = input * 144;
                squarefeet = input;
                squareyard = input * 0.11;
                squaremeters =input *0.09 ;
                acres =input*2.29568e-5;
                hectores  =input*9.2903e-6;
                squarekilometer =input*9.2903e-8;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 4:
                squaremilimeter = input *83617;
                squarecentimter = input *8361.2736;
                squareinch = input * 1296;
                squarefeet = input *9;
                squareyard = input;
                squaremeters =input * 0.836;
                acres =input*0.0;
                hectores  =input*8.36127e-5;
                squarekilometer =input*8.36127e-7;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 5:
                squaremilimeter = input *1000000;
                squarecentimter = input *10000;
                squareinch = input * 1550.0;
                squarefeet = input * 10.7639;
                squareyard = input *1.195 ;
                squaremeters =input;
                acres =input*0.000247;
                hectores  =input*0.0001;
                squarekilometer =input*1e-6;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 6:
                squaremilimeter = input *4.047e+9 ;
                squarecentimter = input *40468564.2;
                squareinch = input *6.273+6 ;
                squarefeet = input * 435.60;
                squareyard = input * 4840;
                squaremeters =input * 4046.86;
                acres =input;
                hectores  =input*0.404;
                squarekilometer =input*0.00405;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 7:
                squaremilimeter = input *1e+10;
                squarecentimter = input *100000000;
                squareinch = input *1.55e+7 ;
                squarefeet = input * 107639;
                squareyard = input *11959.9 ;
                squaremeters =input *10000 ;
                acres =input*2.47105;
                hectores  =input;
                squarekilometer =input*0.01;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

            case 8:
                squaremilimeter = input *1e-12;
                squarecentimter = input *1e-10;
                squareinch = input *0.155;
                squarefeet = input *10763910.417;
                squareyard = input *1195990.046301 ;
                squaremeters =input *1000000 ;
                acres =input*247.105381;
                hectores  =input *100;
                squarekilometer =input;

                arrayList.add(squaremilimeter);
                arrayList.add(squarecentimter);
                arrayList.add(squareinch);
                arrayList.add(squarefeet);
                arrayList.add(squareyard);
                arrayList.add(squaremeters);
                arrayList.add(acres);
                arrayList.add(hectores);
                arrayList.add(squarekilometer);
                break;

        }
        return arrayList;
    }


    public ArrayList<Double> getWeight(int position, double input) {
        ArrayList<Double> arrayList = new ArrayList<>();
        double gram = 0;
        double miligram = 0;
        double microgram = 0;
        double kilogram = 0;
        double centigram = 0;
        double pound = 0;
        double carat = 0;
        double ounce = 0;
        double stone = 0;
        double kiloton =0;
        double quintal = 0;


        switch (position) {

            case 0:
                gram= input;
                miligram = input *1000;
                microgram = input * 1000000;
                kilogram = input * 0.001;
                centigram = input * 100.0;
                pound = input * 0.0022;
                carat=input*5.0;
                ounce=input*0.0353;
                stone=input*0.000157473044;
                kiloton=input*0.0;
                quintal=input*0.0;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 1:
                gram= input *0.001 ;
                miligram = input;
                microgram = input * 1000;
                kilogram = input *0.000001 ;
                centigram = input * 0.1;
                pound = input * 0.0000022046;
                carat=input * 0.005;
                ounce=input * 0.000035274;
                stone=input *1.57473044 ;
                kiloton=input *1e-12 ;
                quintal=input *1.E-8 ;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 2:
                gram= input * 0.000001;
                miligram = input * 0.001;
                microgram = input;
                kilogram = input * 1.E-9;
                centigram = input *0.0001 ;
                pound = input *2.204622621E-9 ;
                carat=input * 0.000005 ;
                ounce=input *3.527396194E-8 ;
                stone=input *1.57473044 ;
                kiloton=input * 1.00000000000e-15;
                quintal=input * 1.E-11;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 3:
                gram= input *1000 ;
                miligram = input *1000000;
                microgram = input * 1000000000;
                kilogram = input  ;
                centigram = input *100000 ;
                pound = input * 2.20462262;
                carat=input * 5000;
                ounce=input *35.2739619 ;
                stone=input *0.157473044 ;
                kiloton=input *0.000001 ;
                quintal=input * 0.01;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 4:
                gram= input *0.01 ;
                miligram = input *10;
                microgram = input *10000 ;
                kilogram = input *0.00001 ;
                centigram = input;
                pound = input *0.0000220462 ;
                carat=input * 0.05;
                ounce=input *0.000352739619 ;
                stone=input *0.0000017637 ;
                kiloton=input * 1.E-11;
                quintal=input * 1.E-7;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 5:
                gram= input * 453.59237;
                miligram = input *453592.37 ;
                microgram = input *453592370 ;
                kilogram = input *0.45359237 ;
                centigram = input *45359.237 ;
                pound = input;
                carat=input * 2267.96185;
                ounce=input * 16;
                stone=input *0.0714285714 ;
                kiloton=input *4.535923699E-7 ;
                quintal=input * 0.0045359237;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 6:
                gram= input *0.2 ;
                miligram = input *200 ;
                microgram = input *200000 ;
                kilogram = input * 0.0002 ;
                centigram = input * 20 ;
                pound = input * 0.000440924524;
                carat=input;
                ounce=input * 0.00705479239 ;
                stone=input *3.14946089 ;
                kiloton=input * 2.E-10;
                quintal=input * 0.000002;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 7:
                gram= input *28.3495231 ;
                miligram = input * 28349.52;
                microgram = input *28349523.125 ;
                kilogram = input *0.0283495231 ;
                centigram = input *2834.95231 ;
                pound = input *0.0625 ;
                carat=input * 141.747616;
                ounce=input;
                stone=input *0.00446428571 ;
                kiloton=input * 2.834952312E-8;
                quintal=input *0.0002834952 ;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;


            case 8:
                gram= input *6350.29318 ;
                miligram = input *6350293.18;
                microgram = input *635029318;
                kilogram = input * 6.35029318;
                centigram = input * 635029.318;
                pound = input * 14 ;
                carat=input * 31751.4659;
                ounce=input * 224;
                stone=input;
                kiloton=input * 0.0000056699;
                quintal=input *0.0635029318 ;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;


            case 9:
                gram= input *1000000000 ;
                miligram = input *1000000000.000;
                microgram = input *1000000000.000000;
                kilogram = input *1000000 ;
                centigram = input * 10000000.0000;
                pound = input * 2204622.6218 ;
                carat=input * 50000000.00;
                ounce=input *35273961.95 ;
                stone=input*157473.04442;
                kiloton=input;
                quintal=input * 10000;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;

            case 10:
                gram= input *100000 ;
                miligram = input *100000000;
                microgram = input *100000000.000;
                kilogram = input * 100;
                centigram = input *10000000 ;
                pound = input * 220.46226218 ;
                carat=input * 500000;
                ounce=input *3527.396195 ;
                stone=input*17.636980975;
                kiloton=input*0.0012;
                quintal=input;

                arrayList.add(gram);
                arrayList.add(miligram);
                arrayList.add(microgram);
                arrayList.add(kilogram);
                arrayList.add(centigram);
                arrayList.add(pound);
                arrayList.add(carat);
                arrayList.add(ounce);
                arrayList.add(stone);
                arrayList.add(kilogram);
                arrayList.add(quintal);
                break;
        }
        return arrayList;
    }


    public ArrayList<Double> getTemp(int position, double input) {
        ArrayList<Double> arrayList = new ArrayList<>();
        double celsius = 0;
        double farenheit = 0;
        double kelvin = 0;
        double rankine = 0;

        switch (position) {

            case 0:
                celsius= input;
                farenheit = input *33.8;
                kelvin = input * 274.15;
                rankine = input * 493.47;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

            case 1:
                celsius= input * -17.22;
                farenheit = input ;
                kelvin = input * 255.928;
                rankine = input * 460.67 ;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

            case 2:
                celsius= input * -27345 ;
                farenheit = input * -457.9;
                kelvin = input ;
                rankine = input * 0 ;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

            case 3:
                celsius= input * -272.6;
                farenheit = input * -458.67;
                kelvin = input * 0.556 ;
                rankine = input ;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

        }
        return arrayList;
    }


    public ArrayList<Double> getTime(int position, double input) {
        ArrayList<Double> arrayList = new ArrayList<>();
        double attosecond = 0;
        double picosecond = 0;
        double nanosecond = 0;
        double microsecond = 0;
        double second = 0;
        double minute = 0;
        double Hour = 0;
        double Day = 0;
        double Week = 0;
        double Year = 0;
        double fornight=0;
        double calenderyear = 0;
        double solaryear=0;


        switch (position) {

            case 0:
                attosecond= input;
                picosecond = input *0.0;
                nanosecond = input * 0.0;
                microsecond = input * 0.0;
                second = input * 0.0;
                minute=input * 0.0;
                Hour=input*0.0;
                Day=input*0.0;
                Week=input*0.0;
                Year=input*1.0E-4;
                fornight=input*0.0;
                calenderyear=input*0.0;
                solaryear=input*1.0E-4;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 1:
                attosecond= input * 1000000;
                picosecond = input;
                nanosecond = input * 0.001;
                microsecond = input * 0.000001;
                second = input *1.E-12 ;
                minute=input * 1.666666666E-14;
                Hour=input*2.777777777E-16;
                Day=input*1.157407407E-17;
                Week=input*1.653439153E-18;
                Year=input*3.170979198E-20;
                fornight=input*8.267195767E-19;
                calenderyear=input*3.170979198E-20;
                solaryear=input*3.170979198E-20;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 2:
                attosecond= input * 1000000000;
                picosecond = input * 1000;
                nanosecond = input;
                microsecond = input * 0.001;
                second = input * 1e-9;
                minute=input * 1.666666666667e-11;
                Hour=input*2.777777777778e-13;
                Day=input*1.157407407407e-14;
                Week=input*1.653439153438e-15;
                Year=input*3.170979198374e-17;
                fornight=input*8.267195767189e-16;
                calenderyear=input*3.1688087814e-17;
                solaryear=input*3.168753601131e-17;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 3:
                attosecond= input * 10000000000.00;
                picosecond = input *1000000 ;
                nanosecond = input *1000 ;
                microsecond = input;
                second = input * 0.000001;
                minute=input * 1.666666666667e-8;
                Hour=input*2.777777777775e-10;
                Day=input*1.157407407406e-11;
                Week=input*1.653439153437e-12;
                Year=input*3.170979198372e-14;
                fornight=input*8.267195767184e-13;
                calenderyear=input*3.168808781398e-14;
                solaryear=input*3.168753601129e-14;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 4:
                attosecond= input * 1e+18;
                picosecond = input *10000000000.00 ;
                nanosecond = input * 1000000000;
                microsecond = input *1000000;
                second = input;
                minute=input * 0.01666666666667;
                Hour=input*0.0002777777777778;
                Day=input*0.00001157407407407;
                Week=input*0.000001653439153438;
                Year=input*3.170979198376e-8;
                fornight=input*8.267195767196e-7;
                calenderyear=input*3.168808781403e-8;
                solaryear=input*3.168753601134e-8;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 5:
                attosecond= input * 6e+19;
                picosecond = input *6e+13;
                nanosecond = input * 60000000.000;
                microsecond = input *60000000;
                second = input *60 ;
                minute=input;
                Hour=input*0.01666666666667;
                Day=input*0.0006944444444444;
                Week=input*0.00009920634920634;
                Year=input*0.000001902587519026;
                fornight=input*0.00004960317460317;
                calenderyear=input*0.000001901285268842;
                solaryear=input*0.00000190125216068;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 6:
                attosecond= input * 3.6e+21;
                picosecond = input *3.6e+15;
                nanosecond = input *3.6e+12 ;
                microsecond = input *3600000.000;
                second = input *3600;
                minute=input * 60;
                Hour=input;
                Day=input*0.04166666666667;
                Week=input*0.005952380952381;
                Year=input*0.0001141552511416;
                fornight=input*0.00297619047619;
                calenderyear=input*0.0001140771161305;
                solaryear=input*0.0001140751296408;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 7:
                attosecond= input * 8.64e+22;
                picosecond = input *8.64e+16;
                nanosecond = input * 8.64e+13;
                microsecond = input *864000000.00;
                second = input * 86400;
                minute=input *1440 ;
                Hour=input*24;
                Day=input;
                Week=input*0.1428571428571;
                Year=input*0.002739726027397;
                fornight=input*0.07142857142857;
                calenderyear=input*0.002737850787132;
                solaryear=input*0.00273780311138;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 8:
                attosecond= input * 6.048e+23;
                picosecond = input *6.048e+17;
                nanosecond = input * 6.048e+14;
                microsecond = input *60480000.0000;
                second = input *604800 ;
                minute=input *10080 ;
                Hour=input*168;
                Day=input*7;
                Week=input;
                Year=input*0.01917808219178;
                fornight=input*0.5;
                calenderyear=input*0.01916495550992;
                solaryear=input*0.01916462177966;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 9:
                attosecond= input * 3.1536e+25;
                picosecond = input *3.1536e+19;
                nanosecond = input *3.1536e+16 ;
                microsecond = input *3.1536e+13;
                second = input *31536000 ;
                minute=input * 525600;
                Hour=input*8760;
                Day=input*365;
                Week=input*52.14285714286;
                Year=input;
                fornight=input*26.07142857143;
                calenderyear=input*0.9993155373032;
                solaryear=input*0.9992981356536;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 10:
                attosecond= input * 1.2096e+24;
                picosecond = input *1.2096e+18;
                nanosecond = input *1.2096e+15 ;
                microsecond = input *1.2096e+12;
                second = input * 1209600;
                minute=input *20160 ;
                Hour=input*336;
                Day=input*14;
                Week=input*2;
                Year=input*0.03835616438356;
                fornight=input;
                calenderyear=input*0.03832991101985;
                solaryear=input*0.03832924355932;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 11:
                attosecond= input * 3.15576e+25;
                picosecond = input *3.15576e+19;
                nanosecond = input *3.15576e+16 ;
                microsecond = input *3.15576e+13;
                second = input * 31557600;
                minute=input *525960 ;
                Hour=input*8766;
                Day=input*365.25;
                Week=input*52.17857142857;
                Year=input*1.000684931507;
                fornight=input*26.08928571429;
                calenderyear=input;
                solaryear=input*0.9999825864315;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

            case 12:
                attosecond= input * 3.155814954e+25;
                picosecond = input *3.155814954e+19;
                nanosecond = input *3.155814954e+16 ;
                microsecond = input *3.155814954e+13;
                second = input * 31558149.54;
                minute=input *525969.159;
                Hour=input*8766.15265;
                Day=input*365.2563604167;
                Week=input*52.17948005952;
                Year=input*1.000702357306;
                fornight=input*26.08974002976;
                calenderyear=input *1.000017413872;
                solaryear=input;
                arrayList.add(attosecond);
                arrayList.add(picosecond);
                arrayList.add(nanosecond);
                arrayList.add(microsecond);
                arrayList.add(second);
                arrayList.add(minute);
                arrayList.add(Hour);
                arrayList.add(Day);
                arrayList.add(Hour);
                arrayList.add(Week);
                arrayList.add(Year);
                arrayList.add(fornight);
                arrayList.add(calenderyear);
                arrayList.add(solaryear);
                break;

        }
        return arrayList;
    }


    public ArrayList<Double> getVolume(int position, double input) {
        ArrayList<Double> arrayList = new ArrayList<>();
        double celsius = 0;
        double farenheit = 0;
        double kelvin = 0;
        double rankine = 0;

        switch (position) {

            case 0:
                celsius= input;
                farenheit = input *33.8;
                kelvin = input * 274.15;
                rankine = input * 493.47;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

            case 1:
                celsius= input * -17.22;
                farenheit = input ;
                kelvin = input * 255.928;
                rankine = input * 460.67 ;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

            case 2:
                celsius= input * -27345 ;
                farenheit = input * -457.9;
                kelvin = input ;
                rankine = input * 0 ;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

            case 3:
                celsius= input * -272.6;
                farenheit = input * -458.67;
                kelvin = input * 0.556 ;
                rankine = input ;
                arrayList.add(celsius);
                arrayList.add(farenheit);
                arrayList.add(kelvin);
                arrayList.add(rankine);
                break;

        }
        return arrayList;
    }
}
