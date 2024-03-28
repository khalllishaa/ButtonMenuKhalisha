package com.example.bottonmenukhalisha.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

// Deklarasi kelas square

public class square extends AppCompatActivity {

    private EditText txtSisi1;
    private Button buttonHitung;
    private Button buttonClear;
    private Button buttonBack;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        txtSisi1 = findViewById(R.id.sisi1);
        buttonHitung = findViewById(R.id.buttonHitung);
        buttonBack = findViewById(R.id.buttonBack);
        buttonClear = findViewById(R.id.buttonClear);
        txtHasil = findViewById(R.id.txtHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSisi1.setText("");
                txtHasil.setText("0");
            }
        });

    }

    private void hitungLuasPersegi() {
        String sisiStr = txtSisi1.getText().toString().trim();

        if (!sisiStr.isEmpty()) {
            double sisi = Double.parseDouble(sisiStr);
            double volume = Math.pow(sisi, 2);
            txtHasil.setText(getString(R.string.result_cube, volume));
        } else {
            txtHasil.setText(getString(R.string.error_empty_field));
        }
    }
}
