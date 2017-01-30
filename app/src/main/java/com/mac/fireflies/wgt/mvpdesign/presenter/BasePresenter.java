package com.mac.fireflies.wgt.mvpdesign.presenter;

import com.mac.fireflies.wgt.mvpdesign.view.BaseView;

/**
 * Created by User on 11/22/2016.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V v);
    void detachView();
}
