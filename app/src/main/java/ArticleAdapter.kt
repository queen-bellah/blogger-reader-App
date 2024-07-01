import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirackix.bloggerreader.R

class ArticleAdapter(val article: List<Article>):RecyclerView.Adapter<ArticleHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.post_list_item,parent,false)
        return ArticleHolder(itemView)
    }


    override fun getItemCount(): Int {
        return article.size
    }


    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        val article=article[position]
        holder.tvName.text=article.name
        holder.tvPublish.text=article.publish
        holder.tvPreview.text=article.preview
        holder.tvTittle.text=article.tittle
        holder.tvLink.text=article.link

    }
}
class ArticleHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val tvName=itemView.findViewById<TextView>(R.id.tvName)
    val tvPublish=itemView.findViewById<TextView>(R.id.tvPublish)
    val tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
    val tvTittle=itemView.findViewById<TextView>(R.id.tvTittle)
    val tvLink=itemView.findViewById<TextView>(R.id.tvLink)
}