package com.github.ojh.kedditbysteps.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.github.ojh.kedditbysteps.R
import com.github.ojh.kedditbysteps.commons.adapter.ViewType
import com.github.ojh.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import com.github.ojh.kedditbysteps.commons.extensions.inflate

/**
 * Created by 01071724654 on 2016-08-13.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
            LoadingViewHolder(parent)


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}

