package com.example.bottonmenukhalisha.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottonmenukhalisha.R;

public class rhombus extends AppCompatActivity {

    private EditText diagonal1EditText;
    private EditText diagonal2EditText;
    private Button hitungButton;
    private Button clearButton;
    private Button backButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);

        diagonal1EditText = findViewById(R.id.diagonal1);
        diagonal2EditText = findViewById(R.id.diagonal2);
        hitungButton = findViewById(R.id.buttonHitung);
        clearButton = findViewById(R.id.buttonClear);
        backButton = findViewById(R.id.buttonBack);
        hasilTextView = findViewById(R.id.txtHasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasBelahKetupat();
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diagonal2EditText.setText("");
                diagonal1EditText.setText("");
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

    private void hitungLuasBelahKetupat() {
        String diagonal1Str = diagonal1EditText.getText().toString().trim();
        String diagonal2Str = diagonal2EditText.getText().toString().trim();

        if (!diagonal1Str.isEmpty() && !diagonal2Str.isEmpty()) {
            double diagonal1 = Double.parseDouble(diagonal1Str);
            double diagonal2 = Double.parseDouble(diagonal2Str);
            double luas = (diagonal1 * diagonal2) / 2;
            hasilTextView.setText(getString(R.string.result_rhombus, luas));
        } else {
            hasilTextView.setText(getString(R.string.error_empty_field));
        }
    }

    private void clearFields() {
        diagonal1EditText.setText("");
        diagonal2EditText.setText("");
        hasilTextView.setText(getString(R.string.result_circle, 0));
    }
}
