package net.media.training.designpattern.observer;

/**
 * Created by nitesh.u on 20/07/17.
 */
public abstract class Observer {
    protected SunSubject mySun;
    protected boolean outdoors;
    protected boolean feelingWarm;
    protected boolean feelingTired;

    public boolean isFeelingTired() {
        return feelingTired;
    }

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public void goOutdoors() {
        mySun.registerObserver(this);
        outdoors = true;
    }

    public void goIndoors() {
        mySun.removeObserver(this);
        outdoors = false;
    }

    public boolean isOutdoors() {
        return outdoors;
    }

    public void notifySunSet() {
        feelingWarm = false;
        if (outdoors) feelingTired = true;
    }

    public void notifySunRise() {
        feelingWarm = true;
    }
}
