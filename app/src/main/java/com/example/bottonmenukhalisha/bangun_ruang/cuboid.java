package com.example.bottonmenukhalisha.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class cuboid extends AppCompatActivity {

    private EditText panjangEditText;
    private EditText lebarEditText;
    private EditText tinggiEditText;
    private Button hitungButton;
    private Button buttonClear;
    private Button buttonBack;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);

        panjangEditText = findViewById(R.id.sisi1);
        lebarEditText = findViewById(R.id.sisi2);
        tinggiEditText = findViewById(R.id.sisi3);
        hitungButton = findViewById(R.id.buttonHitung);
        buttonBack = findViewById(R.id.buttonBack);
        buttonClear = findViewById(R.id.buttonClear);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBalok();
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
                panjangEditText.setText("");
                lebarEditText.setText("");
                tinggiEditText.setText("");
                hasilTextView.setText("0");
            }
        });
    }

    private void hitungVolumeBalok() {
        String panjangStr = panjangEditText.getText().toString().trim();
        String lebarStr = lebarEditText.getText().toString().trim();
        String tinggiStr = tinggiEditText.getText().toString().trim();

        if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double volume = panjang * lebar * tinggi;
            hasilTextView.setText(getString(R.string.result_cuboid, volume));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }
}
