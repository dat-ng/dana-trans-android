package net.devhack.danatrans.presentation.view.ui;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.devhack.danatrans.DanaTransApplication;
import net.devhack.danatrans.presentation.di.component.ApplicationComponent;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by ntdat on 12/15/16.
 */

public abstract class BaseFragment extends Fragment implements IView {

    protected abstract @LayoutRes int getLayoutResource();

    private Unbinder unbinder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResource(), container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void displayError(String message) {

    }

    @Override
    public void displayLoading() {

    }

    @Override
    public void hideLoading() {

    }

    protected ApplicationComponent getApplicationComponent() {
        return ((DanaTransApplication) getActivity().getApplication()).getApplicationComponent();
    }
}
