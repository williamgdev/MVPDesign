package com.mac.fireflies.wgt.mvpdesign.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mac.fireflies.wgt.mvpdesign.R;
import com.mac.fireflies.wgt.mvpdesign.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {
    MainPresenter mainPresenter;
    private ProgressBar progressBar;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);

        progressBar = (ProgressBar) findViewById(R.id.main_progress);
        textView = (TextView) findViewById(R.id.main_text);


    }

    @Override
    public void showText(String text) {
        textView.setText(text);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        mainPresenter.loadData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mainPresenter != null)
            mainPresenter.detachView();
    }
}
