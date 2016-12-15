package net.devhack.danatrans.presentation.executor;

import android.os.Handler;
import android.os.Looper;

import net.devhack.danatrans.domain.executor.PostExecutionThread;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by ntdat on 12/14/16.
 */
@Singleton
public class UIThread implements PostExecutionThread {
    private final Handler mainHandler;

    @Inject
    public UIThread() {
        mainHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }

    @Override
    public void main(Runnable runnable) {
        mainHandler.post(runnable);
    }

    @Override
    public void main(Runnable runnable, long delayMillis) {
        mainHandler.postDelayed(runnable, delayMillis);
    }
}
