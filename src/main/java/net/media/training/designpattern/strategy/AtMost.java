package net.media.training.designpattern.strategy;

/**
 * Created by nitesh.u on 19/07/17.
 */
public class AtMost implements CheckStrategy{
    public void check(int val, int max){
        if (val > max)
            throw new RuntimeException("at least check failed:" + val);
    }

}
