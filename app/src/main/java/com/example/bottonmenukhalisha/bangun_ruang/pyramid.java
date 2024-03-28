package com.example.bottonmenukhalisha.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class pyramid extends AppCompatActivity {

    private EditText alasEditText;
    private EditText tinggiEditText;
    private Button hitungButton;
    private Button buttonClear;
    private Button buttonBack;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid);

        alasEditText = findViewById(R.id.sisi1);
        tinggiEditText = findViewById(R.id.sisi2);
        hitungButton = findViewById(R.id.buttonHitung);
        buttonBack = findViewById(R.id.buttonBack);
        buttonClear = findViewById(R.id.buttonClear);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeLimas();
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
                tinggiEditText.setText("");
                hasilTextView.setText("0");
            }
        });
    }

    private void hitungVolumeLimas() {
        String alasStr = alasEditText.getText().toString().trim();
        String tinggiStr = tinggiEditText.getText().toString().trim();

        if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
            double alas = Double.parseDouble(alasStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double volume = (alas * alas * tinggi) / 3;
            hasilTextView.setText(getString(R.string.result_pyramid, volume));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }
}
