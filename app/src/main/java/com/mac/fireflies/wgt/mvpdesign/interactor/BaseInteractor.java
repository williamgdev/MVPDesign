package com.mac.fireflies.wgt.mvpdesign.interactor;

public interface BaseInteractor {
    void findTexts(OnFinishedListener listener);

    interface OnFinishedListener {
        void onFinished(String texts);
    }
}
