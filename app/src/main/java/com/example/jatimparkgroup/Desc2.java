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

public class Desc2 extends Fragment
{
    Toolbar toolbardesc2;
    View Desc2;
    Button maps, home, fasilitas, wahana, desc, anggota;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Desc2 = inflater.inflate(R.layout.activity_deskripsi2, container, false);

        home = Desc2.findViewById(R.id.bthome);
        fasilitas = Desc2.findViewById(R.id.btfasilitas);
        wahana = Desc2.findViewById(R.id.btwahana);
        desc = Desc2.findViewById(R.id.btdesc);
        anggota = Desc2.findViewById(R.id.btanggota);
        toolbardesc2 = Desc2.findViewById(R.id.toolbar);

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

        toolbardesc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login ang = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, ang);
                ft.commit();
            }
        });

        return Desc2;
    }
}
