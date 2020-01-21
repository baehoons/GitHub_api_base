package com.example.github_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.github_api.data.GithubClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_enter.*

class EnterActivity : AppCompatActivity() {

    private var adapter :RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter

        val disposable  = GithubClient().getApi().getRepos(intent.extras?.get("owner").toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{items -> adapter.update(items)}
    }
}
