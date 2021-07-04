package com.example.library_webview

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.library_webview.databinding.FragmentMyWebViewBinding

private const val MURL = "url"

/**
 * A simple [Fragment] subclass.
 * Use the [MyWebViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyWebViewFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var mUrl: String? = null
    private var mBinding:FragmentMyWebViewBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            mUrl = it.getString(MURL)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_my_web_view, container, false)
        mBinding?.webview?.getSettings()?.setJavaScriptEnabled(true)
        mUrl?.let { mBinding?.webview?.loadUrl(it) }
        return mBinding!!.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MyWebViewFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String) =
            MyWebViewFragment().apply {
                arguments = Bundle().apply {
                    putString(MURL, param1)
                }
            }
    }
}