package com.example.jatimparkgroup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import java.util.List;

public class FasilitasAdapter1 extends RecyclerView.Adapter<FasilitasAdapter1.MyViewHolder> {

    private List<Fasilitasmodel1> mFasilitas;
    private Context mContext;

    public FasilitasAdapter1(List<Fasilitasmodel1> fasilitasList, Context context) {
        mFasilitas = fasilitasList;
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list_item_fasilitas,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Fasilitasmodel1 temp = mFasilitas.get(position);
        Glide.with(mContext).load(temp.getImageId()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mFasilitas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_fasilitas);
        }
    }
}
