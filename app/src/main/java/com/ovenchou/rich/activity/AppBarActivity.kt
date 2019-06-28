package com.ovenchou.rich.activity

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v7.app.AppCompatActivity
import com.ovenchou.rich.R
import kotlinx.android.synthetic.main.appbar_avtivity_layout.*

/**
 * description: androidBase
 * Created by xm zhoupan on 2019/6/24.
 */
class AppBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.appbar_avtivity_layout)

        app_bar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            motion_layout.progress = -verticalOffset / appBarLayout.totalScrollRange.toFloat()
        })
    }

    fun initView() {
//        handler?.postDelayed({
//            ToastUtils.showLongSafe("123213113")
//            group.visibility = View.GONE
//        }, 1000)
    }


}