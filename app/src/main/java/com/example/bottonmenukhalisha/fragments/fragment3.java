package com.example.bottonmenukhalisha.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.bottonmenukhalisha.R;
import com.example.bottonmenukhalisha.awal;

public class fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);

        Button btnNext = view.findViewById(R.id.button2);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), awal.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
