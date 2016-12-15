package net.devhack.danatrans.presentation.navigation;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;

import net.devhack.danatrans.presentation.view.ui.home.HomeActivity;
import net.devhack.danatrans.presentation.view.ui.onboarding.OnboardingActivity;
import net.devhack.danatrans.presentation.view.ui.permission.PermissionsActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by ntdat on 12/15/16.
 */
@Singleton
public class Navigator {

    @Inject
    public Navigator() {

    }

    public void navigateToOnboarding(Activity activity) {
        Intent intent = new Intent(activity, OnboardingActivity.class);
        ActivityCompat.startActivity(activity, intent, null);
    }

    public void navigateToPermissionChecking(Activity activity) {
        Intent intent = new Intent(activity, PermissionsActivity.class);
        ActivityCompat.startActivity(activity, intent, null);
    }

    public void navigateToHome(Activity activity) {
        Intent intent = new Intent(activity, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        ActivityCompat.startActivity(activity, intent, null);
    }
}
