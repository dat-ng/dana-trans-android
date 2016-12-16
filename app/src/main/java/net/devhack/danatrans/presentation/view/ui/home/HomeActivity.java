package net.devhack.danatrans.presentation.view.ui.home;

import android.os.Bundle;

import com.mapbox.mapboxsdk.MapboxAccountManager;
import com.mapbox.mapboxsdk.maps.MapView;

import net.devhack.danatrans.BuildConfig;
import net.devhack.danatrans.R;
import net.devhack.danatrans.presentation.presenter.HomePresenter;
import net.devhack.danatrans.presentation.view.ui.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;

public class HomeActivity extends BaseActivity {

    @Inject HomePresenter presenter;
    @BindView(R.id.mapview) MapView mapView;

    @Override protected int getLayoutResource() {
        return R.layout.activity_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapboxAccountManager.start(this, BuildConfig.MAPBOX_TOKEN);
        this.getApplicationComponent().inject(this);
        this.presenter.setView(this);
        mapView.onCreate(savedInstanceState);

        // Add a MapboxMap
        mapView.getMapAsync(mapboxMap -> {});
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
        presenter.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }
}
