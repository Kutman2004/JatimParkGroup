package com.example.jatimparkgroup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Homejtp2 extends Fragment
{
    View Homejtp2;
    Toolbar toolbarjtp2;
    Button maps, home, fasilitas, wahana, desc, anggota;
    ImageView icon2;
    TextView title;
    Intent i;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Homejtp2 = inflater.inflate(R.layout.activity_homejtp2, container, false);

        maps = Homejtp2.findViewById(R.id.btn_maps);
        home = Homejtp2.findViewById(R.id.bthome);
        fasilitas = Homejtp2.findViewById(R.id.btfasilitas);
        wahana = Homejtp2.findViewById(R.id.btwahana);
        desc = Homejtp2.findViewById(R.id.btdesc);
        anggota = Homejtp2.findViewById(R.id.btanggota);
        icon2 = Homejtp2.findViewById(R.id.gbbagong);
        title = Homejtp2.findViewById(R.id.titlemus);
        toolbarjtp2 = Homejtp2.findViewById(R.id.toolbar);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/KZ4ovExZTcv"));
                startActivity(i);
            }
        });

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

        toolbarjtp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login wh = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, wh);
                ft.commit();
            }
        });

        return Homejtp2;
    }
}
