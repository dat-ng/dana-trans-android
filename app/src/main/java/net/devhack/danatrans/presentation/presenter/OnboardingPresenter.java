package net.devhack.danatrans.presentation.presenter;

import android.support.annotation.NonNull;

import net.devhack.danatrans.presentation.navigation.Navigator;
import net.devhack.danatrans.presentation.view.ui.IView;
import net.devhack.danatrans.presentation.view.ui.onboarding.OnboardingActivity;

import javax.inject.Inject;

/**
 * Created by ntdat on 12/15/16.
 */

public class OnboardingPresenter implements IPresenter {

    OnboardingActivity activity;
    Navigator navigator;

    @Inject
    public OnboardingPresenter(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public void setView(@NonNull IView view) {
        this.activity = (OnboardingActivity) view;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }
}
