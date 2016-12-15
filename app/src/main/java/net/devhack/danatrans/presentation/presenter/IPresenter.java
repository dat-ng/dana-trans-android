package net.devhack.danatrans.presentation.presenter;

import android.support.annotation.NonNull;

import net.devhack.danatrans.presentation.view.ui.IView;

/**
 * Created by ntdat on 12/15/16.
 */

public interface IPresenter {
    void setView(@NonNull IView view);

    void onResume();

    void onPause();
}
