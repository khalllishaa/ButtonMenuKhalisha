package com.example.bottonmenukhalisha.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class sphere extends AppCompatActivity {

    private EditText jariJariEditText;
    private Button hitungButton;
    private Button buttonClear;
    private Button buttonBack;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        jariJariEditText = findViewById(R.id.sisi1);
        hitungButton = findViewById(R.id.buttonHitung);
        buttonBack = findViewById(R.id.buttonBack);
        buttonClear = findViewById(R.id.buttonClear);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBola();
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
                jariJariEditText.setText("");
                hasilTextView.setText("0");
            }
        });
    }

    private void hitungVolumeBola() {
        String jariJariStr = jariJariEditText.getText().toString().trim();

        if (!jariJariStr.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariStr);
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
            hasilTextView.setText(getString(R.string.result_sphere, volume));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }
}
