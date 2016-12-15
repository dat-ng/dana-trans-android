package net.devhack.danatrans;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import net.devhack.danatrans.presentation.di.component.DaggerApplicationComponent;
import net.devhack.danatrans.presentation.di.component.ApplicationComponent;
import net.devhack.danatrans.presentation.di.module.ApplicationModule;

/**
 * Created by ntdat on 12/14/16.
 */

public class DanaTransApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
