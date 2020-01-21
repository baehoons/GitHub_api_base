package com.example.github_api

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.github_api.data.GithubRepo
import kotlinx.android.synthetic.main.recyclerview_row.view.*

class RecyclerAdapter :RecyclerView.Adapter<RecyclerAdapter.ViewHolders>(){

    private val githubRepos:ArrayList<GithubRepo> = ArrayList()

    inner class ViewHolders(itemView: View):RecyclerView.ViewHolder(itemView) {
        var id:TextView = itemView.mID
        var name: TextView = itemView.mName
        var url: TextView = itemView.mUrl
        var date: TextView = itemView.mDate
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolders {
        return ViewHolders(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recyclerview_row,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return githubRepos.size
    }

    override fun onBindViewHolder(p0: ViewHolders, p1: Int) {
        p0.id.text = githubRepos[p1].id
        p0.name.text = githubRepos[p1].name
        p0.url.text = githubRepos[p1].url
        p0.date.text = githubRepos[p1].date
    }

    fun update(githubRepos:ArrayList<GithubRepo>){
        this.githubRepos.clear()
        this.githubRepos.addAll(githubRepos)
        notifyDataSetChanged()
    }

}