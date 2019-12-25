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
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Map;

public class Homejtp1 extends Fragment
{
    View Homejtp1;
    Toolbar toolbarjtp1;
    Button maps, home, fasilitas, wahana, desc, anggota;
    ImageView icon2;
    TextView title;
    Intent i;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Homejtp1 = inflater.inflate(R.layout.activity_homejtp1, container, false);

        maps = Homejtp1.findViewById(R.id.btn_maps);
        home = Homejtp1.findViewById(R.id.bthome);
        fasilitas = Homejtp1.findViewById(R.id.btfasilitas);
        wahana = Homejtp1.findViewById(R.id.btwahana);
        desc = Homejtp1.findViewById(R.id.btdesc);
        anggota = Homejtp1.findViewById(R.id.btanggota);
        icon2 = Homejtp1.findViewById(R.id.gbbagong);
        title = Homejtp1.findViewById(R.id.titlemus);
        toolbarjtp1 = Homejtp1.findViewById(R.id.toolbar);
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

        toolbarjtp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login wh = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, wh);
                ft.commit();
            }
        });

        return Homejtp1;
    }
}
