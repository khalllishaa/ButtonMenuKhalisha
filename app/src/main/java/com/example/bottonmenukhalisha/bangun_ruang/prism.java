package com.example.bottonmenukhalisha.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class prism extends AppCompatActivity {

    private EditText alasEditText;
    private EditText tinggiSegitigaEditText;
    private EditText tinggiPrismaEditText;
    private Button hitungButton;
    private Button buttonClear;
    private Button buttonBack;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        alasEditText = findViewById(R.id.sisi1);
        tinggiSegitigaEditText = findViewById(R.id.sisi2);
        tinggiPrismaEditText = findViewById(R.id.sisi3);
        hitungButton = findViewById(R.id.buttonHitung);
        buttonBack = findViewById(R.id.buttonBack);
        buttonClear = findViewById(R.id.buttonClear);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumePrisma();
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
                alasEditText.setText("");
                tinggiPrismaEditText.setText("");
                tinggiSegitigaEditText.setText("");
                hasilTextView.setText("0");
            }
        });
    }

    private void hitungVolumePrisma() {
        String alasStr = alasEditText.getText().toString().trim();
        String tinggiSegitigaStr = tinggiSegitigaEditText.getText().toString().trim();
        String tinggiPrismaStr = tinggiPrismaEditText.getText().toString().trim();

        if (!alasStr.isEmpty() && !tinggiSegitigaStr.isEmpty() && !tinggiPrismaStr.isEmpty()) {
            double alas = Double.parseDouble(alasStr);
            double tinggiSegitiga = Double.parseDouble(tinggiSegitigaStr);
            double tinggiPrisma = Double.parseDouble(tinggiPrismaStr);
            double volume = (alas * tinggiSegitiga * tinggiPrisma) / 2;
            hasilTextView.setText(getString(R.string.result_prism, volume));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }
}
