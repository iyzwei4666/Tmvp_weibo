package com.ui.welcome;

import com.app.annotation.apt.InstanceFactory;
import com.app.annotation.javassist.BusRegister;
import com.app.annotation.javassist.BusUnRegister;
import com.apt.ApiFactory;

/**
 * Created by baixiaokang on 16/5/5.
 */
@InstanceFactory
public class WelcomePresenter extends WelcomeContract.Presenter {

    @BusRegister
    public void onAttached() {

    }


    @BusUnRegister
    public void onDetached() {
        super.onDetached();
    }

    @Override
    public void statuses_home_timeline(String  access_token) {
        ApiFactory.statuses_home_timeline(access_token).subscribe(
                res -> mView.showStatuses(res),
                e -> mView.showMsg(e.getMessage())
        );
    }

    @Override
    public void statuses_user_timeline(String  access_token) {
        ApiFactory.statuses_user_timeline(access_token).subscribe(
                res -> mView.showStatuses(res),
                e -> mView.showMsg(e.getMessage())
        );
    }
}
