package com.dasakreativa.sekitarkampus.recyclers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.dasakreativa.sekitarkampus.R

/**
 * Adapter for displaying a list of images in a RecyclerView.
 *
 * @param ctx The context.
 * @param images An array of resource IDs representing the images to be displayed.
 */
internal class ImagePromoAdapter(private val ctx: Context, private val images: IntArray) :
    RecyclerView.Adapter<ImagePromoAdapter.ViewHolder>() {

    /**
     * Creates and returns a ViewHolder for the view.
     *
     * @param parent The parent view group.
     * @param viewType The type of the view.
     * @return A ViewHolder for the view.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.images_holder, parent, false)
        return ViewHolder(view)
    }

    /**
     * Binds the data to the ViewHolder.
     *
     * @param holder The ViewHolder to bind the data to.
     * @param position The position of the item in the data set.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Set the images in ImageView
        holder.images.setImageResource(images[position])
    }

    /**
     * Gets the number of items in the data set.
     *
     * @return The number of items in the data set.
     */
    override fun getItemCount(): Int {
        return images.size
    }

    /**
     * ViewHolder class for holding the view components.
     *
     * @param itemView The view for the ViewHolder.
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var images: ImageView

        init {
            images = itemView.findViewById(R.id.images)
        }
    }
}
