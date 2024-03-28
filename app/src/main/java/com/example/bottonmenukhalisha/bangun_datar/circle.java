package com.example.bottonmenukhalisha.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class circle extends AppCompatActivity {

    private EditText jariJariEditText;
    private Button btnHitung;
    private Button btnClear;
    private Button btnBack;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        jariJariEditText = findViewById(R.id.jari_jari);
        btnHitung = findViewById(R.id.buttonHitung);
        btnClear = findViewById(R.id.buttonClear);
        btnBack = findViewById(R.id.buttonBack);
        hasilTextView = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLingkaran();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jariJariEditText.setText("");
                hasilTextView.setText("0");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void hitungLuasLingkaran() {
        String jariJariStr = jariJariEditText.getText().toString().trim();

        if (!jariJariStr.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariStr);
            double luas = Math.PI * Math.pow(jariJari, 2);
            hasilTextView.setText(getString(R.string.result_circle, luas));
        } else {
            hasilTextView.setText(R.string.error_empty_field);
        }
    }

    private void clearFields() {
        jariJariEditText.setText("");
        hasilTextView.setText(getString(R.string.result_circle, 0)); // Atur hasil ke 0
    }
}
