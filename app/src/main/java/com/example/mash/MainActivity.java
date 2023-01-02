package com.example.mash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.CLICK);
        textView = (TextView) findViewById(R.id.Result);
        checkBox1 = (CheckBox) findViewById(R.id.Japan);
        checkBox2 = (CheckBox) findViewById(R.id.England);
        checkBox3 = (CheckBox) findViewById(R.id.Morocco);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                String mulString = "You have to select any one option";
                if (checkBox1.isChecked() && checkBox2.isChecked()) {
                    Toast.makeText(MainActivity.this, mulString, Toast.LENGTH_SHORT).show();
                } else if (checkBox1.isChecked() && checkBox3.isChecked()) {
                    Toast.makeText(MainActivity.this, mulString, Toast.LENGTH_SHORT).show();
                } else if (checkBox2.isChecked() && checkBox3.isChecked()) {
                    Toast.makeText(MainActivity.this, mulString, Toast.LENGTH_SHORT).show();
                } else if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()) {
                    Toast.makeText(MainActivity.this, mulString, Toast.LENGTH_SHORT).show();
                } else if (checkBox1.isChecked() || checkBox2.isChecked()) {
                    result += "Wrong Answer";
                } else if (checkBox3.isChecked()) {
                    result += "Correct Answer";
                } else {
                    Toast.makeText(MainActivity.this, "You have to select at least one option", Toast.LENGTH_SHORT)
                            .show();
                }
                textView.setText(result);
            }
        });
    }

}