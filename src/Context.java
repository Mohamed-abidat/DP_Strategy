public class Context {

    private IStrategy strategy;

    public Context() {
        this.strategy = new DefaultStrategyImpl();
    }

    public void process(){
        System.out.println("Step 1");
        strategy.applyStrategy();
        System.out.println("Final step");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
