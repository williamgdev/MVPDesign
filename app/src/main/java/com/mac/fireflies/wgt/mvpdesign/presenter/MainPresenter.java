package com.mac.fireflies.wgt.mvpdesign.presenter;

import com.mac.fireflies.wgt.mvpdesign.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public interface MainPresenter extends BasePresenter<MainView> {
    void loadData();
}
