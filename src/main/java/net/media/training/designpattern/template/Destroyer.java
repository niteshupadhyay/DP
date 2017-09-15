package net.media.training.designpattern.template;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class Destroyer extends Ship{
    private int reactorHealth = 5;


    public Destroyer(Screen screen, Game game) {
        super(screen, game);
    }

    void calculateHelth(int impact) {
        health -= impact * 1.2;
        if (impact > 15)
            reactorHealth -= 1;
    }

    Animation getexplordAnimation() {
        return new ExplodeDestroyerAnimation();
    }

    Animation getSinkAnimation() {
        return new SinkDestroyerAnimation();
    }

    boolean checkHealth() {
        return health <= 0 || reactorHealth <= 0;
    }
}
