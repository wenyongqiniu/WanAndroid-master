package com.android.mykotlinandroid.utils

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

/**
 * author : zf
 * date   : 2019/10/28
 * You are the best.
 */
class NoScrollViewPage(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {

    /* 是否禁止滑动  false禁止 */
    private var Scroll = false

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return if (!Scroll)
            false
        else
            super.onTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return if (!Scroll)
            false
        else
            super.onInterceptTouchEvent(ev)
    }
}