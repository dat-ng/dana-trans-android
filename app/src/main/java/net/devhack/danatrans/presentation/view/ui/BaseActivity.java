package net.devhack.danatrans.presentation.view.ui;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import net.devhack.danatrans.DanaTransApplication;
import net.devhack.danatrans.presentation.di.component.ApplicationComponent;
import butterknife.ButterKnife;

/**
 * Created by ntdat on 12/14/16.
 */

public abstract class BaseActivity extends AppCompatActivity implements IView {

    protected abstract @LayoutRes int getLayoutResource();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        ButterKnife.bind(this);
    }

    @Override
    public void displayError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void displayLoading() {

    }

    @Override
    public void hideLoading() {

    }

    protected ApplicationComponent getApplicationComponent() {
        return ((DanaTransApplication) getApplication()).getApplicationComponent();
    }
}
