package labTask;

import static org.junit.Assert.*;

import org.junit.*;

public class TestFile {

	@Test
	public void CorrectStateTest1() throws Exception {
		StateMachineContext sm = new StateMachineContext();
		sm.Opertaion1();
		sm.Opertaion3();
		assertEquals("State2", sm.getCurrentState().getClass().getSimpleName());
	}

	@Test
	public void CorrectStateTest2() throws Exception {
		StateMachineContext sm = new StateMachineContext();
		sm.Opertaion1();
		sm.Opertaion4();
		sm.Operation5();
		sm.Operation6();
		sm.Opertaion3();
		sm.Opertaion2();
		assertEquals("State4_2", sm.getCurrentState().CurrentStatesRegion[0].getClass().getSimpleName());
		assertEquals("State5_1", sm.getCurrentState().CurrentStatesRegion[1].getClass().getSimpleName());
	}

	@Test
	public void CorrectStateTest3() throws Exception {
		StateMachineContext sm = new StateMachineContext();
		sm.Opertaion1();
		sm.Operation5();
		sm.Operation7();
		sm.Opertaion3();
		sm.Opertaion2();
		assertEquals("State4_1", sm.getCurrentState().CurrentStatesRegion[0].getClass().getSimpleName());
		assertEquals("State5_1", sm.getCurrentState().CurrentStatesRegion[1].getClass().getSimpleName());
	}

	@Test
	public void CorrectStateTest4() throws Exception {
		StateMachineContext sm = new StateMachineContext();
		sm.Opertaion1();
		sm.Opertaion3();
		sm.Opertaion2();
		sm.Operation5();
		assertEquals("State4_1", sm.getCurrentState().CurrentStatesRegion[0].getClass().getSimpleName());
		assertEquals("State5_2", sm.getCurrentState().CurrentStatesRegion[1].getClass().getSimpleName());
	}

	@Test
	public void CorrectStateTest5() throws Exception {
		StateMachineContext sm = new StateMachineContext();
		try {
			sm.Opertaion1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Opertaion3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Opertaion2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Operation6();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Opertaion3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Opertaion2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Operation5();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Opertaion4();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sm.Operation6();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(null, sm.getCurrentState().CurrentStatesRegion[0]);
		assertEquals("State5_2", sm.getCurrentState().CurrentStatesRegion[1].getClass().getSimpleName());
	}
	
	@Test
	public void BehaviorAllowedTest1() throws Exception {
		String exception = "";
		StateMachineContext sm = new StateMachineContext();
		try {
		sm.Opertaion1();
		sm.Opertaion3();
		sm.Operation5();
		} catch (Exception e) {
			exception = e.getMessage();
		}
		assertEquals("not Allowed", exception);
	}
}
