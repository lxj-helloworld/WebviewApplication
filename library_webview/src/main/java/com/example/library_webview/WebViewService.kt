package com.example.library_webview

import android.content.Context
import android.content.Intent
import com.example.library_common.IWebViewService
import com.google.auto.service.AutoService

/**
 * 项目名称 WebviewApplication
 * 创建人 xiaojinli
 * 创建时间 7/4/21 1:33 AM
 *
 **/
@AutoService(IWebViewService::class)
class WebViewService : IWebViewService{
    override fun startWebViewActivity(
        context: Context?,
        url: String?,
        title: String?,
        isShowActionBar: Boolean
    ) {
        if (context != null) {
            val intent = Intent(context, MyWebViewActivity::class.java)
            intent.putExtra(Constants.TITLE, title)
            intent.putExtra(Constants.URL, url)
            intent.putExtra(Constants.IS_SHOW_ACTION_BAR, isShowActionBar)
            context.startActivity(intent)
        }
    }
}