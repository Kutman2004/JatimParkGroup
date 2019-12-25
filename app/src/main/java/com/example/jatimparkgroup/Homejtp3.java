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

public class Homejtp3 extends Fragment
{
    View Homejtp3;
    Toolbar toolbarjtp3;
    Button maps, home, fasilitas, wahana, desc, anggota;
    ImageView icon2;
    TextView title;
    Intent i;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Homejtp3 = inflater.inflate(R.layout.activity_homejtp3, container, false);

        maps = Homejtp3.findViewById(R.id.btn_maps);
        home = Homejtp3.findViewById(R.id.bthome);
        fasilitas = Homejtp3.findViewById(R.id.btfasilitas);
        wahana = Homejtp3.findViewById(R.id.btwahana);
        desc = Homejtp3.findViewById(R.id.btdesc);
        anggota = Homejtp3.findViewById(R.id.btanggota);
        icon2 = Homejtp3.findViewById(R.id.gbbagong);
        title = Homejtp3.findViewById(R.id.titlemus);
        toolbarjtp3 = Homejtp3.findViewById(R.id.toolbar);
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

        toolbarjtp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login wh = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, wh);
                ft.commit();
            }
        });

        return Homejtp3;
    }
}
