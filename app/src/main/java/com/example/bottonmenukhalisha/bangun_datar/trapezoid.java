package com.example.bottonmenukhalisha.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class trapezoid extends AppCompatActivity {

    private EditText sisi1EditText;
    private EditText sisi2EditText;
    private EditText tinggiEditText;
    private Button hitungButton;
    private Button clearButton;
    private Button backButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);

        sisi1EditText = findViewById(R.id.sisi1);
        sisi2EditText = findViewById(R.id.sisi2);
        tinggiEditText = findViewById(R.id.tinggi);
        hitungButton = findViewById(R.id.buttonHitung);
        clearButton = findViewById(R.id.buttonClear);
        backButton = findViewById(R.id.buttonBack);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasTrapesium();
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisi1EditText.setText("");
                sisi2EditText.setText("");
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

    private void hitungLuasTrapesium() {
        String sisi1Str = sisi1EditText.getText().toString().trim();
        String sisi2Str = sisi2EditText.getText().toString().trim();
        String tinggiStr = tinggiEditText.getText().toString().trim();

        if (!sisi1Str.isEmpty() && !sisi2Str.isEmpty() && !tinggiStr.isEmpty()) {
            double sisi1 = Double.parseDouble(sisi1Str);
            double sisi2 = Double.parseDouble(sisi2Str);
            double tinggi = Double.parseDouble(tinggiStr);
            double luas = (sisi1 + sisi2) * tinggi / 2;
            hasilTextView.setText(getString(R.string.result_trapezoid, luas));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }

    private void clearFields() {
        sisi1EditText.setText("");
        sisi2EditText.setText("");
        tinggiEditText.setText("");
        hasilTextView.setText(getString(R.string.result_circle, 0));
    }
}
