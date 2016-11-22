package com.mac.fireflies.wgt.mvpdesign;

/**
 * Created by User on 11/22/2016.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V v);
    void detachView();
}
