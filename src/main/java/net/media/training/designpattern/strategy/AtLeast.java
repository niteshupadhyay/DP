package net.media.training.designpattern.strategy;

/**
 * Created by nitesh.u on 19/07/17.
 */
public class AtLeast implements CheckStrategy{

        public void check(int val, int min) {
            if (val < min)
                throw new RuntimeException("at least check failed:" + val);
        }

}
