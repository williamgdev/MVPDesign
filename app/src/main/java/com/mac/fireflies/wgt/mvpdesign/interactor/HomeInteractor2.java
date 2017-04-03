package com.mac.fireflies.wgt.mvpdesign.interactor;

import android.os.Handler;

import com.mac.fireflies.wgt.mvpdesign.model.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeInteractor2 implements BaseInteractor {
    @Override
    public void findTexts(final OnFinishedListener listener) {
        /**
         * Do something and after that send the listener the data
         */
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                listener.onFinished(createTextList());
            }
        }, 2000);
    }

    private String createTextList() {
        StringBuffer textList = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            textList.append(new Text("Text " + i));
        }
        return textList.toString();
    }

}
