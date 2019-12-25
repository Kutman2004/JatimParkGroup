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

public class Desc1 extends Fragment
{
    Toolbar toolbardesc1;
    View Desc1;
    Button maps, home, fasilitas, wahana, desc, anggota;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Desc1 = inflater.inflate(R.layout.activity_deskripsi1, container, false);

        home = Desc1.findViewById(R.id.bthome);
        fasilitas = Desc1.findViewById(R.id.btfasilitas);
        wahana = Desc1.findViewById(R.id.btwahana);
        desc = Desc1.findViewById(R.id.btdesc);
        anggota = Desc1.findViewById(R.id.btanggota);
        toolbardesc1 = Desc1.findViewById(R.id.toolbar);

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

        toolbardesc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Desc1;
    }
}
