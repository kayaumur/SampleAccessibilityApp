package com.google.sampleaccessibilityapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.google.sampleaccessibilityapp.databinding.HolderHorizontalBinding;

/**
 * Created by Umur Kaya on 2019-07-06.
 * Copyright (c) 2016 - 2019 Piri Guide. All rights reserved.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.HorizontalViewHolder> {

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HorizontalViewHolder(HolderHorizontalBinding.inflate(LayoutInflater.from(viewGroup.getContext()),viewGroup,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder horizontalViewHolder, int i) {
        horizontalViewHolder.binding.horizontalRV.setAdapter(new HorizontalMainAdapter());
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder{
        HolderHorizontalBinding binding;
        HorizontalViewHolder(HolderHorizontalBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
