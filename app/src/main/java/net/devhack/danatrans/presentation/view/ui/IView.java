package net.devhack.danatrans.presentation.view.ui;

/**
 * Created by ntdat on 12/14/16.
 */

public interface IView {
    void displayError(String message);

    void displayLoading();

    void hideLoading();
}
