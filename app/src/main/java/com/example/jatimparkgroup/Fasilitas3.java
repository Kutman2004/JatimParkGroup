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

public class Fasilitas3 extends Fragment
{
    Toolbar toolbarfasilitas3;
    View Fasilitas3;
    Button maps, home, fasilitas, wahana, desc, anggota;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Fasilitasmodel3> mFasilitas3= new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Fasilitas3 = inflater.inflate(R.layout.activity_fasilitas3, container, false);

        home = Fasilitas3.findViewById(R.id.bthome);
        fasilitas = Fasilitas3.findViewById(R.id.btfasilitas);
        wahana = Fasilitas3.findViewById(R.id.btwahana);
        desc = Fasilitas3.findViewById(R.id.btdesc);
        anggota = Fasilitas3.findViewById(R.id.btanggota);
        toolbarfasilitas3 = Fasilitas3.findViewById(R.id.toolbar);
        mRecyclerView = Fasilitas3.findViewById(R.id.rvFasilitas1);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new FasilitasAdapter3(mFasilitas3,getContext());
        mRecyclerView.setAdapter(mAdapter);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Homejtp3 hm = new Homejtp3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, hm);
                ft.commit();
            }
        });

        fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fasilitas3 fs = new Fasilitas3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, fs);
                ft.commit();
            }
        });

        wahana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Wahana3 wh = new Wahana3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, wh);
                ft.commit();
            }
        });

        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Desc3 ds = new Desc3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ds);
                ft.commit();
            }
        });

        anggota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anggota3 ang = new Anggota3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        toolbarfasilitas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Fasilitas3;
    }
    private void dummyData() {
        Fasilitasmodel3 fasilitas3= new Fasilitasmodel3(R.drawable.jp3ebike);
        mFasilitas3.add(fasilitas3);

        fasilitas3= new Fasilitasmodel3(R.drawable.jp3kimono);
        mFasilitas3.add(fasilitas3);

        fasilitas3= new Fasilitasmodel3(R.drawable.jp3kursirodaebike);
        mFasilitas3.add(fasilitas3);

        fasilitas3= new Fasilitasmodel3(R.drawable.jp3market);
        mFasilitas3.add(fasilitas3);

        fasilitas3= new Fasilitasmodel3(R.drawable.jp3restarea);
        mFasilitas3.add(fasilitas3);

        fasilitas3= new Fasilitasmodel3(R.drawable.jp3info);
        mFasilitas3.add(fasilitas3);

        fasilitas3= new Fasilitasmodel3(R.drawable.jp3jajanan);
        mFasilitas3.add(fasilitas3);
    }
}
