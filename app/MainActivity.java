package nyc.c4q.homework06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //instantating fields for buttons:
    private Button button00;
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;
    private Button button07;
    private Button button08;
    private Button button09;
    private Button button_PLUS;
    private Button button_MINUS;
    private Button button_MULTIPLY;
    private Button button_DIVIDE;
    private Button button_EXPONENT;
    private Button button_SQRT;
    private Button button_CLEAR;
    private BUtton button_EQUAL;
    private Button button_PAR1;
    private Button button_PAR2;
    private Button button_PERCENT;
    private Button button_SIN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        .setUpButtons();
    }

    //.setUpButtons(): allows us to access the functions in XML :
    private void setUpButtons(){
    button00 = (Button)findViewById(R.id.button00);
    button01 = (Button)findViewById(R.id.button01);
    button02 = (Button)findViewById(R.id.button02);
    button03 = (Button)findViewById(R.id.button03);
    button04 = (Button)findViewById(R.id.button04);
    button05 = (Button)findViewById(R.id.button05);
    button06 = (Button)findViewById(R.id.button06);
    button07 = (Button)findViewById(R.id.button07);
    button08 = (Button)findViewById(R.id.button08);
    button09 = (Button)findViewById(R.id.button09);
    button_PLUS = (Button)findViewById(R.id.plus);
    button_MINUS = (Button)findViewById(R.id.minus);
    button_DIVIDE = (Button)findViewById(R.id.divide);
    button_MULTIPLY = (Button)findViewById(R.id.mult);
    button_CLEAR = (Button)findViewById(R.id.button_clear);
    button_EXPONENT = (Button)findViewById(R.id.button_exp);
    button_PAR1 = (Button)findViewById(R.id.par1);
    button_PAR2 = (Button)findViewById(R.id.par2);
    button_SIN = (Button)findViewById(R.id.button_sin);
    button_SQRT = (Button)findViewById(R.id.button_sqrt);
    button_EQUAL = (Button)findViewById(R.id.button_equal);
    // button_PERCENT = (Button)findViewById(R.id.button_percent);
    }

    // .OnClick(): method that allows our buttons to perform certain operations once clicked on.
    private void onClickMethod(){
        //button 0-9 onClick() :
         button00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + “0");
            } //ends onclick
        });
        button01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + “1");
            } //ends onclick
        });
        button02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + “2");

            } //ends onclick
        });
        button03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + “3”);
            } //ends onclick
        });
        button04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "4");
            } //ends onclick
        });
        button05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "5");
            } //ends onclick
        });
        button06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "6");
            } //ends onclick
        });
        button07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "7");
            } //ends onclick
        });
        button08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "8");
            } //ends onclick
        });
        button09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "9");
            } //ends onclick
        });

        //button.[FUNCTIONS] :
        button_PLUS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "+");
            } //ends onclick
        });
        button_MINUS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "-");
            } //ends onclick
        });
        button_DIVIDE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "/");
            } //ends onclick
        });
        button_MULTIPLY.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "*");
            } //ends onclick
        });
        button_CLEAR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "");
            } //ends onclick
        });
        button_EXPONENT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "^");
            } //ends onclick
        });
        button_PAR1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
        textView01.setText(textView01.getText().toString() + ")");
            } //ends onclick
        });
        button_PAR2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + "(");
            } //ends onclick
        });
        button_SIN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + “SIN");
            } //ends onclick
        });
        button_SQRT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView01.setText(textView01.getText().toString() + “^");
            } //ends onclick
        });
        button_EQUAL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String expression =textView01.getText().toString();
                String answer = calculate(expression);
                textView01.setText(answer);
            } //ends onclick
        });
    }



}
