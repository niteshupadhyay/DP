package net.media.training.designpattern.template;

/**
 * Created by nitesh.u on 20/07/17.
 */
public class ShipTemplate {

    private final Screen screen;
    private final Game game;
    private final ShipType shipType;
    private double health = 100;
    private int armor = 5;
    private int engineHealth = 5;
    private int reactorHealth = 5;

    ShipTemplate(Screen screen, Game game,)
   checkFrigate();
   checkDestroyer();

    public  final void onHit(int impact) {

        checkFrigate();
        commonFunction();
           commonFunction();
            animation.render(screen);
        } else if (shipType == ShipType.Destroyer) {
            health -= impact * 1.2;
            if (impact > 15)
                reactorHealth -= 1;

          commonFunction();
        }
    }
}
