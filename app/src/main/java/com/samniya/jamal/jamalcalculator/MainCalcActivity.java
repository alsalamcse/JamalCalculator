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
    private Button button7;
    private EditText etnumber1;
    private EditText etnumber2;
    private EditText etfinishnumber;
    private TextView unknown;
    private TextView result;
}


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
        button7=(Button)findViewById(R.id.button7);
        etnumber1=(EditText)findViewById(R.id.etnumber1);
        etnumber2=(EditText)findViewById(R.id.etnumber2);
        etfinishnumber=(EditText)findViewById(R.id.etfinishnumber);
        unknown=(TextView)findViewById(R.id.unknown);
        result=(TextView)findViewById(R.id.result);
        btnminos.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btnplus.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
