package com.mac.fireflies.wgt.mvpdesign.presenter;

import com.mac.fireflies.wgt.mvpdesign.model.Text;
import com.mac.fireflies.wgt.mvpdesign.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public class HomePresenterImplt implements MainPresenter {
    MainView mainView;

    @Override
    public void loadData() {
        mainView.showProgress();
        try {
            Text text = new Text();
            text.setText("FireFlies");
            mainView.showText(text.getText());
        } catch (Exception e) {
            mainView.showError(e.getMessage());
        }
        mainView.hideProgress();
    }

    @Override
    public void attachView(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void detachView() {
        mainView = null;
    }
}
