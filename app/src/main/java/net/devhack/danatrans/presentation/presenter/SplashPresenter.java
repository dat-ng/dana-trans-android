package net.devhack.danatrans.presentation.presenter;

import android.support.annotation.NonNull;

import net.devhack.danatrans.domain.executor.PostExecutionThread;
import net.devhack.danatrans.domain.repository.DanaTransSettingsRepository;
import net.devhack.danatrans.presentation.navigation.Navigator;
import net.devhack.danatrans.presentation.view.ui.IView;
import net.devhack.danatrans.presentation.view.ui.splash.SplashActivity;

import javax.inject.Inject;

/**
 * Created by ntdat on 12/15/16.
 */

public class SplashPresenter implements IPresenter {
    private SplashActivity activity;
    private Navigator navigator;
    private PostExecutionThread postExecutionThread;
    private DanaTransSettingsRepository danaTransSettings;

    private static final int SPLASH_DISPLAY_LENGTH = 1000;

    @Inject
    public SplashPresenter(Navigator navigator,
                           PostExecutionThread postExecutionThread,
                           DanaTransSettingsRepository danaTransSettings) {
        this.navigator = navigator;
        this.postExecutionThread = postExecutionThread;
        this.danaTransSettings = danaTransSettings;
    }

    @Override
    public void setView(@NonNull IView view) {
        this.activity = (SplashActivity) view;
        this.navigate();
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    private void navigate() {
//        this.postExecutionThread.main(() -> {
//            if (danaTransSettings.isFirstTime()) {
//                navigator.navigateToOnboarding(activity);
//            } else {
////                if (sojoRegistration.isProfileCreated()) {
////                    if (locationHelper.isLocationPermissionGranted()) {
////                        this.navigator.navigateToHome(this.activity);
////                    } else {
////                        this.navigator.navigateToPermissionChecking(this.activity);
////                    }
////                } else {
////                    this.navigator.navigateToRegister(this.activity);
////                }
//            }
//            this.activity.finish();
//        }, SPLASH_DISPLAY_LENGTH);
    }
}
