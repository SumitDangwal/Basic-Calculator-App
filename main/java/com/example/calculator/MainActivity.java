package com.example.calculator;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv;
    Button ba;
    Button bs;
    Button bm;
    Button bd;
    Button bc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.num1);
        et2=findViewById(R.id.num2);
        tv=findViewById(R.id.res);
        ba=findViewById(R.id.btadd);
        bs=findViewById(R.id.btsub);
        bm=findViewById(R.id.btmul);
        bd=findViewById(R.id.btdiv);
        bc=findViewById(R.id.clr);

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et1.getText().length()>0)&&(et2.getText().length()>0))
                {
                double eet1=Double.parseDouble(et1.getText().toString());
                double eet2=Double.parseDouble(et2.getText().toString());
                double result=eet1+eet2;
                tv.setText(Double.toString(result));
                }
                else
                {
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et1.getText().length()>0)&&(et2.getText().length()>0))
                {
                    double eet1=Double.parseDouble(et1.getText().toString());
                    double eet2=Double.parseDouble(et2.getText().toString());
                    double result=eet1-eet2;
                    tv.setText(Double.toString(result));
                }
                else
                {
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et1.getText().length()>0)&&(et2.getText().length()>0))
                {
                    double eet1=Double.parseDouble(et1.getText().toString());
                    double eet2=Double.parseDouble(et2.getText().toString());
                    double result=eet1*eet2;
                    tv.setText(Double.toString(result));
                }
                else
                {
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et1.getText().length()>0)&&(et2.getText().length()>0))
                {
                    double eet1=Double.parseDouble(et1.getText().toString());
                    double eet2=Double.parseDouble(et2.getText().toString());
                    double result=eet1/eet2;
                    tv.setText(Double.toString(result));
                }
                else
                {
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
                et2.setText("");
                tv.setText("0.00");
                et1.requestFocus();
            }
        });
    }
}