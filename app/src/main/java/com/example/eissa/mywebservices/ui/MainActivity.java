package com.example.eissa.mywebservices.ui;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.eissa.mywebservices.R;
import com.example.eissa.mywebservices.api.PresentPlayers.PresentPlayer;
import com.example.eissa.mywebservices.api.adapter.AdapterPlayers;
import com.example.eissa.mywebservices.api.model.Players;
import com.example.eissa.mywebservices.api.service.IRPlayers;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static android.support.v7.widget.RecyclerView.*;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LayoutManager layoutManager;
    List<Players> lstPlayers;
    PresentPlayer present;
    AdapterPlayers adapterPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        present = new PresentPlayer();

        IRPlayers irPlayers=PresentPlayer.getData().create(IRPlayers.class);
        Call<List<Players>> call =irPlayers.GetPlayers();
        call.enqueue(new Callback<List<Players>>() {
            @Override
            public void onResponse(Call<List<Players>> call, Response<List<Players>> response) {
                lstPlayers = response.body();
                adapterPlayers = new AdapterPlayers(getApplicationContext(),lstPlayers);
                recyclerView.setAdapter(adapterPlayers);
            }

            @Override
            public void onFailure(Call<List<Players>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }



}
