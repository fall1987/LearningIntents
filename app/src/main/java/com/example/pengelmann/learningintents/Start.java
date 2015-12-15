package com.example.pengelmann.learningintents;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    Button submit = null;
    EditText input = null;
    TextView output = null;
    Button change = null;
    RadioGroup colorGroup = null;
    RadioButton colorButton = null;
    RadioGroup fontGroup = null;
    RadioButton fontButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = (EditText) findViewById(R.id.editableTest);
                output = (TextView) findViewById(R.id.result);

                output.setText(input.getText().toString());

            }
        });




    }

}
