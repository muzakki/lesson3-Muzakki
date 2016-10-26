package com.example.aye.parsingdata.rest;

/**
 * Created by aye on 10/26/2016.
 */

import com.example.aye.parsingdata.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("pajak-kendaraan")
    Call<Example> getPajakKendaraan(@Query("kode") String kode, @Query("nomor") String nomor, @Query("seri") String seri);
}