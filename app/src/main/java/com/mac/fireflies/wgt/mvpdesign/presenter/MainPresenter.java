package com.mac.fireflies.wgt.mvpdesign.presenter;

import com.mac.fireflies.wgt.mvpdesign.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public class MainPresenter implements MainMvpPresenter{
    MainView mainView;

    @Override
    public void loadData() {
        mainView.showProgress();
        String fakeData = "FireFlies";
        mainView.showText(fakeData);
    }

    @Override
    public void attachView(MainView mainView) {

    }

    @Override
    public void detachView() {

    }
}
