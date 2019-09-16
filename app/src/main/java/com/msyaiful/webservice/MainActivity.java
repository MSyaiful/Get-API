package com.msyaiful.webservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.msyaiful.webservice.adapter.MatchAdapter;
import com.msyaiful.webservice.model.EventPast;
import com.msyaiful.webservice.presenter.EventPastContract;
import com.msyaiful.webservice.presenter.EventPastPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements EventPastContract {
    ArrayList<EventPast>eventPass = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventPastPresenter eventPastPresenter = new EventPastPresenter(this);
        eventPastPresenter.index();
    }

    @Override
    public void listMatch(ArrayList<EventPast> eventPasts) {
        MatchAdapter matchAdapter = new MatchAdapter();
        eventPass.addAll(eventPasts);
        matchAdapter.setEventPasts(eventPass);
        RecyclerView recyclerView = findViewById(R.id.rv_match);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(matchAdapter);
    }
}
