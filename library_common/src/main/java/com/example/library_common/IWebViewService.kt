package com.example.library_common

import android.content.Context

/**
 * 项目名称 WebviewApplication
 * 创建人 xiaojinli
 * 创建时间 7/4/21 12:54 AM
 *
 **/
interface IWebViewService {
    fun startWebViewActivity(
        context: Context?,
        url: String?,
        title: String?,
        isShowActionBar: Boolean
    )
}