package duck;

import duck.behaviorsing.BehaviorSing;

public abstract class Duck implements IDuck {
    private BehaviorSing behaviorSing;

    public Duck(final BehaviorSing behaviorSing) {
        this.behaviorSing = behaviorSing;
    }

    public BehaviorSing getBehaviorSing() {
        return this.behaviorSing;
    }

    public void setBehaviorSing(final BehaviorSing behaviorSing) {
        this.behaviorSing = behaviorSing;
    }

    @Override
    public void sing() {
        this.behaviorSing.sing();

    }
}
