package com.example.administrator.thirdhomework;

import android.support.v7.app.AppCompatActivity;
import android.test.ActivityUnitTestCase;
import android.view.View;
import android.widget.EditText;

public class out extends AppCompatActivity {
    private EditText address;
    private EditText content;
    class MyClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            EditText address=(EditText)findViewById(R.id.txt);
            address.setText("内部类");
        }
    }
}
