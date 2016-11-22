package com.mac.fireflies.wgt.mvpdesign;

/**
 * Created by User on 11/22/2016.
 */

public interface BaseView {
    void showProgress();
    void hideProgress();
    void showError(String error);
}
