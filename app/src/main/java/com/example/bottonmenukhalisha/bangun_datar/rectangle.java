package com.example.bottonmenukhalisha.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class rectangle extends AppCompatActivity {

    private EditText panjang;
    private EditText lebar;
    private Button buttonhitung;
    private Button buttonClear;
    private Button buttonBack;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        panjang = findViewById(R.id.sisi1);
        lebar = findViewById(R.id.sisi2);
        buttonhitung = findViewById(R.id.buttonHitung);
        buttonClear = findViewById(R.id.buttonClear);
        buttonBack = findViewById(R.id.buttonBack);
        txtHasil = findViewById(R.id.txtHasil);

        buttonhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang.setText("");
                lebar.setText("");
                txtHasil.setText("0");
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void calculateArea() {
        String sideStr1 = panjang.getText().toString().trim();
        String sideStr2 = lebar.getText().toString().trim();

        if (!sideStr1.isEmpty() && !sideStr2.isEmpty()) {
            double side1 = Double.parseDouble(sideStr1);
            double side2 = Double.parseDouble(sideStr2);
            double area = side1 * side2;
            txtHasil.setText(getString(R.string.result_square, area));
        } else {
            txtHasil.setText(R.string.error_empty_field);
        }
    }
}
