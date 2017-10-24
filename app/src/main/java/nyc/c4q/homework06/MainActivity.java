package nyc.c4q.homework06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = (TextView) findViewById(R.id.text_view01);

    }
    public void buttonPress(View v){
        if(v == findViewById(R.id.button01))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button01)).getText().toString());
        else if (v== findViewById(R.id.button02))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button02)).getText().toString());
        else if (v== findViewById(R.id.button03))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button03)).getText().toString());
        else if (v== findViewById(R.id.button04))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button04)).getText().toString());
        else if (v== findViewById(R.id.button05))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button05)).getText().toString());
        else if (v== findViewById(R.id.button06))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button06)).getText().toString());
        else if (v== findViewById(R.id.button07))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button07)).getText().toString());
        else if (v== findViewById(R.id.button08))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button08)).getText().toString());
        else if (v== findViewById(R.id.button09))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button09)).getText().toString());
        else if (v== findViewById(R.id.button00))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button00)).getText().toString());
        else if (v == findViewById(R.id.button_clear))
            textView01.setText("");
        else if (v== findViewById(R.id.button_par1))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button_par1)).getText().toString());
        else if (v== findViewById(R.id.button_par2))
            textView01.setText(textView01.getText().toString() + ((Button) findViewById(R.id.button_par2)).getText().toString());
    }
}
