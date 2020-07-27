package labTask;

public class State3 extends State {

	public void init(StateMachineContext context) {
		if (context.getCurrentState() instanceof State1) {
			System.out.println("I am in ComplexState3 going to initial state");
			CurrentStatesRegion[0] = new State4_1().enter(context); // When 1st time Composite State 3 is entered.
			CurrentStatesRegion[1] = new State5_1().enter(context); // Lower region with default initial state
		}
		else if (history != null) {
			System.out.println("I am going to history " + history.getClass().getSimpleName());
			CurrentStatesRegion[0] = history.enter(context); // When history exist.
			System.out.println("I am going to initial state of lower region ");
			CurrentStatesRegion[1] = new State5_1().enter(context);
		} else {
			System.out.println("I am going to default history ");
			CurrentStatesRegion[0] = new State4_2().enter(context); // When there is no history then default history is
																// considered.
			System.out.println("I am going to initial state of lower region ");
			CurrentStatesRegion[1] = new State5_1().enter(context);
		}
	}

	public State enter(StateMachineContext context) {
		init(context);
		return this;
	}

	public void exit(State prev) {
		history = prev;
	}

	public void Opertaion3(StateMachineContext context) throws Exception {
		exit(CurrentStatesRegion[0]);
		context.setCurrentState(new State2().enter());
	}
}
