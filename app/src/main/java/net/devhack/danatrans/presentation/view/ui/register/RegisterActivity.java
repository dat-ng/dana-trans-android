package net.devhack.danatrans.presentation.view.ui.register;


import android.os.Bundle;

import net.devhack.danatrans.R;
import net.devhack.danatrans.presentation.presenter.RegisterPresenter;
import net.devhack.danatrans.presentation.view.ui.BaseActivity;

import javax.inject.Inject;

public class RegisterActivity extends BaseActivity {

    @Inject RegisterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
        this.presenter.setView(this);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_register;
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
