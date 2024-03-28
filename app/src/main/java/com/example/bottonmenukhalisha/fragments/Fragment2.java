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
import com.example.bottonmenukhalisha.bangun_ruang.cone;
import com.example.bottonmenukhalisha.bangun_ruang.cube;
import com.example.bottonmenukhalisha.bangun_ruang.cuboid;
import com.example.bottonmenukhalisha.bangun_ruang.cylinder;
import com.example.bottonmenukhalisha.bangun_ruang.prism;
import com.example.bottonmenukhalisha.bangun_ruang.pyramid;
import com.example.bottonmenukhalisha.bangun_ruang.sphere;

public class Fragment2 extends Fragment {

    public Fragment2() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Mengatur onClickListener untuk layout cube
        View squareLayout = view.findViewById(R.id.layouts);
        squareLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman cube (cube)
                Intent intent = new Intent(getActivity(), cube.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout balok
        View rectangleLayout = view.findViewById(R.id.layoutr);
        rectangleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman balok (cuboid)
                Intent intent = new Intent(getActivity(), cuboid.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout kerucut
        View circlelayout = view.findViewById(R.id.layoutc);
        circlelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman kerucut (cone)
                Intent intent = new Intent(getActivity(), cone.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout tabung
        View triangleLayout = view.findViewById(R.id.layoutt);
        triangleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman tabung (cylinder)
                Intent intent = new Intent(getActivity(), cylinder.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout limas
        View parallelogramlayout = view.findViewById(R.id.layoutp);
        parallelogramlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman limas (pyramid)
                Intent intent = new Intent(getActivity(), pyramid.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout prisma
        View rhombusLayout = view.findViewById(R.id.layouth);
        rhombusLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman prisma (prism)
                Intent intent = new Intent(getActivity(), prism.class);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk layout bola
        View trapezoidLayout = view.findViewById(R.id.layoutrh);
        trapezoidLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman bola (sphere)
                Intent intent = new Intent(getActivity(), sphere.class);
                startActivity(intent);
            }
        });
    }
}
