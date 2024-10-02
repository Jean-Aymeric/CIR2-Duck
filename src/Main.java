import duck.GreenNeck;
import duck.IDuck;
import duck.PlasticDuck;
import duck.SwedishBlueDuck;
import duck.behaviorsing.CoiinCoiin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IDuck> ducks = new ArrayList<>();
        ducks.add(new PlasticDuck());
        ducks.add(new SwedishBlueDuck());
        ducks.add(new GreenNeck());
        ducks.get(1).setBehaviorSing(ducks.get(0).getBehaviorSing());
        ducks.get(2).setBehaviorSing(new CoiinCoiin());
        for (IDuck duck : ducks) {
            duck.sing();
        }

    }
}