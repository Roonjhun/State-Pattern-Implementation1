package labTask;

public abstract class State {
	
	protected static State history;
	State[] CurrentStatesRegion = new State[2];
	
	public State enter(StateMachineContext context)
	{
		return null;
	}
	
	public void exit(State prev){
	}

	public void Opertaion1(StateMachineContext context) throws Exception
	{
		throw new Exception("not Allowed");
	}
	public void Opertaion2(StateMachineContext context) throws Exception
	{
		throw new Exception("not Allowed");
	}
	public void Opertaion3(StateMachineContext context) throws Exception
	{
		throw new Exception("not Allowed");
	}
	public void Opertaion4(StateMachineContext context) throws Exception
	{
		throw new Exception("not Allowed");
	}
	public void Operation5(StateMachineContext context) throws Exception {
		throw new Exception("not Allowed");
	}
	public void Operation6(StateMachineContext context) throws Exception {
		throw new Exception("not Allowed");
	}
	public void Operation7(StateMachineContext context) throws Exception {
		throw new Exception("not Allowed");
	}
}
