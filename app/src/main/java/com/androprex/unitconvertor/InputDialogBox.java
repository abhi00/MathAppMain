package com.androprex.unitconvertor;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;

public class InputDialogBox extends AppCompatDialogFragment implements View.OnClickListener
{

    TextView m_input;
    Button m_one,m_two,m_three,m_four,m_five,m_six,m_seven,m_eight,m_nine,m_zero,m_point,m_right,m_del;
    String result_data;
    private String output;
    InputDialogListner listner;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.input_dialog,null);
        builder.setView(view).setTitle("Input");
        m_input=view.findViewById(R.id.text_input_ED);
        m_one=view.findViewById(R.id.one_BTN);
        m_two=view.findViewById(R.id.two_BTN);
        m_three=view.findViewById(R.id.three_BTN);
        m_four=view.findViewById(R.id.four_BTN);
        m_five=view.findViewById(R.id.fifth_BTN);
        m_six=view.findViewById(R.id.six_BTN);
        m_seven=view.findViewById(R.id.seven_BTN);
        m_eight=view.findViewById(R.id.eight_BTN);
        m_nine=view.findViewById(R.id.nine_BTN);
        m_point=view.findViewById(R.id.point_BTN);
        m_right=view.findViewById(R.id.tick_BTN);
        m_zero=view.findViewById(R.id.zero_BTN);
        m_del=view.findViewById(R.id.delete_BTN);

        m_one.setOnClickListener(this);
        m_two.setOnClickListener(this);
        m_three.setOnClickListener(this);
        m_four.setOnClickListener(this);
        m_five.setOnClickListener(this);
        m_six.setOnClickListener(this);
        m_seven.setOnClickListener(this);
        m_eight.setOnClickListener(this);
        m_nine.setOnClickListener(this);
        m_zero.setOnClickListener(this);
        m_point.setOnClickListener(this);
        m_right.setOnClickListener(this);
        m_del.setOnClickListener(this);
return builder.create();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.one_BTN:
                m_input.setText(m_input.getText()+"1");
                break;

            case R.id.two_BTN:
                m_input.setText(m_input.getText()+"2");
                break;

            case R.id.three_BTN:
                m_input.setText(m_input.getText()+"3");
                break;

            case R.id.four_BTN:
                m_input.setText(m_input.getText()+"4");
                break;

            case R.id.fifth_BTN:
                m_input.setText(m_input.getText()+"5");
                break;

            case R.id.six_BTN:
                m_input.setText(m_input.getText()+"6");
                break;

            case R.id.seven_BTN:
                m_input.setText(m_input.getText()+"7");
                break;

            case R.id.eight_BTN:
                m_input.setText(m_input.getText()+"8");
                break;

            case R.id.nine_BTN:
                m_input.setText(m_input.getText()+"9");
                break;

            case R.id.zero_BTN:
                m_input.setText(m_input.getText()+"0");
                break;

            case R.id.point_BTN:
                m_input.setText(m_input.getText()+".");
                break;

            case R.id.delete_BTN:

                String data=  m_input.getText().toString();
                if(data!=null)
                {
                    String update_data =  remove(data);
                    m_input.setText(update_data);
                }
                break;

            case R.id.tick_BTN:

                if (m_input != null) {
                   listner.outText(m_input.getText().toString());
                }
                dismiss();
        }

    }

    public String remove(String data)
    {
        String s1 = "";
        for(int i=0;i<data.length()-1;i++){
            s1 = s1+data.charAt(i);
        }
        return s1;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            listner = (InputDialogListner) context;
        }
        catch (Exception e)
        {
           throw new ClassCastException(context.toString()+" Must implement InputDialogListener");
        }
    }



    public interface  InputDialogListner{
        public  void outText(String out);
    }
}
