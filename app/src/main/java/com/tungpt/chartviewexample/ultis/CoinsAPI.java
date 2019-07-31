package com.tungpt.chartviewexample.ultis;

import com.tungpt.chartviewexample.model.Coin;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinsAPI {

    @GET("v1/ticker/")
    Call<List<Coin>> getCoins();
}
