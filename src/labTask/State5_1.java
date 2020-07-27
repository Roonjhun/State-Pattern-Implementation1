package labTask;

public class State5_1 extends State3 {
	public State enter(StateMachineContext context)
	{
		System.out.println("I am in State5_1");
		return new State5_1();
	}
	
	public void Operation5(StateMachineContext context) throws Exception
	{
		context.getCurrentState().CurrentStatesRegion[1] = new State5_2().enter(context);
	}
}
