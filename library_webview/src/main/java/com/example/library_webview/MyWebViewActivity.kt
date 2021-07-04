package com.example.library_webview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.library_webview.databinding.ActivityMyWebViewBinding

class MyWebViewActivity : AppCompatActivity() {


    private var mBinding:ActivityMyWebViewBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_my_web_view)
//        mBinding.title.setText(intent.getStringExtra(Constants.TITLE))
        mBinding?.webview?.getSettings()?.setJavaScriptEnabled(true)
        intent.getStringExtra(Constants.URL)?.let { mBinding?.webview?.loadUrl(it) }
//        mBinding.actionBar.setVisibility(
//            if (intent.getBooleanExtra(
//                    Constants.IS_SHOW_ACTION_BAR,
//                    true
//                )
//            ) View.VISIBLE else View.GONE
//        )
//        mBinding.back.setOnClickListener(View.OnClickListener { this@MyWebViewActivity.finish() })
    }
}