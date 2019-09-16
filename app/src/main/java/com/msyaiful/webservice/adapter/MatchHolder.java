package com.msyaiful.webservice.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.msyaiful.webservice.R;
import com.msyaiful.webservice.model.EventPast;

class MatchHolder extends RecyclerView.ViewHolder {
    TextView textViewHome;
    TextView textViewAway;
    public MatchHolder(@NonNull View itemView) {
        super(itemView);

        textViewHome = itemView.findViewById(R.id.tv_home);
        textViewAway = itemView.findViewById(R.id.tv_away);
    }

    public void bindItem(EventPast eventPast){

        textViewHome.setText(eventPast.getStrHomeTeam());
        textViewAway.setText(eventPast.getStrAwayTeam());
    }
}
