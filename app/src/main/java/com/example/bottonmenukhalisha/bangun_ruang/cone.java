package com.example.bottonmenukhalisha.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class cone extends AppCompatActivity {

    private EditText jariJariEditText;
    private EditText tinggiEditText;
    private Button hitungButton;
    private Button buttonClear;
    private Button buttonBack;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        jariJariEditText = findViewById(R.id.sisi1);
        tinggiEditText = findViewById(R.id.sisi2);
        hitungButton = findViewById(R.id.buttonHitung);
        buttonBack = findViewById(R.id.buttonBack);
        buttonClear = findViewById(R.id.buttonClear);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKerucut();
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
                tinggiEditText.setText("");
                hasilTextView.setText("0");
            }
        });
    }

    private void hitungVolumeKerucut() {
        String jariJariStr = jariJariEditText.getText().toString().trim();
        String tinggiStr = tinggiEditText.getText().toString().trim();

        if (!jariJariStr.isEmpty() && !tinggiStr.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
            hasilTextView.setText(getString(R.string.result_cone, volume));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }
}
