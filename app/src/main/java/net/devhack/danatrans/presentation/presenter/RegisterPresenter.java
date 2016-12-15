package net.devhack.danatrans.presentation.presenter;

import android.support.annotation.NonNull;

import net.devhack.danatrans.presentation.navigation.Navigator;
import net.devhack.danatrans.presentation.view.ui.IView;
import net.devhack.danatrans.presentation.view.ui.register.RegisterActivity;

import javax.inject.Inject;

/**
 * Created by ntdat on 12/15/16.
 */

public class RegisterPresenter implements IPresenter {

    RegisterActivity activity;
    Navigator navigator;

    @Inject
    public RegisterPresenter(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public void setView(@NonNull IView view) {
        activity = (RegisterActivity) view;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }
}
