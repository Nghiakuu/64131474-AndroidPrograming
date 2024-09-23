package com.hideonbush.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void SayHello(View v)
    {
        EditText soA = findViewById(R.id.editTextNumber2);
        EditText soB = findViewById(R.id.editTextNumber3);
        String s1 = soA.getText().toString();
        String s2 = soB.getText().toString();
        int num1= Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        int sum = num1 + num2;
        String tong = "Tổng là " + String.valueOf(sum);
        Toast.makeText(this, tong, Toast.LENGTH_LONG).show();

    }
}