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

public class Wahana2 extends Fragment
{
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Wahanamodel2> mWahanas2 = new ArrayList<>();
    Toolbar toolbarwahana2;
    View Wahana2;
    Button maps, home, fasilitas, wahana, desc, anggota;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Wahana2 = inflater.inflate(R.layout.activity_wahana2, container, false);
        mRecyclerView = Wahana2.findViewById(R.id.rvWahana2);
        home = Wahana2.findViewById(R.id.bthome);
        fasilitas = Wahana2.findViewById(R.id.btfasilitas);
        wahana = Wahana2.findViewById(R.id.btwahana);
        desc = Wahana2.findViewById(R.id.btdesc);
        anggota = Wahana2.findViewById(R.id.btanggota);
        toolbarwahana2 = Wahana2.findViewById(R.id.toolbar);

        mRecyclerView = Wahana2.findViewById(R.id.rvWahana2);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new WahanaAdapter2(mWahanas2,getContext());
        mRecyclerView.setAdapter(mAdapter);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Homejtp2 hm = new Homejtp2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, hm);
                ft.commit();
            }
        });

        fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fasilitas2 fs = new Fasilitas2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, fs);
                ft.commit();
            }
        });

        wahana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Wahana2 wh = new Wahana2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, wh);
                ft.commit();
            }
        });

        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Desc2 ds = new Desc2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ds);
                ft.commit();
            }
        });

        anggota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anggota2 ang = new Anggota2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        toolbarwahana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Wahana2;
    }

    private void dummyData() {
        Wahanamodel2 fasilitas2= new Wahanamodel2 (R.drawable.galerifosiljp2,getString(R.string.title_zonafosil2),getString(R.string.whn_hallentrance));
        mWahanas2.add(fasilitas2);

        fasilitas2= new Wahanamodel2 (R.drawable.mayapadajp2,getString(R.string.title_zonafosil2),getString(R.string.whn_hallfame));
        mWahanas2.add(fasilitas2);

        fasilitas2= new Wahanamodel2 (R.drawable.reptilgardejp2,getString(R.string.title_reptil2),getString(R.string.whn_science));
        mWahanas2.add(fasilitas2);

        fasilitas2= new Wahanamodel2 (R.drawable.zonaaquajp2,getString(R.string.title_zonaaqua2),getString(R.string.whn_medical));
        mWahanas2.add(fasilitas2);

        fasilitas2= new Wahanamodel2 (R.drawable.tigerlandjp2,getString(R.string.title_tiger2),getString(R.string.title_tiger2));
        mWahanas2.add(fasilitas2);

        fasilitas2= new Wahanamodel2 (R.drawable.insectariumjp2,getString(R.string.title_insect2),getString(R.string.whn_zona));
        mWahanas2.add(fasilitas2);
    }
}
