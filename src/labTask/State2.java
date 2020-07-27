package labTask;

public class State2 extends State {
	public State enter()
	{
		System.out.println("I am in State2");
		return new State2();
	}
	
	public void Opertaion2(StateMachineContext context)
	{
		context.setCurrentState(new State3().enter(context));
	}
}
