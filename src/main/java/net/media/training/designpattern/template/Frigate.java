package net.media.training.designpattern.template;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class Frigate extends  Ship{
    private int armor = 5;
    private int engineHealth = 5;

    public Frigate(Screen screen, Game game) {
        super(screen, game);
    }

    void calculateHelth(int impact) {
        health -= (armor > 0 ? 1 : impact * 2.5);
        if (impact > 5 && armor <= 0)
            engineHealth -= 1;
        if (armor > 0)
            armor -= 1;
    }

    Animation getexplordAnimation() {
        return new ExplodeFrigateAnimation();
    }

    Animation getSinkAnimation() {
        return new SinkFrigateAnimation();
    }

    boolean checkHealth() {
        return health <= 0 || engineHealth <= 0;
    }
}
