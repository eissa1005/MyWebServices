package com.example.eissa.mywebservices.api.PresentPlayers;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by EISSA on 17/12/2017.
 */

public  class PresentPlayer {

    static final String BASE_URL="http://localhost:53754/Api/Players";

    static Retrofit retrofit;

    public static Retrofit getData(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
