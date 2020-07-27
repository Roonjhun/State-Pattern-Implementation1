package labTask;

public class StateMachineContext {
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public StateMachineContext() {
		currentState = new State1();
	}

	public void Opertaion1() throws Exception {
		currentState.Opertaion1(this);
	}

	public void Opertaion2() throws Exception {
		currentState.Opertaion2(this);
	}

	public void Opertaion3() throws Exception {
		currentState.Opertaion3(this);
	}

	public void Opertaion4() throws Exception {
		if (currentState instanceof State3)
			currentState.CurrentStatesRegion[0].Opertaion4(this);
		else
			throw new Exception("not Allowed");
	}

	public void Operation5() throws Exception {
		if (currentState instanceof State3)
			currentState.CurrentStatesRegion[1].Operation5(this);
		else
			throw new Exception("not Allowed");
	}

	public void Operation6() throws Exception {
		if (currentState instanceof State3)
			currentState.CurrentStatesRegion[0].Operation6(this);
		else
			throw new Exception("not Allowed");
	}

	public void Operation7() throws Exception {
		if (currentState instanceof State3)
			currentState.CurrentStatesRegion[1].Operation7(this);
		else
			throw new Exception("not Allowed");
	}
	
	public void OperationExit() throws Exception {
		if (currentState instanceof State2) {
			System.out.println("Final state acheived");
			System.exit(0);
		} else {
			throw new Exception("Not allowed to exit.");
		}
	}
}
