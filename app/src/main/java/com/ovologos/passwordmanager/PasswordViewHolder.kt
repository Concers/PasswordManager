package com.ovologos.passwordmanager

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ovologos.passwordmanager.mock.DataModel

class PasswordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun bind(model: DataModel) {

        val icon = itemView.findViewById<ImageView>(R.id.drawble)
        icon.setImageResource(model.icon)


        val email = itemView.findViewById<TextView>(R.id.email)
        email.text = model.email

        val name = itemView.findViewById<TextView>(R.id.name)
        name.text = model.name

        val password = itemView.findViewById<TextView>(R.id.password)
        password.text = model.password


    }
}