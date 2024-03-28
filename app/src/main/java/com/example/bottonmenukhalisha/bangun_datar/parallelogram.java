package com.example.bottonmenukhalisha.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class parallelogram extends AppCompatActivity {

    private EditText alasEditText;
    private EditText tinggiEditText;
    private Button hitungButton;
    private Button clearButton;
    private Button backButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);

        alasEditText = findViewById(R.id.alas);
        tinggiEditText = findViewById(R.id.tinggi);
        hitungButton = findViewById(R.id.buttonHitung);
        clearButton = findViewById(R.id.buttonClear);
        backButton = findViewById(R.id.buttonBack);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasJajarGenjang();
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alasEditText.setText("");
                tinggiEditText.setText("");
                hasilTextView.setText("0");
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void hitungLuasJajarGenjang() {
        String alasStr = alasEditText.getText().toString().trim();
        String tinggiStr = tinggiEditText.getText().toString().trim();

        if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
            double alas = Double.parseDouble(alasStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double luas = alas * tinggi;
            hasilTextView.setText(getString(R.string.result_parallelogram, luas));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }

    private void clearFields() {
        alasEditText.setText("");
        tinggiEditText.setText("");
        hasilTextView.setText(getString(R.string.result_circle, 0));
    }
}
