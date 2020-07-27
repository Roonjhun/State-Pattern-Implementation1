package labTask;

public class State1 extends State {
	public State enter()
	{
		System.out.println("I am in State1");
		return new State1();
	}
	
	public void Opertaion1(StateMachineContext context) throws Exception
	{
		context.setCurrentState(new State3().enter(context));
	}
}
