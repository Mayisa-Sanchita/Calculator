package com.example.calculator4;

import android.nfc.Tag;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_zero,button_one,button_two,button_three,button_four,
            button_five, button_six, button_seven,button_eight,button_nine,button_point,button_equal,
            button_plus,button_minus,button_mul,button_div;
    TextView input,output;
    String v1,v2,op="+",memory="";
    Boolean flag=false,flageq=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_functions();
        init_listeners();

    }

    private void init_listeners() {
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"0");
                else {
                    input.setText("0");
                    flag=false;
                }
            }
        });
        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"1");
                else {
                    input.setText("1");
                    flag=false;
                }
            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"2");
                else {
                    input.setText("2");
                    flag=false;

                }
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"3");
                else {
                    input.setText("3");
                    flag=false;

                }
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"4");
                else {
                    input.setText("4");
                    flag=false;

                }
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"5");
                else {
                    input.setText("5");
                    flag=false;

                }
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"6");
                else {
                    input.setText("6");
                    flag=false;

                }
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"7");
                else {
                    input.setText("7");
                    flag=false;

                }
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"8");
                else {
                    input.setText("8");
                    flag=false;

                }
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+"9");
                else {
                    input.setText("9");
                    flag=false;

                }
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag)
                    input.setText(input.getText()+".");
                else {
                    input.setText(".");
                    flag=false;
                }
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    v1=input.getText().toString().trim();

                op="+";
                input.setText("");
                output.setText(v1+"+");
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    v1=input.getText().toString().trim();

                op="-";
                input.setText("");
                output.setText(v1+"-");
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    v1=input.getText().toString().trim();

                op="x";
                input.setText("");
                output.setText(v1+"x");
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    v1=input.getText().toString().trim();
                op="/";
                output.setText(v1+"/");
                input.setText("");
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp;
                Double d1,d2;
                tmp=v1;
                v2=input.getText().toString().trim();
                d1=Double.parseDouble(v1);
                d2=Double.parseDouble(v2);
                if(op=="+"){
                    d1=d1+d2;
                    v1=d1.toString();
                }
                else if(op=="-"){
                    d1=d1+d2;
                    v1=d1.toString();
                }
                else if(op=="*"){
                    d1=d1+d2;
                    v1=d1.toString();
                }
                else if(op=="/"){
                    d1=d1+d2;
                    v1=d1.toString();
                }

                input.setText(tmp+op+v2);
                output.setText("="+v1);
                op="+";
                v2="";
                flag=true;
            }
        });

    }

    private String calculate(String v2) {
        Double result=0.0 ,op1=0.0,op2=0.0;
        if(v1!="") op1=Double.parseDouble(v1);
        if(v2!="") op2=Double.parseDouble(v2);
        Log.i("OP2",op2.toString());
        Log.i("Value",v1+","+v2);
        switch (op){
            case "+" : result=op1+op2;
                break;
            case  "-": result=op1-op2;
                break;
            case  "x": result=op1*op2;
                break;
            case  "/": result=op1/op2;
                break;
            default: result=op1;
                break;
        }
        flag=false;
        if(result-result.intValue()>0)
            return result.toString();
        else return String.valueOf(result.intValue());

    }


    private void init_functions() {
    }


    private void init_variables() {
        v1="";
        v2="";
        op="+";
        flag=false;
        output.setText("");
        input.setText("");
    }

    private void init_views() {
        button_zero=(Button)findViewById(R.id.b0);
        button_point=(Button)findViewById(R.id.bpoint);
        button_equal=(Button)findViewById(R.id.bequal);
        button_one=(Button)findViewById(R.id.b1);
        button_two=(Button)findViewById(R.id.b2);
        button_three=(Button)findViewById(R.id.b3);
        button_plus=(Button)findViewById(R.id.bplus);
        button_four=(Button)findViewById(R.id.b4);
        button_five=(Button)findViewById(R.id.b5);
        button_six=(Button)findViewById(R.id.b6);
        button_minus=(Button)findViewById(R.id.bminus);
        button_seven=(Button)findViewById(R.id.b7);
        button_eight=(Button)findViewById(R.id.b8);
        button_nine=(Button)findViewById(R.id.b9);
        button_mul=(Button)findViewById(R.id.bmul);
        button_div=(Button)findViewById(R.id.bdiv);
        input=(TextView) findViewById(R.id.tv1);
        output=(TextView)findViewById(R.id.tv2);
    }
}

