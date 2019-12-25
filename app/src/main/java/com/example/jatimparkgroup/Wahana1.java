package com.example.jatimparkgroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Wahana1 extends Fragment
{
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Wahanamodel1> mWahanas = new ArrayList<>();
    Toolbar toolbarwahana1;
    View Wahana1;
    Button maps, home, fasilitas, wahana, desc, anggota;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Wahana1 = inflater.inflate(R.layout.activity_wahana1, container, false);
        mRecyclerView = Wahana1.findViewById(R.id.rvWahana1);
        home = Wahana1.findViewById(R.id.bthome);
        fasilitas = Wahana1.findViewById(R.id.btfasilitas);
        wahana = Wahana1.findViewById(R.id.btwahana);
        desc = Wahana1.findViewById(R.id.btdesc);
        anggota = Wahana1.findViewById(R.id.btanggota);
        toolbarwahana1 = Wahana1.findViewById(R.id.toolbar);

        mRecyclerView = Wahana1.findViewById(R.id.rvWahana1);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new WahanaAdapter1(mWahanas,getContext());
        mRecyclerView.setAdapter(mAdapter);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Homejtp1 hm = new Homejtp1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, hm);
                ft.commit();
            }
        });

        fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fasilitas1 fs = new Fasilitas1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, fs);
                ft.commit();
            }
        });

        wahana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Wahana1 wh = new Wahana1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, wh);
                ft.commit();
            }
        });

        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Desc1 ds = new Desc1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ds);
                ft.commit();
            }
        });

        anggota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anggota1 ang = new Anggota1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        toolbarwahana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Wahana1;
    }

    private void dummyData() {
        Wahanamodel1 fasilitas= new Wahanamodel1 (R.drawable.hallentrance,getString(R.string.title_hallentrance),getString(R.string.whn_hallentrance));
        mWahanas.add(fasilitas);

        fasilitas= new Wahanamodel1 (R.drawable.hallfame,getString(R.string.title_hallfame),getString(R.string.whn_hallfame));
        mWahanas.add(fasilitas);

        fasilitas= new Wahanamodel1 (R.drawable.science,getString(R.string.title_science),getString(R.string.whn_science));
        mWahanas.add(fasilitas);

        fasilitas= new Wahanamodel1 (R.drawable.checkup,getString(R.string.title_medical),getString(R.string.whn_medical));
        mWahanas.add(fasilitas);

        fasilitas= new Wahanamodel1 (R.drawable.cadavar,getString(R.string.title_cadaver),getString(R.string.whn_cadaver));
        mWahanas.add(fasilitas);

        fasilitas= new Wahanamodel1 (R.drawable.zonatubuh,getString(R.string.title_zona),getString(R.string.whn_zona));
        mWahanas.add(fasilitas);
    }
}
