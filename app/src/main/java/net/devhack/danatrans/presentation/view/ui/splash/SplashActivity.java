package net.devhack.danatrans.presentation.view.ui.splash;

import android.os.Bundle;

import net.devhack.danatrans.R;
import net.devhack.danatrans.presentation.presenter.SplashPresenter;
import net.devhack.danatrans.presentation.view.ui.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity {

    @Inject SplashPresenter presenter;

    @Override protected int getLayoutResource() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getApplicationComponent().inject(this);
        this.presenter.setView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }
}
