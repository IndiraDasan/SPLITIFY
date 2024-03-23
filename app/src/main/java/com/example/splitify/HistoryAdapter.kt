package com.example.splitify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.historylayout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class

        // sets the text to the textview from our itemHolder class
        holder.item.text = ItemsViewModel.item
        holder.price.text = ItemsViewModel.price
        holder.paid.text = ItemsViewModel.paidby

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val item: TextView = itemView.findViewById(R.id.itemvalue)
        val price: TextView = itemView.findViewById(R.id.pricevalue)
        val paid: TextView = itemView.findViewById(R.id.paidvalue)
    }
}
