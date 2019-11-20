package com.cbnu.sjy_.util;

import android.view.View;

import androidx.databinding.BindingAdapter;

/**
 * @author : Sangji Lee
 * @when : 2019-11-17 오후 7:16
 * @homepage : https://github.com/sangji11
 */
public class Binder {
//커스텀 뷰 어트리뷰트를 관리하기 위한 클래스

    @BindingAdapter("onViewCreate")
    public static void onViewCreate(View view, View.OnClickListener listener) {
        if (view != null) listener.onClick(view);
    } // 뷰가 인플레이트 되자마자 실행하는 액션임
}