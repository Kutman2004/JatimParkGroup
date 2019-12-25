package com.example.jatimparkgroup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class WahanaAdapter2 extends RecyclerView.Adapter<WahanaAdapter2.MyViewHolder> {

    private List<Wahanamodel2> mWahana2;
    private Context mContext;

    public WahanaAdapter2(List<Wahanamodel2> wahanaList, Context context) {
        mWahana2 = wahanaList;
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list_item_wahana2,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Wahanamodel2 temp = mWahana2.get(position);
        holder.textView.setText(mWahana2.get(position).getText());
        holder.textView2.setText(mWahana2.get(position).getTitle());
        Glide.with(mContext).load(temp.getImageId()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mWahana2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView, textView2;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_wahana);
            textView2 = itemView.findViewById(R.id.tv_title_wahana);
            textView = itemView.findViewById(R.id.tv_wahana);
        }
    }
}
