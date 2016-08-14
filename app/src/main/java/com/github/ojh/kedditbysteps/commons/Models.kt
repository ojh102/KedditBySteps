package com.github.ojh.kedditbysteps.commons

import com.github.ojh.kedditbysteps.commons.adapter.AdapterConstants
import com.github.ojh.kedditbysteps.commons.adapter.ViewType

/**
 * Created by 01071724654 on 2016-08-13.
 */
data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}
