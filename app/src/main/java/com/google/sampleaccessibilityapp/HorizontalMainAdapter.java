package com.google.sampleaccessibilityapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.google.sampleaccessibilityapp.databinding.ListItemSampleBinding;

/**
 * Created by Umur Kaya on 2019-07-06.
 * Copyright (c) 2016 - 2019 Piri Guide. All rights reserved.
 */

public class HorizontalMainAdapter extends RecyclerView.Adapter<HorizontalMainAdapter.ItemViewHolder> {

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ItemViewHolder(ListItemSampleBinding.inflate(LayoutInflater.from(viewGroup.getContext()),viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        ListItemSampleBinding binding;
        ItemViewHolder(ListItemSampleBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
