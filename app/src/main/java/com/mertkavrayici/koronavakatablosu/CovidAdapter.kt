package com.mertkavrayici.koronavakatablosu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class CovidAdapter(private val covidList:ArrayList<CovidModel>): RecyclerView.Adapter<CovidAdapter.RowHolder>() {


    class RowHolder(view:View):RecyclerView.ViewHolder(view) {

        fun bind(covidModel: CovidModel){

            itemView.totalTestResults.text=covidModel.totalTestResults
            itemView.positive.text=covidModel.positive

            itemView.death.text=covidModel.death
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return RowHolder(view)
    }

    override fun getItemCount(): Int {
        return  covidList.count()
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
       holder.bind(covidList[position])
    }
}


