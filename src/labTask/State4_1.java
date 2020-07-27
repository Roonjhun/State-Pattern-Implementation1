package labTask;

public class State4_1 extends State3 {

	public State enter(StateMachineContext context)
	{
		System.out.println("I am in State4_1");
		return this;
	}
	
	public void exit(State prev)
	{
		super.exit(prev);
	}
	
	public void Opertaion4(StateMachineContext context)
	{
		exit(this);
		context.getCurrentState().CurrentStatesRegion[0] = new State4_2().enter(context);
	}
}
