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

public class Fasilitas2 extends Fragment
{
    Toolbar toolbarfasilitas2;
    View Fasilitas2;
    Button maps, home, fasilitas, wahana, desc, anggota;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Fasilitasmodel2> mFasilitas2= new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Fasilitas2 = inflater.inflate(R.layout.activity_fasilitas2, container, false);

        home = Fasilitas2.findViewById(R.id.bthome);
        fasilitas = Fasilitas2.findViewById(R.id.btfasilitas);
        wahana = Fasilitas2.findViewById(R.id.btwahana);
        desc = Fasilitas2.findViewById(R.id.btdesc);
        anggota = Fasilitas2.findViewById(R.id.btanggota);
        toolbarfasilitas2 = Fasilitas2.findViewById(R.id.toolbar);
        mRecyclerView = Fasilitas2.findViewById(R.id.rvFasilitas1);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new FasilitasAdapter2(mFasilitas2,getContext());
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

        toolbarfasilitas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Fasilitas2;
    }
    private void dummyData() {
        Fasilitasmodel2 fasilitas2= new Fasilitasmodel2(R.drawable.angkutangratisjp2);
        mFasilitas2.add(fasilitas2);

        fasilitas2= new Fasilitasmodel2(R.drawable.dottojp2);
        mFasilitas2.add(fasilitas2);

        fasilitas2= new Fasilitasmodel2(R.drawable.ebikejp2);
        mFasilitas2.add(fasilitas2);

        fasilitas2= new Fasilitasmodel2(R.drawable.funhousejp2);
        mFasilitas2.add(fasilitas2);

        fasilitas2= new Fasilitasmodel2(R.drawable.oleholehjp2);
        mFasilitas2.add(fasilitas2);

        fasilitas2= new Fasilitasmodel2(R.drawable.shuttlecarjp2);
        mFasilitas2.add(fasilitas2);

        fasilitas2= new Fasilitasmodel2(R.drawable.warungdesajp2);
        mFasilitas2.add(fasilitas2);
    }
}
