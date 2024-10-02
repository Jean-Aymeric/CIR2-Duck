package duck;

import duck.behaviorsing.BehaviorSing;

public interface IDuck {
    void sing();

    BehaviorSing getBehaviorSing();


    void setBehaviorSing(final BehaviorSing behaviorSing);


}
