package net.devhack.danatrans.presentation.di.component;

import net.devhack.danatrans.presentation.di.module.ApplicationModule;
import net.devhack.danatrans.presentation.view.ui.home.HomeActivity;
import net.devhack.danatrans.presentation.view.ui.onboarding.OnboardingActivity;
import net.devhack.danatrans.presentation.view.ui.permission.PermissionsActivity;
import net.devhack.danatrans.presentation.view.ui.register.RegisterActivity;
import net.devhack.danatrans.presentation.view.ui.splash.SplashActivity;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by ntdat on 12/14/16.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(SplashActivity splashActivity);

    void inject(HomeActivity homeActivity);

    void inject(OnboardingActivity onboardingActivity);

    void inject(PermissionsActivity permissionsActivity);

    void inject(RegisterActivity registerActivity);
}
