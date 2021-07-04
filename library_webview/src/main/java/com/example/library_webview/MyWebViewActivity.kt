package com.example.library_webview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.library_webview.databinding.ActivityMyWebViewBinding

class MyWebViewActivity : AppCompatActivity() {


    private var mBinding:ActivityMyWebViewBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_my_web_view)
        val bundle = bundleOf("url" to "https://www.baidu.com")
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<MyWebViewFragment>(R.id.fragment, args = bundle)
        }

    }
}