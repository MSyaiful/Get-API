package com.msyaiful.webservice.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.msyaiful.webservice.R;
import com.msyaiful.webservice.model.EventPast;

import java.util.ArrayList;

public class MatchAdapter extends RecyclerView.Adapter<MatchHolder> {
    ArrayList<EventPast>eventPasts = new ArrayList<>();
    @NonNull
    @Override
    public MatchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match, parent, false);
        return new MatchHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchHolder holder, int position) {
        holder.bindItem(eventPasts.get(position));
    }

    @Override
    public int getItemCount() {
        return eventPasts.size();
    }

    public void setEventPasts(ArrayList<EventPast> eventPasts) {
        this.eventPasts = eventPasts;
    }
}
