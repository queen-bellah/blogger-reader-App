package com.akirackix.bloggerreader

import Article
import ArticleAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirackix.bloggerreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecycler.layoutManager=LinearLayoutManager(this)
        displayArticles()

    }
    fun displayArticles(){
        val item=Article("Trevor","2034","Day in time","1212","https://github.com/")
        val item1=Article("Trevor","2034","Day in time","1212","https://github.com/")
        val item2=Article("Trevor","2034","Day in time","1212","https://github.com/")
        val item3=Article("Trevor","2034","Day in time","1212","https://github.com/")
        val item4=Article("Trevor","2034","Day in time","1212","https://github.com/")
        val item5=Article("Trevor","2034","Day in time","1212","https://github.com/")

        val article= listOf(item,item1,item2,item3,item4,item5)
        val articleAdapter=ArticleAdapter(article)
        binding.rvRecycler.adapter=articleAdapter
    }
}