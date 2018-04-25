package com.ui.welcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.C;
import com.base.BaseActivity;
import com.model.TimelineRet;
import com.ui.main.R;
import com.ui.main.databinding.ActivityFeedbackBinding;
import com.ui.main.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends BaseActivity<WelcomePresenter, ActivityWelcomeBinding> implements View.OnClickListener, WelcomeContract.View {


    @Override
    public void onClick(View v) {

    }
    public void getHomeweibo(View v) {
        mPresenter.statuses_home_timeline(C.ACCESS_TOKEN);
    }
    public void getUserweibo(View v) {
        mPresenter.statuses_user_timeline(C.ACCESS_TOKEN);
    }

    @Override
    public void showStatuses(TimelineRet ret) {
        System.out.print(ret.toString());
    }

    @Override
    public void showMsg(String msg) {
        System.out.print(msg);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    public void initView() {

    }
}
