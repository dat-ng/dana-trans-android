package net.devhack.danatrans.presentation.presenter;

import android.Manifest;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import net.devhack.danatrans.presentation.navigation.Navigator;
import net.devhack.danatrans.presentation.view.ui.IView;
import net.devhack.danatrans.presentation.view.ui.permission.PermissionsActivity;

import javax.inject.Inject;

/**
 * Created by ntdat on 12/15/16.
 */

public class PermissionsPresenter implements IPresenter {

    PermissionsActivity activity;
    private Navigator navigator;

    private static final String TAG = "PermissionsPresenter";

    @Inject
    public PermissionsPresenter(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public void setView(@NonNull IView view) {
        this.activity = (PermissionsActivity) view;
    }

    @Override
    public void onResume() {
        navigate();
    }

    @Override
    public void onPause() {

    }

    private void navigate() {
        boolean locationPermissionGranted = (ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) == 0);
        if (locationPermissionGranted) {
            navigator.navigateToHome(activity);
        }
    }
}
