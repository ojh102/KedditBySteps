@file:JvmName("ExtensionsUtils")

package com.github.ojh.kedditbysteps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by 01071724654 on 2016-08-12.
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}