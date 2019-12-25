package com.example.jatimparkgroup;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Home extends Fragment {

    View Home;
    Toolbar toolbar;
    ImageView img1, img2, img3;
    GoogleSignInClient mGoogleSignInClient;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Home = inflater.inflate(R.layout.activity_home, container, false);

        img1 = Home.findViewById(R.id.jtp1);
        img2 = Home.findViewById(R.id.jtp2);
        img3 = Home.findViewById(R.id.jtp3);
        toolbar = Home.findViewById(R.id.toolbar);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Homejtp1 hjtp1 = new Homejtp1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, hjtp1);
                ft.commit();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Homejtp2 hjtp2 = new Homejtp2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, hjtp2);
                ft.commit();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Homejtp3 hjtp3 = new Homejtp3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, hjtp3);
                ft.commit();
            }
        });

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Login lg = new Login();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, lg);
                ft.commit();
            }
        });

        return Home;
    }
    private void setToolbar() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        // ...
                    }
                });
    }
}