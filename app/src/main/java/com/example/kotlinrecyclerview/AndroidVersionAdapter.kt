package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.version_list.view.*

class AndroidVersionAdapter(private val androidVersionList : List<AndroidVersion>) : RecyclerView.Adapter<AndroidVersionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.version_list,parent,false)
        )
    }

    override fun getItemCount() = androidVersionList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listPosition = androidVersionList[position]
        holder.view.versionImage.setImageResource(listPosition.imgId)
        holder.view.versionName.text = listPosition.version_name
    }

    class ViewHolder(val view : View) : RecyclerView.ViewHolder(view)
}