package com.hideonbush.apptinhtoan;

import static java.lang.Float.parseFloat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnAdd, btnSub, btnMul, btnDiv;
    EditText edtA, edtB;
    TextView tvResult;
    void getControls() {
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        tvResult = findViewById(R.id.tvResult);
    }
    public void Xuly_Cong(View v) {
        int a = Integer.parseInt(edtA.getText().toString());
        int b = Integer.parseInt(edtB.getText().toString());
        int c = a + b;
        tvResult.setText("Kết quả: " + c);
    }
    public void Xuly_Tru(View v) {
        int a = Integer.parseInt(edtA.getText().toString());
        int b = Integer.parseInt(edtB.getText().toString());
        int c = a - b;
        tvResult.setText("Kết quả: " + c);
    }
    public void Xuly_Nhan(View v) {
        int a = Integer.parseInt(edtA.getText().toString());
        int b = Integer.parseInt(edtB.getText().toString());
        int c = a * b;
        tvResult.setText("Kết quả: " + c);
    }
    public void Xuly_Chia(View v) {
        int a = Integer.parseInt(edtA.getText().toString());
        int b = Integer.parseInt(edtB.getText().toString());
        if (b == 0) {
            tvResult.setText("Không thể chia cho 0");
        } else {
            float c = parseFloat(String.valueOf(a))/parseFloat(String.valueOf(b));
            tvResult.setText("Kết quả: " + c);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getControls();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}