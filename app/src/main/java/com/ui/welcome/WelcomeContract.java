package com.ui.welcome;

import com.base.BasePresenter;
import com.base.BaseView;
import com.base.adapter.AdapterPresenter;
import com.model.TimelineRet;
import com.model._User;

import java.io.File;

/**
 * Created by baixiaokang on 16/5/5.
 */
public interface WelcomeContract {

    interface View extends BaseView {
        void showStatuses(TimelineRet ret);
        void showMsg(String msg);

    }

    abstract class Presenter extends BasePresenter<View> {

        public abstract void statuses_home_timeline( String  access_token) ;

        public abstract void statuses_user_timeline(String  access_token) ;


    }
}
