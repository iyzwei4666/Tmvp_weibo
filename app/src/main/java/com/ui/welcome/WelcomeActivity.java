package com.ui.welcome;

import android.view.View;

import com.C;
import com.base.BaseActivity;
import com.base.adapter.TRecyclerView;
import com.model.TimelineRet;
import com.ui.main.R;
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
    private TRecyclerView mXRecyclerView;
    @Override
    public void initView() {
        mXRecyclerView = new TRecyclerView(getBaseContext() ,true);
        mXRecyclerView.setViewType(R.layout.list_item_card_main);
    }
}
