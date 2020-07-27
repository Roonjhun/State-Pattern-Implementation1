package labTask;

public class State4_2 extends State3 {

	public State enter(StateMachineContext context) {
		System.out.println("I am in State4_2");
		return this;
	}
	
	public void exit(State prev)
	{
		super.exit(prev);
	}
		
	public void Operation6(StateMachineContext context) throws Exception {
		history = null;
		context.getCurrentState().CurrentStatesRegion[0] = null;
		System.out.println("Final State of Region1 reached");
	}
	
}
