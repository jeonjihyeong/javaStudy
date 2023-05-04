package com.example.recyclerviewexam01

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexam01.binding.ListItemBinding
import timber.log.Timber


class MessageAdapter(private var data: Array<Message>) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        //Log.d(TAG,"onCreateViewHolder() called")
        Timber.d("onCreateViewHolder() called")

        val binding =  ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MessageViewHolder(binding).also{viewHolder ->
            binding.cbConfirm.setOnCheckedChangeListener { buttonView, isChecked ->
                Timber.d("CheckBox[${viewHolder.layoutPosition}] checked: $isChecked")
                data.getOrNull(viewHolder.adapterPosition)?.confirm = isChecked
            }
        }
    }

    override fun getItemCount(): Int {
        Timber.d("getItemCount() ${data.size}")

        return data.size
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        Timber.d("onBindViewHolder() called")

        var itemData = data[position]

        holder.apply{
            setItems(itemData)
        }
    }

    inner class MessageViewHolder(private val binding: ListItemBinding): RecyclerViewviewHolder(binding.root){
        fun setItems(itemData: Message){
            binding.tvMessage.text = itemData.message
        }
    }
}