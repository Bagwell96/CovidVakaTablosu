package com.mertkavrayici.koronavakatablosu

import android.telecom.Call
import retrofit2.http.GET

interface Api {

    @GET("v1/us/daily.json")

    fun getData():retrofit2.Call<List<CovidModel>>

}