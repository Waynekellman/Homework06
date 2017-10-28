package nyc.c4q.homework06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {
    private TextView textView01;

//    ExtendedDoubleEvaluator  = new ExtendedDoubleEvaluator();

    DoubleEvaluator evaluator = new DoubleEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = (TextView) findViewById(R.id.text_view01);

    }

    public void buttonPress(View v) {
        if (v == findViewById(R.id.button01))
            textView01.setText(textView01.getText().toString() + "1");
        else if (v == findViewById(R.id.button02))
            textView01.setText(textView01.getText().toString() + "2");
        else if (v == findViewById(R.id.button03))
            textView01.setText(textView01.getText().toString() + "3");
        else if (v == findViewById(R.id.button04))
            textView01.setText(textView01.getText().toString() + "4");
        else if (v == findViewById(R.id.button05))
            textView01.setText(textView01.getText().toString() + "5");
        else if (v == findViewById(R.id.button06))
            textView01.setText(textView01.getText().toString() + "6");
        else if (v == findViewById(R.id.button07))
            textView01.setText(textView01.getText().toString() + "7");
        else if (v == findViewById(R.id.button08))
            textView01.setText(textView01.getText().toString() + "8");
        else if (v == findViewById(R.id.button09))
            textView01.setText(textView01.getText().toString() + "9");
        else if (v == findViewById(R.id.button00))
            textView01.setText(textView01.getText().toString() + "0");
        else if (v == findViewById(R.id.button_clear))
            textView01.setText("");
        else if (v == findViewById(R.id.button_par1))
            textView01.setText(textView01.getText().toString() + "(");
        else if (v == findViewById(R.id.button_par2))
            textView01.setText(textView01.getText().toString() + ")");
        else if (v == findViewById(R.id.plus))
            textView01.setText(textView01.getText().toString() + "+");
        else if (v == findViewById(R.id.minus))
            textView01.setText(textView01.getText().toString() + "-");
        else if (v == findViewById(R.id.mult))
            textView01.setText(textView01.getText().toString() + "*");
        else if (v == findViewById(R.id.divide))
            textView01.setText(textView01.getText().toString() + "/");
        else if (v == findViewById(R.id.button_percent))
            textView01.setText(textView01.getText().toString() + "&");
        else if (v == findViewById(R.id.button_sin))
            textView01.setText(textView01.getText() + "sin(");
        else if (v == findViewById(R.id.button_cos))
            textView01.setText(textView01.getText() + "cos(");
        else if (v == findViewById(R.id.button_tan))
            textView01.setText(textView01.getText() + "tan(");
        else if (v == findViewById(R.id.button_pie))
            textView01.setText(textView01.getText() + "pi");
        else if (v == findViewById(R.id.button_factorial))
            textView01.setText(textView01.getText() + "!");

        else if (v == findViewById(R.id.button_equal)) {

//            ExtendedDoubleEvaluator evaluator = new ExtendedDoubleEvaluator();

            String expression = textView01.getText() +"";

//            Double result = evaluator.evaluate(expression);


            String answer = calculate(expression);
            //textView01.setText(result + " ");
            textView01.setText(answer);

        }


    }

    public String calculate(String expression) {
        try {
            Double result = evaluator.evaluate(expression);
            return String.valueOf(result);
        } catch  (Exception e){
            return "Error";

        }
    }
}

