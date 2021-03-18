package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_num1, edt_num2;
    Button btn_add, btn_sub, btn_mul, btn_div;
    TextView txv_result, txv_refresh;

    float result;
    float num1, num2;

    Icon_Manager icon_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
        setIconPack();
    }

    private void setControl() {
        edt_num1 = (EditText)findViewById(R.id.edt_num1);
        edt_num2 = (EditText)findViewById(R.id.edt_num2);

        btn_add = (Button)findViewById(R.id.btn_add);
        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_mul = (Button)findViewById(R.id.btn_mul);
        btn_div = (Button)findViewById(R.id.btn_div);

        txv_result = (TextView)findViewById(R.id.txv_result);
        txv_refresh = (TextView)findViewById(R.id.txv_refresh);
    }

    private void setEvent() {
        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edt_num1.getText().length() > 0 && edt_num2.getText().length() > 0){
                    num1 = Float.parseFloat(edt_num1.getText().toString());
                    num2 = Float.parseFloat(edt_num2.getText().toString());
                    result = num1 + num2;
                    txv_result.setText(String.valueOf(result));
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edt_num1.getText().length() > 0 && edt_num2.getText().length() > 0){
                    num1 = Float.parseFloat(edt_num1.getText().toString());
                    num2 = Float.parseFloat(edt_num2.getText().toString());
                    result = num1 - num2;
                    txv_result.setText(String.valueOf(result));
                }
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edt_num1.getText().length() > 0 && edt_num2.getText().length() > 0) {
                    num1 = Float.parseFloat(edt_num1.getText().toString());
                    num2 = Float.parseFloat(edt_num2.getText().toString());
                    result = num1 * num2;
                    txv_result.setText(String.valueOf(result));
                }
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edt_num1.getText().length() > 0 && edt_num2.getText().length() > 0) {
                    num1 = Float.parseFloat(edt_num1.getText().toString());
                    num2 = Float.parseFloat(edt_num2.getText().toString());
                    result = num1 / num2;
                    txv_result.setText(String.valueOf(result));
                }
            }
        });

        txv_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_num1.setText("");
                edt_num2.setText("");
                txv_result.setText("");
            }
        });
    }

    private void setIconPack() {
        icon_manager = new Icon_Manager();
        ((TextView)findViewById(R.id.txv_refresh)).setTypeface(icon_manager.get_icons("fonts/fa-brands-400.ttf",this));
        ((TextView)findViewById(R.id.txv_refresh)).setTypeface(icon_manager.get_icons("fonts/fa-brands-400.ttf",this));
        ((TextView)findViewById(R.id.txv_refresh)).setTypeface(icon_manager.get_icons("fonts/fa-solid-900.ttf",this));
    }
}