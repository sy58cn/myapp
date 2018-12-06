package com.myapp.myapp.present.impl;

import android.content.Context;
import com.library.library.present.BasePresenter;
import com.myapp.myapp.present.MainContract;

import java.util.HashMap;

public class MainPresent extends BasePresenter<MainContract.View> implements MainContract.Present {

    private final Context mContext;
    private final MainContract.View mRootView;

    public MainPresent(Context context, MainContract.View view) {
        super(context, view);
        mContext = context;
        mRootView = getRootView();
    }

    @Override
    public void requestNet(HashMap<String, String> paramsMap, HashMap<String, String> headerMap) {
        mRootView.refreshData("11111111111111");
    }

    @Override
    public void changeData(Object data) {
        // 对数据进行逻辑操作
        String s = data + "满意请点赞，谢谢大家";
        mRootView.showData(s);
    }
}

