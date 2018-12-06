package com.myapp.myapp.activity;

import android.widget.TextView;
import com.library.library.base.Activity;
import com.myapp.myapp.R;
import com.myapp.myapp.present.MainContract;
import com.myapp.myapp.present.impl.MainPresent;

import java.util.HashMap;

public class MainActivity extends Activity<MainContract.Present> implements MainContract.View {

    private MainContract.Present mMainPresenter;
    private TextView mTvTitle;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        mTvTitle = findViewById(R.id.mtv_title);
    }

    @Override
    public MainContract.Present getBasePresenter() {
        return new MainPresent(this, this);
    }


    @Override
    public void requestNet() {
        HashMap<String, String> paramsMap = new HashMap<>();
        HashMap<String, String> headerMap = new HashMap<>();
        mMainPresenter.requestNet(paramsMap, headerMap);
    }


    @Override
    public void refreshData(Object data) {
        // TODO: 2017/12/5 处理接口返回数据 此处用假数据
        // 调用present处理文本刷新功能
        mMainPresenter.changeData(""+data);
    }

    @Override
    public void setPresenter(MainContract.Present presenter) {
        mMainPresenter = presenter;
    }


    @Override
    public void showData(Object data) {
        // 处理view回填数据
        mTvTitle.setText(""+data);
    }
}
