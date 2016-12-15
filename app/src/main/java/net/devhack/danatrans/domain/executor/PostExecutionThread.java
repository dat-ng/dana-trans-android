package net.devhack.danatrans.domain.executor;

import rx.Scheduler;

/**
 * Created by ntdat on 12/14/16.
 */

public interface PostExecutionThread {
    Scheduler getScheduler();

    void main(Runnable runnable);

    void main(Runnable runnable, long delayMillis);
}
