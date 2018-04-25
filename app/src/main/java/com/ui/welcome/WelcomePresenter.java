package com.ui.welcome;

import com.C;
import com.DbFactory;
import com.EventTags;
import com.app.annotation.apt.InstanceFactory;
import com.app.annotation.javassist.Bus;
import com.app.annotation.javassist.BusRegister;
import com.app.annotation.javassist.BusUnRegister;
import com.apt.ApiFactory;
import com.base.adapter.AdapterPresenter;
import com.base.entity.Face;
import com.base.entity.Pointer;
import com.base.event.OkBus;
import com.base.util.ApiUtil;
import com.base.util.SpUtil;
import com.google.gson.Gson;
import com.model.Message;
import com.model.TimelineRet;
import com.model._User;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.RequestBody;

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
        ApiFactory.statuses_home_timeline(C.ACCESS_TOKEN).subscribe(
                res -> mView.showStatuses(res),
                e -> mView.showMsg(e.getMessage())
        );
    }

    @Override
    public void statuses_user_timeline(String  access_token) {
        ApiFactory.statuses_user_timeline(C.ACCESS_TOKEN).subscribe(
                res -> mView.showStatuses(res),
                e -> mView.showMsg(e.getMessage())
        );
    }
}
