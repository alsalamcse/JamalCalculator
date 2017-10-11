package com.samniya.jamal.jamalcalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnplus;
    private Button btnminos;
    private Button button3;
    private Button button4;
    private Button btneq;
    private Button butoon6;
    private Button btnclear;
    private EditText etnumber1;
    private EditText etnumber2;
    private EditText etfinishnumber;
    private TextView tvunknown;
    private TextView tvresult;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        btnplus=(Button)findViewById(R.id.btnplus);
        btnminos=(Button)findViewById(R.id.btnminos);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        btneq=(Button)findViewById(R.id.btneq);
        btneq=(Button)findViewById(R.id.button6);
        btnclear=(Button)findViewById(R.id.btnClear);
        etnumber1=(EditText)findViewById(R.id.etnumber1);
        etnumber2=(EditText)findViewById(R.id.etnumber2);
        etfinishnumber=(EditText)findViewById(R.id.etfinishnumber);
        tvunknown=(TextView)findViewById(R.id.unknown);
        tvresult=(TextView)findViewById(R.id.result);
        btnminos.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        btneq.setOnClickListener(this);
        butoon6.setOnClickListener(this);
        btnclear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
      String stNum1=etnumber1.getText().toString();
        double num1=Double.parseDouble(stNum1);
        String stNum2=etnumber2.getText().toString();
        double num2=Double.parseDouble(stNum2);
        String stNum3=etfinishnumber.getText().toString();
        double num3=Double.parseDouble(stNum3);
        if(view==btnplus);
        {
            tvunknown.setText("+");

        }
        if (view==btnminos);
        {
            tvunknown.setText("-");

        }
        if(view==button3);
        {
            tvunknown.setText(":");

        }
        if(view==button4);
        {
            tvunknown.setText("x");

        }
        if(view==btneq);
        {
            String unknown=tvunknown.getText().toString();
            double res=0;
            switch (unknown)
            {
                case"+":
                    res=num1+num2;
                    etfinishnumber.setText(res+"");
                    break;
                case"-":
                    res=num1-num2;
                    etfinishnumber.setText(res+"");
                    break;
                case"x":
                    res=num1*num2;
                    etfinishnumber.setText(res+"");


            }




        }
        if(view==butoon6);
        {
            tvunknown.setText("^");

        }
        if(view==btnclear);
        {
            etnumber1.setText("");
            etnumber2.setText("");
            etfinishnumber.setText("");
            tvunknown.setText("?");

        }


    }
}
