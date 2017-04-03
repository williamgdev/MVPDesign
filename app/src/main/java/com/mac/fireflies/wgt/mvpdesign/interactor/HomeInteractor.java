package com.mac.fireflies.wgt.mvpdesign.interactor;

import android.os.Handler;

import com.mac.fireflies.wgt.mvpdesign.model.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeInteractor implements BaseInteractor {
    @Override
    public void findTexts(final OnFinishedListener listener) {
        /**
         * Do something and after that send the listener the data
         */
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                listener.onFinished(createArrayList().toString());
            }
        }, 2000);
    }

    private List<Text> createArrayList() {
        List<Text> textList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            textList.add(new Text("Text " + i));
        }
        return textList;
    }

}
