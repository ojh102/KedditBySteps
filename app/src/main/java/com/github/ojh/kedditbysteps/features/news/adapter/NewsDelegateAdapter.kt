package com.github.ojh.kedditbysteps.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.github.ojh.kedditbysteps.R
import com.github.ojh.kedditbysteps.commons.RedditNewsItem
import com.github.ojh.kedditbysteps.commons.adapter.ViewType
import com.github.ojh.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import com.github.ojh.kedditbysteps.commons.extensions.getFriendlyTime
import com.github.ojh.kedditbysteps.commons.extensions.inflate
import com.github.ojh.kedditbysteps.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by 01071724654 on 2016-08-13.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {

            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}

