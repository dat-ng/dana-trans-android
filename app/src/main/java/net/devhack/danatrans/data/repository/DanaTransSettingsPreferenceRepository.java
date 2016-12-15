package net.devhack.danatrans.data.repository;

import android.content.Context;
import android.content.SharedPreferences;

import net.devhack.danatrans.domain.repository.DanaTransSettingsRepository;

import javax.inject.Inject;

/**
 * Created by ntdat on 12/15/16.
 */

public class DanaTransSettingsPreferenceRepository implements DanaTransSettingsRepository {

    private static final String PREFERENCES_FILE = "dana_trans";
    private static final String FIRST_TIME = "first_time";

    private SharedPreferences preferences;

    @Inject
    DanaTransSettingsPreferenceRepository(Context context) {
        this.preferences = context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
    }

    @Override
    public boolean isFirstTime() {
        return this.preferences.getBoolean(FIRST_TIME, true);
    }

    @Override
    public void setFirstTime(boolean isFirstTime) {
        this.preferences.edit().putBoolean(FIRST_TIME, isFirstTime).apply();
    }

    @Override
    public void reset() {
        this.preferences.edit().clear().commit();
    }
}
