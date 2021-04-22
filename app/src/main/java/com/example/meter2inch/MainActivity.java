package com.example.meter2inch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* 1 m = 39.3701 in*/

    private EditText Input;
    private Button ConvertBtn;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input = (EditText) findViewById(R.id.input);
        ConvertBtn = (Button) findViewById(R.id.convert);
        Result = (TextView) findViewById(R.id.result);

        ConvertBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    double multiplier = 39.3701;
                    double result = 0.0;

                    double value = Double.parseDouble(Input.getText().toString());
                    result=value*multiplier;

                    Result.setText(Double.toString(result) + "inches.");
            }
        });
    }
}