package com.github.ojh.kedditbysteps.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by 01071724654 on 2016-08-13.
 */
interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}