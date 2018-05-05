package com.example.administrator.thirdhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);
        show=(EditText)findViewById(R.id.txt);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("匿名内部类");
            }
        });
        button.setOnClickListener(new MyClickListener());
    }
    class MyClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            EditText txt=(EditText)findViewById(R.id.txt);
            txt.setText("内部类");
        }
    }
    public void clickHandler(View source)
    {
        EditText show=(EditText)findViewById(R.id.txt);
        show.setText("直接绑定到标签");
    }
}
