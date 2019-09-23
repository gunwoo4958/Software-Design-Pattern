package hansung.designpatterns.state.gumballstatewinner;

public class OutOfGumballsState implements State {
    GumballMachine gumballMachine;

    public OutOfGumballsState(GumballMachine gumballMachine){this.gumballMachine = gumballMachine;}

    @Override
    public void insertQuarter() {
        System.out.println("Wait for refilling gumballs...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Wait for refilling gumballs...");
    }

    @Override
    public void turnCrank() {
        System.out.println("Wait for refilling gumballs...");
    }

    @Override
    public void dispense() {
        gumballMachine.refill(10);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
