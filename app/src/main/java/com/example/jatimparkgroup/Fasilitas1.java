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

public class Fasilitas1 extends Fragment
{
    Toolbar toolbarfasilitas1;
    View Fasilitas1;
    Button maps, home, fasilitas, wahana, desc, anggota;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Fasilitasmodel1> mFasilitas= new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Fasilitas1 = inflater.inflate(R.layout.activity_fasilitas1, container, false);

        home = Fasilitas1.findViewById(R.id.bthome);
        fasilitas = Fasilitas1.findViewById(R.id.btfasilitas);
        wahana = Fasilitas1.findViewById(R.id.btwahana);
        desc = Fasilitas1.findViewById(R.id.btdesc);
        anggota = Fasilitas1.findViewById(R.id.btanggota);
        toolbarfasilitas1 = Fasilitas1.findViewById(R.id.toolbar);
        mRecyclerView = Fasilitas1.findViewById(R.id.rvFasilitas1);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new FasilitasAdapter1(mFasilitas,getContext());
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

        toolbarfasilitas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Fasilitas1;
    }
    private void dummyData() {
        Fasilitasmodel1 fasilitas= new Fasilitasmodel1(R.drawable.screenshot_2);
        mFasilitas.add(fasilitas);

        fasilitas= new Fasilitasmodel1(R.drawable.screenshot_3);
        mFasilitas.add(fasilitas);

        fasilitas= new Fasilitasmodel1(R.drawable.screenshot_4);
        mFasilitas.add(fasilitas);

        fasilitas= new Fasilitasmodel1(R.drawable.screenshot_5);
        mFasilitas.add(fasilitas);

        fasilitas= new Fasilitasmodel1(R.drawable.screenshot_6);
        mFasilitas.add(fasilitas);

        fasilitas= new Fasilitasmodel1(R.drawable.screenshot_7);
        mFasilitas.add(fasilitas);

        fasilitas= new Fasilitasmodel1(R.drawable.screenshot_8);
        mFasilitas.add(fasilitas);
    }
}
