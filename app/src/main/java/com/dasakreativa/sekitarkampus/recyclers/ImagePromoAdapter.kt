import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.dasakreativa.sekitarkampus.R

class ImagePromoAdapter(// Replace Integer with your actual data type
    private val imageList: IntArray
) :
    RecyclerView.Adapter<ImagePromoAdapter.ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val context = parent.context
        val view: View = LayoutInflater.from(context).inflate(R.layout.images_holder, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageResId = imageList[position]
        holder.imageView.setImageResource(imageResId)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView

        init {
            imageView = itemView.findViewById<ImageView>(R.id.imageView)
        }
    }
}