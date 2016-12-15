package net.devhack.danatrans.presentation.di.module;

import android.content.Context;

import net.devhack.danatrans.data.executor.JobExecutor;
import net.devhack.danatrans.data.repository.DanaTransSettingsPreferenceRepository;
import net.devhack.danatrans.domain.executor.PostExecutionThread;
import net.devhack.danatrans.domain.executor.ThreadExecutor;
import net.devhack.danatrans.domain.repository.DanaTransSettingsRepository;
import net.devhack.danatrans.presentation.executor.UIThread;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ntdat on 12/14/16.
 */
@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context provideApplicationContext() {
        return this.context;
    }

    @Provides
    @Singleton
    public ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides
    @Singleton
    public PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }

    @Provides
    @Singleton
    public DanaTransSettingsRepository danaTransSettingsRepository(DanaTransSettingsPreferenceRepository preferencesRepository) {
        return preferencesRepository;
    }
}
