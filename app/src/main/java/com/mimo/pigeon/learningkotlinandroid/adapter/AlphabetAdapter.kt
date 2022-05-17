package com.mimo.pigeon.learningkotlinandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mimo.pigeon.learningkotlinandroid.R

class AlphabetAdapter(private var dataSet: ArrayList<String>) : RecyclerView.Adapter<AlphabetAdapter.AlphabetViewModel>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlphabetViewModel {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_abjad_row, parent, false)
        return AlphabetViewModel(view)
    }

    override fun onBindViewHolder(holder: AlphabetViewModel, position: Int) {
        val data = dataSet[position]
        holder.title.text = data
        holder.remove.setOnClickListener {
            removeDataSet(position)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    fun addDataSet(newData: String) {
        dataSet.add("${newData} #${dataSet.size}")
        notifyDataSetChanged()
    }

    fun updateDataSet(updateData: String){
        dataSet.set(1, updateData)
        notifyDataSetChanged()
    }

    private fun removeDataSet(pos: Int){
        dataSet.removeAt(pos)
        notifyDataSetChanged()
    }

    class AlphabetViewModel(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView
        val remove: TextView
        init {
            title = itemView.findViewById(R.id.item_title)
            remove = itemView.findViewById(R.id.item_delete)
        }
    }
}