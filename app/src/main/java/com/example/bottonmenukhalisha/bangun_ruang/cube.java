package com.example.bottonmenukhalisha.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class cube extends AppCompatActivity {

    private EditText sisiEditText;
    private Button hitungButton;
    private Button buttonClear;
    private TextView hasilTextView;
    private Button buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        sisiEditText = findViewById(R.id.sisi1);
        hitungButton = findViewById(R.id.buttonHitung);
        buttonClear = findViewById(R.id.buttonClear);
        hasilTextView = findViewById(R.id.txtHasil);
        buttonBack = findViewById(R.id.buttonBack);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKubus();
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
                sisiEditText.setText("");
                hasilTextView.setText("0");
            }
        });
    }

    private void hitungVolumeKubus() {
        String sisiStr = sisiEditText.getText().toString().trim();

        if (!sisiStr.isEmpty()) {
            double sisi = Double.parseDouble(sisiStr);
            double volume = Math.pow(sisi, 3);
            hasilTextView.setText(getString(R.string.result_cube, volume));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }
}
