package com.example.HelloConstraint;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button button1;
    private Button button_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button1 = (Button) findViewById(R.id.button1);
        button_count=findViewById(R.id.button_count);
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        Integer i = Integer.parseInt(mShowCount.getText().toString());
        if (i % 2 == 0) {
            button1.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
        } else {
            button1.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        }
        button_count.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
    }


    public void number(View view) {
    }
}