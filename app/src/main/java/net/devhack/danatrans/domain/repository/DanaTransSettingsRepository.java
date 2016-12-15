package net.devhack.danatrans.domain.repository;

/**
 * Created by ntdat on 12/15/16.
 */

public interface DanaTransSettingsRepository {

    int DEFAULT = 0;
    int ALLOWED = 1;
    int DENIED = 2;

    boolean isFirstTime();

    void setFirstTime(boolean isFirst);

    void reset();
}
