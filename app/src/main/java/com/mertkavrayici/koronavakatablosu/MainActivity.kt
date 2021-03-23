package com.mertkavrayici.koronavakatablosu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val  BASE_URL="https://api.covidtracking.com/"
    private var covidModels:ArrayList<CovidModel>?=null
    private var covidAdapter:CovidAdapter?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager:RecyclerView.LayoutManager=LinearLayoutManager(this)
        list.layoutManager=layoutManager

        loadData()
    }

    private fun loadData(){

        val retrofit=Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()

        val service=retrofit.create(Api::class.java)
        val call=service.getData()
        call.enqueue(object :Callback<List<CovidModel>>{
            override fun onFailure(call: Call<List<CovidModel>>, t: Throwable) {

                t.printStackTrace()
            }

            override fun onResponse(
                call: Call<List<CovidModel>>,
                response: Response<List<CovidModel>>
            ) {
               if(response.isSuccessful){

                   response.body()?.let {

                       covidModels=ArrayList(it)

                      covidAdapter=CovidAdapter(covidModels!!)
                       list.adapter=covidAdapter



                   }
               }
            }


        })
    }


}