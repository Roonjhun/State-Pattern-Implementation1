package labTask;

public class State5_2 extends State3 {
	public State enter(StateMachineContext context)
	{
		System.out.println("I am in State5_2");
		return new State5_2();
	}
	
	public void Operation7(StateMachineContext context) throws Exception{
		history = null;
		context.getCurrentState().CurrentStatesRegion[1] = null;
		System.out.println("Final state of Region 2 reached.");
	}
}
