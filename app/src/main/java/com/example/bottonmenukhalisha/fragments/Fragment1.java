package com.example.bottonmenukhalisha.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bottonmenukhalisha.R;
import com.example.bottonmenukhalisha.bangun_datar.circle;
import com.example.bottonmenukhalisha.bangun_datar.parallelogram;
import com.example.bottonmenukhalisha.bangun_datar.rectangle;
import com.example.bottonmenukhalisha.bangun_datar.rhombus;
import com.example.bottonmenukhalisha.bangun_datar.square;
import com.example.bottonmenukhalisha.bangun_datar.trapezoid;
import com.example.bottonmenukhalisha.bangun_datar.triangle;

public class Fragment1 extends Fragment {

    public Fragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Mengatur onClickListener untuk layout kotak
        View squareLayout = view.findViewById(R.id.layoutss);
        squareLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman kotak (square)
                Intent intent = new Intent(getActivity(), square.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout persegi panjang
        View rectangleLayout = view.findViewById(R.id.layoutrr);
        rectangleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman persegi panjang (rectangle)
                Intent intent = new Intent(getActivity(), rectangle.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout lingkaran
        View circlelayout = view.findViewById(R.id.layoutcc);
        circlelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman lingkaran (circle)
                Intent intent = new Intent(getActivity(), circle.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout segitiga
        View triangleLayout = view.findViewById(R.id.layouttt);
        triangleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman segitiga (triangle)
                Intent intent = new Intent(getActivity(), triangle.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout jajar genjang
        View parallelogramlayout = view.findViewById(R.id.layoutpp);
        parallelogramlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman jajar genjang (parallelogram)
                Intent intent = new Intent(getActivity(), parallelogram.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout belah ketupat
        View rhombusLayout = view.findViewById(R.id.layouthh);
        rhombusLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman belah ketupat(rhombus)
                Intent intent = new Intent(getActivity(), rhombus.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout trapesium
        View trapezoidLayout = view.findViewById(R.id.layoutrhh);
        trapezoidLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman trapesium (trapezoid)
                Intent intent = new Intent(getActivity(), trapezoid.class);
                startActivity(intent);
            }
        });
    }
}
