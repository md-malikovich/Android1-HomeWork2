package com.example.calculatorpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunctionActivity extends AppCompatActivity {

    static final String MY_KEY3 = "name_key";

    TextView num1Text;
    TextView num2Text;

    Button btnAdd, btnSub, btnMulti, btnDiv;
    //Button btnEqual;

    int Val1, Val2;

    boolean addition, subtract, multiplication, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        num1Text = findViewById(R.id.num1_text);
        num2Text = findViewById(R.id.num2_text);

        final Intent intent = getIntent();

        final String fNum = intent.getStringExtra(MainActivity.MY_KEY1);
        num1Text.setText(fNum);

        final String sNum = intent.getStringExtra(MainActivity.MY_KEY2);
        num2Text.setText(sNum);

        btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fNum != null) {
                    if (sNum != null) {
                        String result;
                        result = fNum + sNum;

                        //= Integer.parseInt(fNum + "");
                        //Val1 = Integer.parseInt(fNum.getText() + "");
                        //Val2 = Integer.parseInt(num2Text.getText() + "");
                        addition = true;

                        Intent intent = new Intent(FunctionActivity.this, EqualActivity.class);
                        intent.putExtra(MY_KEY3, result);
                        startActivity(intent);

                        //editText.setText(null);
                    }

                }
            }
        });

/*        btnSub = findViewById(R.id.btn_sub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Val1 = Integer.parseInt(editText.getText() + ""); // определяем значение первого числа и сохраняем в переменной
                subtract = true;
                editText.setText(null); // обнуляем значение editText, т.к. будем вводить второе число
            }
        });


        btnMulti = findViewById(R.id.btn_multi);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Val1 = Integer.parseInt(editText.getText() + "");
                multiplication = true;
                editText.setText(null);
            }
        });


        btnDiv = findViewById(R.id.btn_div);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Val1 = Integer.parseInt(editText.getText() + "");
                division = true;
                editText.setText(null);
            }
        }); */

        //btnEqual = findViewById(R.id.btn_equal);
        //btnEqual.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Intent intent = new Intent();
                // отправить данные в след активити

                //Val2 = Integer.parseInt(editText.getText() + ""); // определяем значение второго числа и сохраняем в переменной

                /*if (addition == true) {
                    //editText.setText(Val1 + Val2 + "");

                    int result = Val1 + Val2;
                    result = Integer.parseInt(Val1.getText() + "");

                            getText().toString();


                    num1.setText(result);


                    Int x = Val1 + Val2;
                    Intent intent = new Intent(FunctionActivity.this, EqualActivity.class);
                    intent.putExtra(MY_KEY2, x);
                    startActivity(intent);
                    addition = false;
                } */



                /*if (subtract == true) {
                    editText.setText(Val1 - Val2 + "");
                    subtract = false;
                }

                if (multiplication == true) {
                    editText.setText(Val1 * Val2 + "");
                    multiplication = false;
                }

                if (division == true) {
                    editText.setText(Val1 / Val2 + "");
                    division = false;
                }*/
            //}
        //});

    }
}