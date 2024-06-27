package com.example.myblogassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogsAdapter(var contactsList: List<blog>): RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact=contactsList[position]
        holder.tvName.text=contact.name
      holder.

    }

}

class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvName: TextView =itemView.findViewById<TextView>(R.id.tvName)
    val tvPhone: TextView =itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    val tvEmail: TextView =itemView.findViewById<TextView>(R.id.tvEmail)
}