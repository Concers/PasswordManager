package com.ovologos.passwordmanager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ovologos.passwordmanager.mock.DataModel

class PasswordAdapter(private val passwordModelList: List<DataModel>) :
    RecyclerView.Adapter<PasswordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasswordViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.fragment_listpassword, parent, false)
        return PasswordViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PasswordViewHolder, position: Int) {


        val itemList = passwordModelList[position]
        holder.bind(itemList)
    }

    override fun getItemCount(): Int {
        return passwordModelList.size
    }
}