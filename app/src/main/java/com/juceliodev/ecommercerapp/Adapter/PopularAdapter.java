package com.juceliodev.ecommercerapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.juceliodev.ecommercerapp.databinding.ViewholderPupListBinding;
import com.juceliodev.ecommercerapp.domain.PopularDomain;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    ArrayList<PopularDomain> items;
    Context context;
    ViewholderPupListBinding binding;

    public PopularAdapter(ArrayList<PopularDomain> items){
        this.items=items;
    }

    @NonNull
    @Override
    public PopularAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ViewholderPupListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ViewHolder holder, int position) {
     binding.titleTxt.setText(items.get(position).getTitle());
     binding.feeTxt.setText("$"+ items.get(position).getPrice());
     binding.scoreTxt.setText(""+items.get(position).getScore());

     int drawableResource=holder.itemView.getResources().getIdentifier(items.get(position)
             .getPicUrl(),"drawable",holder.itemView.getContext().getPackageName());


        Glide.with(context)
                .load(drawableResource)
                .transform(new GranularRoundedCorners(30,30,0,0))
                .into(binding.pic);

        holder.itemView.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void  onClick(View v){

            }


        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {
        public ViewHolder(ViewholderPupListBinding binding) {
            super(binding.getRoot());
        }
    }
}
