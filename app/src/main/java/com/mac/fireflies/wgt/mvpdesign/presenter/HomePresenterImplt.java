package com.mac.fireflies.wgt.mvpdesign.presenter;

import com.mac.fireflies.wgt.mvpdesign.interactor.HomeInteractor;
import com.mac.fireflies.wgt.mvpdesign.model.Text;
import com.mac.fireflies.wgt.mvpdesign.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public class HomePresenterImplt implements MainPresenter, HomeInteractor.OnFinishedListener {
    MainView mainView;
    private HomeInteractor interactor;

    public HomePresenterImplt(MainView mainView, HomeInteractor interactor) {
        this.mainView = mainView;
        this.interactor = interactor;
    }

    @Override
    public void loadData() {
        mainView.showProgress();
        try {
            Text text = new Text("FireFlies");
            mainView.showText(text.getText());
            interactor.findTexts(this);
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

    @Override
    public void onFinished(String texts) {
        mainView.showText(texts);
    }
}
