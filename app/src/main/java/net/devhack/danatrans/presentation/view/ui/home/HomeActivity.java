package net.devhack.danatrans.presentation.view.ui.home;

import android.os.Bundle;
import net.devhack.danatrans.R;
import net.devhack.danatrans.presentation.presenter.HomePresenter;
import net.devhack.danatrans.presentation.view.ui.BaseActivity;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity {

    @Inject HomePresenter presenter;

    @Override protected int getLayoutResource() {
        return R.layout.activity_home;
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
