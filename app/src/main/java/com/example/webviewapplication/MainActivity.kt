package com.example.webviewapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.library_common.IWebViewService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val webviewService: IWebViewService? = MyServiceLoader.load(IWebViewService::class.java)
        if (webviewService != null) {
            webviewService.startWebViewActivity(
                this@MainActivity,
                "https://www.baidu.com",
                "百度",
                false
            )
        }
    }
}