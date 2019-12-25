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

public class Wahana3 extends Fragment
{
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Wahanamodel3> mWahanas3 = new ArrayList<>();
    Toolbar toolbarwahana3;
    View Wahana3;
    Button maps, home, fasilitas, wahana, desc, anggota;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Wahana3 = inflater.inflate(R.layout.activity_wahana3, container, false);
        mRecyclerView = Wahana3.findViewById(R.id.rvWahana3);
        home = Wahana3.findViewById(R.id.bthome);
        fasilitas = Wahana3.findViewById(R.id.btfasilitas);
        wahana = Wahana3.findViewById(R.id.btwahana);
        desc = Wahana3.findViewById(R.id.btdesc);
        anggota = Wahana3.findViewById(R.id.btanggota);
        toolbarwahana3 = Wahana3.findViewById(R.id.toolbar);

        mRecyclerView = Wahana3.findViewById(R.id.rvWahana3);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new WahanaAdapter3(mWahanas3,getContext());
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

        toolbarwahana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Wahana3;
    }

    private void dummyData() {
        Wahanamodel3 fasilitas3= new Wahanamodel3 (R.drawable.jp3concerthall,getString(R.string.title_concert3),getString(R.string.whn_hallentrance));
        mWahanas3.add(fasilitas3);

        fasilitas3= new Wahanamodel3 (R.drawable.jp3cyclomovie,getString(R.string.title_cyclo3),getString(R.string.whn_hallfame));
        mWahanas3.add(fasilitas3);

        fasilitas3= new Wahanamodel3 (R.drawable.jp3dinomuseum,getString(R.string.title_dino3),getString(R.string.whn_science));
        mWahanas3.add(fasilitas3);

        fasilitas3= new Wahanamodel3 (R.drawable.jp3hollywood,getString(R.string.title_holly3),getString(R.string.whn_medical));
        mWahanas3.add(fasilitas3);

        fasilitas3= new Wahanamodel3 (R.drawable.jp3jelajah5zaman,getString(R.string.title_zaman3),getString(R.string.whn_cadaver));
        mWahanas3.add(fasilitas3);

        fasilitas3= new Wahanamodel3 (R.drawable.jp3zonajepang,getString(R.string.title_jepang3),getString(R.string.whn_zona));
        mWahanas3.add(fasilitas3);
    }
}
