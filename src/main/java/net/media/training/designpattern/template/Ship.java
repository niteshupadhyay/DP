package net.media.training.designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 7:59:51 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ship {
    private final Screen screen;
    private final Game game;
    protected double health = 100;


    public Ship(Screen screen, Game game) {
        this.screen = screen;
        this.game = game;

    }


    abstract void calculateHelth(int impact);

    abstract Animation getexplordAnimation();

    abstract Animation getSinkAnimation();

    abstract boolean checkHealth();

    public void onHit(int impact) {
       calculateHelth(impact);

        Animation animation = null;

        if (checkHealth()) {
            animation = getSinkAnimation();
            game.notifyShipLost(this);
        } else {
            animation = getexplordAnimation();
        }

        animation.render(screen);

    }
}
