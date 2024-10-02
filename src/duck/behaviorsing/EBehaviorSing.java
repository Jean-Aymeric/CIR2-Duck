package duck.behaviorsing;

public enum EBehaviorSing implements BehaviorSing {
    COINCOIN(new CoinCoin()),
    COIINCOIIN(new CoiinCoiin()),
    POUETPOUET(new PouetPouet());

    private BehaviorSing behaviorSing;

    EBehaviorSing(final BehaviorSing behaviorSing) {
        this.behaviorSing = behaviorSing;
    }

    @Override
    public void sing() {
        this.behaviorSing.sing();
    }
}
