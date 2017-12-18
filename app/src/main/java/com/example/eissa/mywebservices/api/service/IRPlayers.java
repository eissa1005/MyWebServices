package com.example.eissa.mywebservices.api.service;

import com.example.eissa.mywebservices.api.model.Players;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by EISSA on 17/12/2017.
 */

public interface IRPlayers {

    @GET("")
    Call<List<Players>> GetPlayers();
}
